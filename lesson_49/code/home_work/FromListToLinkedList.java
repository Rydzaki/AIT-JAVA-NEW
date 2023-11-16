package home_work;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FromListToLinkedList {

    public static void main(String[] args) {
        List<String> joy = new ArrayList<>();
        LinkedList<String> joyRevers;

        joy.add("Джек");
        joy.add("Джон");
        joy.add("Ник");
        System.out.println("=============print List==================");
        for (String n : joy) {
            System.out.print(n + " - ");
        }
        System.out.println();
        // System.out.println(joy.size());

        System.out.println("==================Print LinkedList=================");
        joyRevers = convector(joy);
        System.out.println(joyRevers);
    }
    public static LinkedList<String> convector(List<String> list) {
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            linkedList.add(list.get(i));
        }
        return linkedList;
    }
}

