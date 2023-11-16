package practice49.lincedList;

import java.util.Collections;
import java.util.LinkedList;

public class NodeListAppl {
    public static void main(String[] args) {

        //создадим список из целыйх чисел

        NodeListImpl<Integer> listNumbers = new NodeListImpl<>();
        System.out.println(listNumbers.size());
        System.out.println(listNumbers.isEmpty());

        listNumbers.add(100);
        listNumbers.add(200);
        listNumbers.add(300);
        listNumbers.add(441);

        System.out.println(listNumbers.size());
        System.out.println(listNumbers.isEmpty());

        for (Integer n : listNumbers) {
            System.out.print(n + "|");
        }

        // todo доделать toString
        listNumbers.toString();

        listNumbers.add(2, 250);
        System.out.println();

        for (Integer n : listNumbers) {
            System.out.print(n + "|");
        }
        System.out.println();
        // удалим по индексу
        listNumbers.remove(2);
        for (Integer n : listNumbers) {
            System.out.print(n + "|");
        }

        // добавить null
        System.out.println();
        listNumbers.add(4, null);
        for (Integer n : listNumbers) {
            System.out.print(n + "|");
        }
        //Collections.sort(listNumbers);

    }
}
