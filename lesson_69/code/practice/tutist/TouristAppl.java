package practice.tutist;

import practice.programers.Programmer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class TouristAppl {
    public static void main(String[] args) {
        // кто больше всех стран посетил и какие страны популярны

        List <Tourist> tourists = getTourists(); // заполняем список туристов
        System.out.println("============================Most skilled tourists=================");
        printMostSkilledTourists(tourists);

        System.out.println("============================Most popular countries=================");
        printMostPopularCountries(tourists);

    }


    private static void printMostSkilledTourists(List <Tourist> tourists) {
        Map <Integer, List <Tourist>> skilletTourists = tourists.stream()
                .collect(Collectors.groupingBy(t -> t.getCountries().length));

        Integer max = skilletTourists.keySet().stream()
                .max(Integer::compareTo).orElse(0);

        skilletTourists.get(max).forEach(System.out::println);

    }

    private static void printMostPopularCountries(List <Tourist> tourists) {
//        Iterable <String> countries = tourists.stream()
//                .map(tourist -> tourist.getCountries()) // переобразование объекта в одно его поле
//                .flatMap(t -> Arrays.stream(t))//каждый отдельный масиив преобразуем на отдельные стримы
//                .collect(Collectors.toList()); // собираем результат стримов в лист
//        System.out.println("===========List of countries==============");
//        StreamSupport.stream(countries.spliterator(), false)
//                .distinct()
//                .forEach(System.out::println);

        // Шаг 1: Подсчет частоты посещений каждой страны
        Map<String, Long> countriesFrequency = tourists.stream()
                .map(Tourist::getCountries)                   // Преобразуем каждого туриста в массив стран
                .flatMap(Arrays::stream)                     // Разглаживаем массивы в один поток стран
                .collect(Collectors.groupingBy(t -> t, Collectors.counting()));  // Группируем по странам и подсчитываем количество

        // Шаг 2: Находим максимальное количество посещений
        Long maxFrequency = countriesFrequency.values().stream()//получаем коллекцию всех значений и отправляем ее в стрим
                .max(Long::compareTo)
                .orElse(0L);  // Если максимального значения нет, присваиваем 0

        Long minFrequency = countriesFrequency.values().stream()//получаем коллекцию всех значений и отправляем ее в стрим
                .min(Long::compareTo)
                .orElse(0L);  // Если максимального значения нет, присваиваем 0

        // Шаг 3: Выводим самую популярную страну (или несколько, если есть совпадения в частоте)
        countriesFrequency.entrySet().stream() // преобразует отображение в набор объектов
                .filter(e -> maxFrequency.equals(e.getValue()))  // Фильтруем по тем, у кого частота равна максимуму
                .forEach(e -> System.out.println("Самая популярная страна: " + e.getKey() + " посещений: "+ maxFrequency));  // Выводим каждую найденную страну

        countriesFrequency.entrySet().stream() // преобразует отображение в набор объектов
                .filter(e -> minFrequency.equals(e.getValue()))  // Фильтруем по тем, у кого частота равна максимуму
                .forEach(e -> System.out.println("Самая не популярная страна: " + e.getKey()+ " посещений: "+ minFrequency));
    }

private static List <Tourist> getTourists() {
    return List.of(
            new Tourist("Olesia", "Iran", "Kyrgystan", "United Arab Emirates", "France", "Italy", "Portugal", "Spain"),
            new Tourist("Bilbo Baggins", "Italy", "Spain", "Turkey"),
            new Tourist("Tatyana", "Italy", "Spain", "Italy", "Greece", "Turkey"),
            new Tourist("Anton", "Germany", "Nederland", "Turkey", "Georgia"),
            new Tourist("Sergei_B", "Tunis", "Turkey", "China", "Vietnam"),
            new Tourist("Galina", "Italy", "France", "Italy"),
            new Tourist("Anatoly", "Montenegro", "Albania", "Greece", "Italy"),
            new Tourist("Andrii", "UK", "Ireland", "Spain"),
            new Tourist("Liubov", "Croatien", "Slovenian", "Spain", "France", "Egypt"),
            new Tourist("Liam", "Spain", "Portugal", "Morocco", "Cyprus"),
            new Tourist("Emma", "Greece", "Turkey", "Croatia", "Montenegro"),
            new Tourist("Mia", "Italy", "Malta", "Spain", "Turkey"),
            new Tourist("Noah", "Turkey", "Greece", "Italy", "Croatia"),
            new Tourist("Olivia", "Croatia", "Montenegro", "Albania", "Greece"),
            new Tourist("Lucas", "Portugal", "Spain", "France", "Italy"),
            new Tourist("Amelia", "Greece", "Cyprus", "Spain", "Italy"),
            new Tourist("Oliver", "Spain", "Italy", "Turkey", "Greece"),
            new Tourist("Isabella", "France", "Spain", "Italy", "Greece"),
            new Tourist("Ethan", "Italy", "Greece", "Spain", "Croatia"),
            new Tourist("Ava", "Greece", "Turkey", "Spain", "Italy"),
            new Tourist("Liam", "Spain", "Italy", "Morocco", "Greece"),
            new Tourist("Sophia", "Italy", "Spain", "Turkey", "Greece"),
            new Tourist("Jackson", "Greece", "Spain", "Italy", "Croatia"),
            new Tourist("Olivia", "Croatia", "Greece", "Italy", "Montenegro"),
            new Tourist("Logan", "Spain", "Greece", "Italy", "Turkey"),
            new Tourist("Emma", "Greece", "Italy", "Spain", "Cyprus"),
            new Tourist("Aiden", "Italy", "Greece", "Spain", "Turkey")
    );
}
}
