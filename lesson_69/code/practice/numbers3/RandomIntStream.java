package practice.numbers3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RandomIntStream {
    private static final int N_NUMBER = 6;
    private static final int MIN = -10;
    private static final int MAX = 10;

    public static void main(String[] args) {
//- создать с помощью stream поток случайных целых чисел;
//- выведите на печать элементы потока;
//- сколько в потоке получилось положительных чисел? сколько отрицательных?
//- просуммируйте все нечетные элементы потока;
//- найдите максимальное число, минимальное число;
//- выведите значения метода summaryStatistic.

        Stream<Integer> numbers = getRandomNumbers(N_NUMBER, MIN, MAX);
        numbers.forEach(System.out::println); // поток отработал и закрыт
        System.out.println("\n---------------------------------------------------");
        Stream<Integer> numbers1 = getRandomNumbers(N_NUMBER, MIN, MAX);
        numbers1.forEach(s -> System.out.print(s + " | "));
        System.out.println("\n");

        // печатаем с индексами

        // todo IntStream numbers2 = (IntStream) getRandomNumbers(N_NUMBER, MIN, MAX);
       // numbers2.forEach(s -> System.out.println(s + " | "));

        long positiveCount  = getRandomNumbers(N_NUMBER, MIN, MAX)
                .peek(n -> System.out.print(n + " | "))
                .filter(n -> n > 0)
                .count();
        System.out.print("\nPositive numbers: "+ positiveCount);

        System.out.println("\n--------------------Negative-------------------------");

        long negativeCount  = getRandomNumbers(N_NUMBER, MIN, MAX)
                .peek(n -> System.out.print(n + " | ")) // промежуточная печать
                .filter(n -> n < 0)
                .mapToInt(Integer::intValue)
                .count();
        System.out.print("\nPositive numbers: "+ negativeCount);

        System.out.println("\n--------------------SUM Odd-------------------------");

        int sumOdd  = getRandomNumbers(N_NUMBER, MIN, MAX)
                .peek(n -> System.out.print(n + " | ")) // промежуточная печать
                .filter(n -> n % 2 != 0)
                .mapToInt(n -> n.intValue()) //перевели в целые числа
                //.mapToInt(Integer ::intValue) // второй вариант перевода в инты
                        .sum();
        System.out.print("\nSum odd numbers: "+ sumOdd);
        System.out.println("\n--------------------MAX-------------------------");

        int max =  getRandomNumbers(N_NUMBER, MIN, MAX)
                .peek(n -> System.out.print(n + " | ")) // промежуточная печать
//                .max(Integer::compareTo) // два варианта поиска максимального знаачания с помощью встроенных компараторов
//                .max(Comparator.comparingInt(Integer::intValue))
                .max(Comparator.naturalOrder())
                .orElse(0);
        System.out.println("\n Max: "+ max);

        System.out.println("\n--------------------Statics-------------------------");

        IntSummaryStatistics intStat =  getRandomNumbers(N_NUMBER, MIN, MAX)
                .mapToInt(Integer::intValue)
                .peek(n -> System.out.print(n + " | "))
                        .summaryStatistics();
        System.out.println("\nmin = "+ intStat.getMin());
        System.out.println("\nmax = "+ intStat.getMax());
        System.out.println("\navg = "+ intStat.getAverage());
        System.out.println(intStat);

        System.out.println("\n--------------------сложение через один-------------------------");

//        int sumAfterOne =  getRandomNumbers(N_NUMBER, MIN, MAX)
//                //.filter(index-> index % 2 !=0)
//                       // .map(integer -> integer.toArray()) //todo
//
//        System.out.println("Su, = "+ sumAfterOne);
    }


    private static Stream<Integer> getRandomNumbers(int nNumber, int min, int max) {
        return new Random()
                .ints(min, max)
                .limit(nNumber)
                .boxed(); // упаковка в числа


    }
}
