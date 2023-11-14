package practice_1411.ilist;

import java.util.Arrays;
import java.util.Iterator;

public class IlistImpl<E> implements Ilist<E> {

    // поля

    private Object[] elements; // массив для списка объектов
    private int size; // его размер


    // конструктор

    private IlistImpl (int initialCapacity) {
        if(initialCapacity < 0) {
            throw new IllegalArgumentException("Illigal capacity = " + initialCapacity);
        }
        elements = new  Object[initialCapacity];
    }
    public IlistImpl() {
        this(10);
    }



    @Override
    public int size() {
        return size;
    }

    @Override
    public void clean() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;

        }
        size = 0;

    }

    @Override
    public boolean add(E element) {
        ensureCapasity();

        elements[size++] = element;
        return true;
// O(n)
    }

    private void ensureCapasity() {
        if(size == elements.length) {
            if (size == Integer.MAX_VALUE) {
                throw new OutOfMemoryError(); // большего по размеру массива создать не можем сообщаем об это пользователю
            }
            int newCapacity = elements.length + elements.length / 2;
            // увеличили длинну в полтора раза

            if (newCapacity < 0) {
                newCapacity = Integer.MAX_VALUE;
            }
            elements = Arrays.copyOf(elements, newCapacity);
        } // O(n)
    }

    @Override
    public boolean add(int index, E element) {
        if(index == size){ // добавление в конец
            add(element);
            return true;

        }
        // добавление в середину списка по индексу
        checkIndex(index); // O(1)
        ensureCapasity(); // O(n)
        System.arraycopy(elements, index, elements, index+1, size++ - index);
        elements[index] = element;
        return true;
    }
        // O(n)
    private void checkIndex(int index) {
        if (index < 0 || index >= size){ // todo
            throw new IndexOutOfBoundsException(index);
        }
        // 0(n)
    }

    @Override
    public E remove(int index) {
        checkIndex((index));
        E el = (E) elements[index];
        System.arraycopy(elements, index+1, elements, index, --size - index);
        elements[size] = null; // зачемто затираем последний

        return el;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return (E) elements[index]; // кастинг к типу
    }

//    @Override
//    public Object set(int index, Object element) {
//        checkIndex(index);
//        E victim = (E) elements[index]; // нашли элемент по индексу
//        elements[index] = element;
//
//        return victim;
//    }

    @Override
    public E set(int index, E element) {
        checkIndex(index);
        E victim = (E) elements[index]; // нашли элемент по индексу
        elements[index] = element;

        return victim;
    }

    @Override
    public int indexOf(Object o) {
        if (o != null) { // когда объект не NULL
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return i;
                }
            }
        }
        else { // когда в листе есть объект  null
            for (int i = 0; i < size; i++) {
                if (null == (elements[i])) {
                    return i;
                }
            }
        }

            return -1;
        }


    @Override
    public int lastIndexOf(Object o) { // todo не находи первый слева элемент
        if (o != null) { // когда объект не NULL
            for (int i = size - 1; i >= 0; i--) {
                if (o.equals(elements[i])) {
                    return i;
                }
            }
        }
        else { // когда в листе есть объект  null
            for (int i = size - 1; i >= 0; i--) {
                if (null == (elements[i])) {
                    return i;
                }
            }
        }

        return -1;
    }

    @Override
    public Iterator<E> iterator() {


        return new Iterator<E>() {
            int i = 0; // с какого элемента начинается перебор
            @Override
            public boolean hasNext() {
                return i < size;
            }

            @Override
            public E next() {
                return (E) elements[i++];
            }
        };
    }
}
