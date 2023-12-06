package hashset;



import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class IHashSet<E> implements ISet<E> {

    // поля

    private LinkedList<E> [] hashset; // массив из связынх листов, т.е. каждый элемент массива это отдельный ЛинкедЛист который может содержать отдельные элементы

    private int size;
    private int capacity; // колличество ячеек
    private double loadFactor;// объекм загрузки этих ячеек

    public IHashSet(int capacity, double loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        hashset = new LinkedList[capacity];  // массив из ЛинкедЛистов
    }

    // в этом конмстрккторе можно определить свой Load Factor

    public IHashSet(int capacity){
        this(capacity, 0.75); // 0,75 - load Factor
    }
    // конструктор по умолчания
    public IHashSet(){
        this(16, 0.75); //по умолчанию так заздается Hash

    }

    @Override
    public boolean add(E element) {
        if(size >= capacity * loadFactor){
            rebuildArray();
        }
        int index = getIndex(element);
        if(hashset[index] == null){
            hashset[index] = new LinkedList<>();
        }
        if(hashset[index].contains(element)){
            return false; // следим за уникальностью элементов
        }
        hashset[index].add(element);
        size++;
        return true;
    }

    private void rebuildArray(){
        capacity = capacity * 2; // удвоили размер
        LinkedList<E>[] newHashSet = new LinkedList[capacity];
        // надо обежать весь hashSet, залезть в каждый его LinkedList, переложить элементы в новый
        for (int i = 0; i < hashset.length; i++) {
            if (hashset[i] != null){
                for (E e : hashset[i]) {
                    int index = getIndex(e);
                    if(newHashSet[index] == null){
                        newHashSet[index] = new LinkedList<>(); // создаем новый лист
                    }
                    newHashSet[index].add(e); // добавляем элемент в LinkedList
                }
            }
        }
        hashset = newHashSet; // переопределили ссылку, garbage collector очистит память
    }

    private int getIndex(E element) {
        int hashcode = element.hashCode();// вычисляем шешкод элемента множества
        hashcode = hashcode >= 0 ? hashcode : - hashcode;
        return hashcode % capacity; // делим с остатком
    }

    @Override
    public boolean contains(E element) {
        int index = getIndex(element);
        if(hashset[index] == null){
            return false;
        }
        return hashset[index].contains(element); // проверяем наличие элемента в цепочке
    }

    @Override
    public boolean remove(E element) {
        int index = getIndex(element);
        if(hashset[index] == null){
            return false;
        }
        boolean res = hashset[index].remove(element);
        if(res){
            size--;
        }
        return res;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {

        return new Iterator<E>() {
            int i;
            int j;
            int totalCounter;

            @Override
            public boolean hasNext() {
                return totalCounter < size;
            }

            @Override
            public E next() {
                while (hashset[i] == null || hashset[i].isEmpty()){   // если пусто движемся к следующему
                    i++;
                }
                E res = hashset[i].get(j);
                totalCounter++;
                if(j < hashset[i].size() - 1){ // находимся внутри Линкед листа
                    j++;

                } else {
                    j = 0;
                    i ++;
                }
                return res;
            }
        };
    }
}