package practice.ilist;

// зададим абстрактные методы для работы со стуктурой данныз List (список чего-то)
// для любых типов данных, которые будут определены позже (String, StringBuilder, Employee, Car, Pet, Photo, Book...)

public interface Ilist<E> extends Iterable<E> {


    int size(); // узнать размер списка

    default boolean isEmpty() // если пустой то true
    {
        return size() == 0;
    }
    void clean(); // удалить все из списка

    boolean add(E element); // добавить элемент списка

    default boolean contains(E o) // есть ли элемент в списке
    {
        return indexOf(o) >= 0; // потому что ищем по индексу (-1 значит нет)
    }

    default boolean remove(Object o) // удалить элемент, если он есть (по индексу)
    {
        int index = indexOf(0);
        if(index < 0){
            return false;} // когда объекта нет в нашем списке

        remove(index); // удалили по индексу
        return true;
    }

    boolean add(int index, E element); // добавить (вставить) элемент по индексу

    E remove(int index); // удалить элемент из списка по индексу

    E get (int index); // получить элемент по его индексу

    E set (int index, E element); // обновить элемент в списке по его индексу

    int indexOf(Object o); // зная элемент, найти его индекс

    int lastIndexOf(Object o);// ищем индекс элемента с конца списка





}
