package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsMethods {

    // Создайте список известных вам фруктов.
    // Выполните поиск имеющегося и отсутствующего элемента списка.
    // Отсортируйте этот список по алфавиту в прямом и обратном порядке.
    // Проверьте работу методов
    // max(Collection<?> coll)
    // min(Collection<?> coll), что они возвращают?

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pear");
        fruits.add("Plum");
        fruits.add("Strawberry");

        System.out.println("===========================================");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("==============================================");

        Collections.sort(fruits); //сделали сортировку
        System.out.println("=====================Sort======================");
        for (String fruit : fruits) { // произошла сортировка по деволту (Strint имеет метод compereTo)
            System.out.println(fruit);
        }
        System.out.println("===========================================");

        String key = "Banana";
        int index = Collections.binarySearch(fruits, key);
        System.out.println("index = " + index + " of " + key);
        System.out.println("======================ищем отсутствующий элемент в листе (-(-1)) =====================");
        key = "Kiwi";
        index = Collections.binarySearch(fruits, key);
        System.out.println("index = " + index + " of " + key);
        System.out.println("===========================================");

        Comparator<String> fComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2); // ставлю знак минус чтобы сортировка шла наоборот (conpareTo созвращает int) если числа отлицательные или ноль, компаратор не чего не делает, меняет если положительное
            }
        };
        Collections.sort(fruits, fComparator);
        System.out.println("=====================Sort by fComparator======================");
        for (String fruit : fruits) { // произошла сортировка по деволту (Strint имеет метод compereTo)
            System.out.println(fruit);
        }

        String max = Collections.max(fruits);
        System.out.println("Max of = " + max);
        System.out.println("----------------------------------");
        String min = Collections.min(fruits);
        System.out.println("Min of = " + min);
        System.out.println("====================================");
        Collections.reverse(fruits);
        for (String fruit : fruits) { // произошла сортировка по деволту (Strint имеет метод compereTo)
            System.out.println(fruit);
        }
        System.out.println("----------------With fComparator-------------------");
        max = Collections.max(fruits, fComparator);
        System.out.println("Max of = " + max);
        System.out.println("----------------------------------");
        min = Collections.min(fruits, fComparator);
        System.out.println("Min of = " + min);


    }
}
