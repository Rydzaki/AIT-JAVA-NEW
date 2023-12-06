package practice.programers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ProgrammerAppl {
    // Необходимо ответить на вопросы:
    // 1. кто из программистов знает больше всех языков(поименно). Фамилия Имя -> количество языков
    // 2. Какие языки пользуются популярностью среди наших программистов
    // язык программирования - сколько программистов его знают

    public static void main(String[] args) {

        List<Programmer> programmers = getProgrammers();

        System.out.println("============Most skilled programmers==========");
        printMostSkilletProgrammers(programmers);

        System.out.println("=================Most popular technologies============");
        printMostPopularTechnologies(programmers);


    }// and of main

    private static void printMostPopularTechnologies(List<Programmer> programmers) {
        System.out.println("==============Print all technologies===========");
        Iterable<String> technologies = programmers.stream()
                .map(programmer -> programmer.getTechnologies()) // переобразование объекта в одно его поле

//                .collect(Collectors.groupingBy(Programmer::getTechnologies)
                .flatMap(t -> Arrays.stream(t))//каждый отдельный масиив преобразуем на отдельные стримы
                .collect(Collectors.toList()); // собираем результат стримов в лист
        System.out.println("===========List of technologies==============");
        StreamSupport.stream(technologies.spliterator(), false)
                .distinct()
                .forEach(System.out::println);

        System.out.println("=================Grouping by Programmers==================");
        Map<String, Long> techFrequensy = programmers.stream()
                // .collect(Collectors.groupingBy(Programmer::getTechnologies)
                .map(Programmer::getTechnologies)
                .flatMap(Arrays::stream)
                //.sorted(Comparator.comparing())
                .collect(Collectors.groupingBy(t -> t, Collectors.counting()));

        System.out.println(techFrequensy);

        Long max = techFrequensy.values().stream()
                .max(Long::compareTo).orElse(0L);
        techFrequensy.entrySet().stream()
                .filter(e -> max.equals(e.getValue())) // взяли всех у кого равно максимуму
                .forEach(e -> System.out.println(e.getKey())); /// напечатали для каждого
    }

    private static void printMostSkilletProgrammers(List<Programmer> programmers) {
        Map<Integer, List<Programmer>> skilletProgrammers = programmers.stream()
                .collect(Collectors.groupingBy(programmer -> programmer.getTechnologies().length));
        Integer max = skilletProgrammers.keySet().stream()
                .max(Integer::compareTo).orElse(0);

        skilletProgrammers.get(max).forEach(System.out::println);


//        Map<Integer, List<Programmer>> skilletProgrammers = new HashMap<>();
//        int max = 0;
//        for (Programmer programmer : programmers) {
//            int key = programmer.getTechnologies().length; // ключь для MAP
//            max = key > max ? key : max; // обновили макс если он стал больше
//            skilletProgrammers.putIfAbsent(key, new ArrayList<>()); // кладем ключ если не чего там нет создаем пустой лист куда будем записывать наших программистов с таким ключом
//            List<Programmer> programmerList = skilletProgrammers.get(key);
//            programmerList.add(programmer);
//
//        }
//        System.out.println(skilletProgrammers);

    }

    private static List<Programmer> getProgrammers() {

        return List.of(
                new Programmer("Peter", "C++", "Python", "Java", "Kotlin"),
                new Programmer("Jonh", "Python", "Java"),
                new Programmer("Helen", "Kotlin", "Scala", "Java", "JavaScript"),
                new Programmer("Jacob", "Python", "Go"),
                new Programmer("Mikhail", "Fortran", "Algol", "PL-1")

        );

    }

}// and of class
