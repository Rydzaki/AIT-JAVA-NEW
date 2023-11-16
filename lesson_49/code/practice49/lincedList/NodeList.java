package practice49.lincedList;

public interface NodeList<E> extends Iterable<E> {

    // пишим методы

   // default - сразу реализованный метод

    int size(); // возвращает размер листа

    default boolean isEmpty() {
        return size() == 0;
    }

    boolean add(E element); // добавление

    void clear(); // зачистка
    default boolean contains (Object o){
        return indexOf(o) >= 0; // есть ли такой объект в списке по индексу


    }

    default boolean remove(Object o){
        int index = indexOf(o);
        if(index < 0){
            return false;
        }
        remove(index);
        return true;
    }
    boolean add(int index, E element); //добавить на мето по индексу

    E get(int index); // получение элемента по индексу
    int indexOf(Object o); // удаление из узла по его номеру (индексу)
    int lstIndexOf(Object o);
    E remove(int index);
    E set(int index, E element);


}
