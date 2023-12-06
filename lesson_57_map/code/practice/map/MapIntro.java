package practice.map;

import java.util.*;

public class MapIntro {

    public static void main(String[] args) {
        // создадим мапу отражающую колличество людей (население) в городах США

        Map<String, Integer> usaCities = new TreeMap<>(); // создали объект типа Map
        usaCities.put("Denver", 600_000);
        usaCities.put("Boston", 670_000);
        usaCities.put("Chicago", 2_700_000);
        usaCities.put("Atlanta", 470_000);
        usaCities.put("New York", 8_500_000);
        usaCities.put("Dallas", 1_300_000);

        System.out.println("Map size = " + usaCities.size());
        System.out.println("Is empty: " + usaCities.isEmpty());

        System.out.println("================Get=====================");
        Integer num = usaCities.get("Chicago");
        System.out.println(num);
        int pop = usaCities.get("Atlanta");
        System.out.println(pop);

        System.out.println("===========Проверка ключа в мапе================");
        System.out.println(usaCities.containsKey("Boston"));
        System.out.println(usaCities.containsKey("Detroit"));

        System.out.println("=========обновим заначения в мапе по ключу=============");

        num = usaCities.put("Chicago", 2_700_001);
        System.out.println(num); //старое значение переменной
        System.out.println(usaCities.get("Chicago")); // изменили значения
        System.out.println(num);
        System.out.println("-----------------------------------");
        num = usaCities.put("Chicago", 2_700_002);
        System.out.println(num); //старое значение переменной
        System.out.println(usaCities.get("Chicago")); // изменили значения

        System.out.println("===============================");

        Collection<Integer> population = usaCities.values(); // вытащили значения в коллекцию (Типо так правильнее, но можно и в лист или арей0
        int total = 0;
        for (Integer i: population) {
            total += i;
            System.out.print(i + " | ");
            }
        System.out.println();
        System.out.println("Sum total = " + total);
        System.out.println();

        System.out.println("================print map=====================");
        Set<String> keys = usaCities.keySet();
        for (String key : keys){
            System.out.println(key + " -> "+ usaCities.get(key));
        }

        // второй метод
        System.out.println("------------второй метод----------");

        Set<Map.Entry<String, Integer>> entries = usaCities.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " -> "+ entry.getValue());
        }
        // третий способ
        System.out.println("------------третий метод----------");
        System.out.println(usaCities.entrySet());


    }
}
