package practice49.lincedList;

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
        Node<E> node = first; // временная переменная указывающая на первый узел
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
        Node<E> node = getNodeByIndex(index);
        return node.data;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0; // Начальный индекс, который будем увеличивать при проходе по узлам списка
        if (o != null) { // Если объект, который мы ищем, не является null
            for (Node<E> node = first; node != null; node = node.next, index++) {
                // Начиная с первого узла (first), идем по списку узлов до конца (node != null)
                // на каждом шаге переходим к следующему узлу (node = node.next)
                if (o.equals(node.data)) { // Сравниваем объект, который мы ищем (o), с данными текущего узла
                    return index; // Если объект найден, возвращаем его индекс
                }
            }
        } else {
            for (Node<E> node = first; node != null; node = node.next, index++) {
                // То же самое, что и выше, но в этом случае ищем null в списке
                if (o == node.data) { // Сравниваем объект с данными текущего узла, используя ==
                    return index; // Если null найден, возвращаем его индекс
                }
            }
        }
        return -1; // Если объект не найден в списке, возвращаем -1
    }

    @Override
    public int lstIndexOf(Object o) {
        return 0; // TODO развернуть проход по индексу
    }

    @Override
    public E remove(int index) {
        Node<E> node = getNodeByIndex(index);
        return unlink(node);
    }

    private E unlink(Node<E> node) {
        E victim = node.data;
        Node<E> prev = node.prev;
        Node<E> next = node.next;
        if (prev != null) {
            prev.next = next;
            node.prev = null;
        } else {
            first = next;
        }
        if (next != null) {
            next.prev = prev;
            node.next = null;
        } else {
            last = prev;
        }
        node.data = null;
        size--;
        return victim;
    }

    @Override
    public E set(int index, E element) {
        Node<E> node = getNodeByIndex(index); // нашли узел по индексу
        E victim = node.data;
        node.data = element; // обновили данные
        return victim;
    }

    @Override
    public Iterator<E> iterator() {

        return new Iterator<E>() {
            Node<E> cur = first;
            @Override
            public boolean hasNext() {
                return cur != null;
            }
            @Override
            public E next() {
                E date = cur.data;
                cur = cur.next;
                return date;
            }
        };
    }
}
