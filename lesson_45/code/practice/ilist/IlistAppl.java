package practice.ilist;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IlistAppl {

    public static void main(String[] args) {

        // список с целыми числами
        Ilist<Integer> list = new IlistImpl<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        System.out.println("============String============");


        Ilist<String> sity = new IlistImpl<>();
        sity.add("London");
        sity.add("Amsterdam");
        sity.add("Berlin");
        sity.add("Paris");
        sity.add("Madrid");
        sity.add("Istanbul");
        sity.add("Moscow");
        for (String s : sity) {
            System.out.print(s +" | ");
        }
        System.out.println();
        System.out.println(sity.size());
        printMetods("isEmpty");
        System.out.println(sity.isEmpty());
        printMetods("contains");
        System.out.println(sity.contains("St. Petersburg"));

        printMetods("indexOf");
        System.out.println(sity.indexOf("Istanbul"));
        printMetods("remove");
        sity.remove(1);
        printArr(sity);
        printMetods("ADD");
        sity.add("Bora-Bora");
        printArr(sity);
        printMetods("set");
        System.out.println(sity.set(0, "New York")); // todo зачем тогда писать сам Элемент??
        printMetods("ensureCapasity");

        printMetods("lastIndexOf"); // Working
        System.out.println(sity.lastIndexOf("Madrid"));
        System.out.println(sity.lastIndexOf("Berlin")); // todo почему не работает??





        printMetods("clean");
        sity.clean();
        System.out.println(sity.size());


    }

    public static void printMetods(String str){
        System.out.println("=============" + str+ "=============");
        System.out.println();
    }
    public static void printArr(Ilist<String> arr){
        for (String o : arr){
            System.out.print(o + " | ");
        }
        System.out.println();
    }


}
