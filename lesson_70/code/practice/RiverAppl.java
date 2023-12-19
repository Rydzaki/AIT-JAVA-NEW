package practice;

import java.util.*;

public class RiverAppl {

    public static void main(String[] args) {
        // реки в массиве

        int n = 11;
        River[] river = new River[n];

        river[0] = new River("Thames", 2500, "Europe");
        river[1] = new River("Nile", 6650, "Africa");
        river[2] = new River("Mississippi", 3770, "North America");
        river[3] = new River("Amazon", 6575, "South America");
        river[4] = new River("Murray", 2520, "Australia");
        river[5] = new River("Ice River", 1800, "Antarctica");
        river[6] = new River("Yangtze", 6380, "Asia");
        river[7] = new River("Seine", 776, "Europe");
        river[8] = new River("Congo", 4700, "Africa");
        river[9] = new River("Yenisei", 5542, "North America");
        river[10] = new River("Orinoco", 2140, "South America");

        // найти длину
        // отсортировать
        int sum = Arrays.stream(river)
                .filter(Objects::nonNull)
                .mapToInt(River::getLength)
                .sum();
        System.out.println("Sum of lengths: " + sum);

        OptionalInt max = Arrays.stream(river)
                .filter(Objects::nonNull)
                .mapToInt(River::getLength)
                .max();
        System.out.println("Max length river: " + max.getAsInt());

        // sorting

        Arrays.sort(river);
        for (int i = 0; i < river.length; i++) {
            System.out.println(river[i]);
        }
        System.out.println("---------------------------");

        Comparator <River> lengthComparator = Comparator.comparing(River::getLength);

        Arrays.sort(river, lengthComparator);
        for (River river1: river) {
            System.out.println(river1);
        }
        System.out.println("---------------------------");
        // river in List
        List <River> riverList = new ArrayList <>(List.of(
                new River("Ob", 6500, "Asia"),
                new River("Amazon", 6575, "South America"),
                new River("Dnieper", 2201, "Europe")
        ));
        // объединяем массив и лист

        Collections.addAll(riverList, river);
        System.out.println(riverList.size());
        //riverList.forEach(System.out::println);
        // sort по алфавиту
        Collections.sort(riverList); // sort берется из нашего compereTo
        riverList.forEach(System.out::println);
        System.out.println("---------------------------");
        Collections.addAll(riverList, river);
        System.out.println(riverList.size());
        riverList.forEach(System.out::println);
        // данные задвоелись
        System.out.println("====================River in set===============");
        Set <River> riverSet = new HashSet <>();// <>(riverList)
        // переложить данные из листа в сет
        for (River river1: riverList) {
            riverSet.add(river1);

        }
        System.out.println(riverSet.size());
        riverSet.forEach(System.out::println);

        // перекладываем в TreeSet
        System.out.println("====================River in TreeSet===============");

        //
       Set<River> riverTreeSet = new TreeSet<>(riverSet); // в трисет можно сразу передавать любой итерируемый объект!!!!!


      riverTreeSet.forEach(System.out::println); // самый короткий способ
        //
//        Set <River> riverTreeSet = new TreeSet <>();
//        for (River river1: riverSet) {
//            riverTreeSet.add(river1);
//        }
        riverTreeSet.forEach(System.out::println);

        System.out.println("========================");
        // делаем мапу, ключ континент, значение сколько рек
        // добавили реки
        River[] rivers = new River[11];

        rivers[0] = new River("Thames", 2500, "Europe");
        rivers[1] = new River("Nile", 6650, "Africa");
        rivers[2] = new River("Mississippi", 3770, "North America");
        rivers[3] = new River("Amazon", 6575, "South America");
        rivers[4] = new River("Murray", 2520, "Australia");
        rivers[5] = new River("Ice River", 1800, "Antarctica");
        rivers[6] = new River("Yangtze", 6380, "Asia");
        rivers[7] = new River("Seine", 776, "Europe");
        rivers[8] = new River("Congo", 4700, "Africa");
        rivers[9] = new River("Yenisei", 5542, "North America");
        rivers[10] = new River("Orinoco", 2140, "South America");
        Collections.addAll(riverTreeSet, rivers);
        riverTreeSet.forEach(System.out::println);
        System.out.println(riverTreeSet.size());

        Map <String, Integer> riverMat = new TreeMap <>();
        for (River r: riverTreeSet) {
            String continent = r.getContinent(); // определили ключ
            riverMat.put(continent, riverMat.getOrDefault(continent, 0) + 1);
        }
        // печатаем содержимое мапа
        System.out.println("===============================");
        for (Map.Entry<String, Integer> entry: riverMat.entrySet()) {
            System.out.println("Continent: "+ entry.getKey() + " Number of rivers: "+ "\t" + entry.getValue());
        }
    }
}
