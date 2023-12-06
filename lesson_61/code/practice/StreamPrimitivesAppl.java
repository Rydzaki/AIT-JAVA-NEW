package practice;

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.Stream;

public class StreamPrimitivesAppl {
    private static final int N_NUMBERS = 10;
    private static int MIN = 1;
    private static int MAX = 10;

    public static void main(String[] args) {

        // получить случайные сила в виде потока

        Stream<Integer> numbers = getRandomNumbers(N_NUMBERS, MIN, MAX);
        numbers.forEach(System.out::println);
        System.out.println("=====================sum of numbers====================");

        int sum = getRandomNumbers(N_NUMBERS, MIN, MAX)
        //        .mapToInt(n -> n.intValue())
                .mapToInt(Integer::intValue) // то же самое из Integer в int
                //.peek(System.out::println) // промежуточная печать
                .sum();
        System.out.println("Sum = "+ sum );

        System.out.println("================= Summery statistic ====================");

        IntSummaryStatistics intStat = getRandomNumbers(N_NUMBERS, MIN, MAX) // клас для работы с арифметикой
                .mapToInt(Integer::intValue)
                .peek(System.out::println)
                .summaryStatistics();
        System.out.println("min = "+ intStat.getMin());
        System.out.println("min = "+ intStat.getMax());
        System.out.println("sum = "+ intStat.getSum());
        System.out.println("Average = " + intStat.getAverage()); // среднее значение

        System.out.println("=================== Lotto 6 from 49======================");
        new Random()
                .ints(1, 50)
                .distinct() // удаляет дубли
                .limit(6) // ограничивает стрим
                //.forEachOrdered(System.out::println);
               .forEach(System.out::println);

        System.out.println("===================== Shuffle ======================");
        int[] arr = {10, 20, 30, 40, 50};
        // нужно перетасовать в случайном порядке массив
        // будем тасовать индексы
        new Random()
                .ints(0, arr.length) // в этом диапазоне будем генерить случайные числа
                .distinct()
                .limit(arr.length) // ограничеваем колличество выброшеных чисел
                .forEach(i -> System.out.println(arr[i]));
    }

    private static Stream<Integer> getRandomNumbers(int nNumbers, int min, int max) {

        return new Random()
                .ints(min, max)
                .limit(nNumbers)
                //.mapToObj(n -> (Integer)n); // перегоняем в объект
                .boxed(); // авто упаковка в объект (из int в Integer)

    }
}
