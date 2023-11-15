package practice.lincedList;

import java.util.Iterator;

public class NodeListImpl<E> implements NodeList<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(E element) { // добавляет элемент в список
        Node<E> newNode = new Node<>(last, element, null); // создаем новый следующий узел
        if (last != null) {
            last.next = newNode;// меняется некст сcылка
        } else {
            first = newNode; // если список был пустой, то новый создаваемый становится первым
        }
        last = newNode;
        size++;
        return true;
    } // узел новый следующий в конец списка

    @Override
    public void clear() {
        //todo
        Node<E> node = first; // временная переменная куказывающая на первый узел
        while (node != null) { // цикл выполняется до тех пот пока node не станет NULL
            Node<E> next = node.next; // переменная указывающая на следующий узел в цепочке, нужно для сохранения ссылки перед изменнеим текущего первого узла
            node.data = null; // обнуляем данные в узле
            node.next = null; // обнуляем сслыка на следующий элемент
            node.prev = null; // обнуляется ссылка на предыдущий элемент

            node = next; // перемещаемся к следующему узлу сохраненном в переменной next
        }
        first = last = null; // обнулятся ссылки на на первый и последние узлы
        size = 0; // устанавливаем размер списка на 0

        //todo for (Node<E> x = first; x != null; ) объясните этот синтаксис

    }

    @Override
    public boolean add(int index, E element) {
        if (index == size) { // добавление элемента в конец
            return add(element);
        }
        Node<E> node = getNodeByIndex(index); // берем узел по индексу
        Node<E> newNode = new Node<>(node.prev, element, node); // создаем новый узел в середину списка
        node.prev = newNode;
        if (index != 0) {
            newNode.prev.next = newNode;
        } else {
            first = newNode; // если ставим на первое место
        }
        size++;
        return true;
    }

    // todo разобраться как работаем метод
    private Node<E> getNodeByIndex(int index) {
        checkIndex(index);
        Node<E> node;
        if (index < size / 2) {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
        }
        return node;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lstIndexOf(Object o) {
        return 0;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
