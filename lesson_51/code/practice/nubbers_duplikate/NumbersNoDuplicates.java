package practice.nubbers_duplikate;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class NumbersNoDuplicates {

    //    - Имеется список из 100 случайных чисел в интервале от 1 до 10, необходимо удалить из него
//  все дубликаты.
    public static void main(String[] args) {


        int[] numbers = new int[100];
        int a = 1;
        int b = 11; // чтобы 10 вошло в диапазон

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(a, b); // заполнили массив рандомными числами
        }

        for (Integer n : numbers) {
            System.out.print(n + "|");
        }
        System.out.println();

        Set<Integer> uniqueNumbers = new HashSet<>();
        System.out.println("===================================");
        System.out.println("Size of set: "+ uniqueNumbers.size());
        System.out.println("Is empty: " + uniqueNumbers.isEmpty());

        // занесли массив в Set циклом for
        for (int i = 0; i < numbers.length; i++) {
            uniqueNumbers.add(numbers[i]);
        }

        System.out.println("способ 2 forEach");
        for (Integer n : numbers) {
            uniqueNumbers.add(n); // способ 2 forEach
        }


        for(Integer n : uniqueNumbers){
            System.out.print(n+ "|");
        }
        System.out.println();
        System.out.println("=========второй способ заполнения через фор ич и печать чрезе тустринг =========");
        System.out.println(uniqueNumbers); // второй способ заполнения

    }
}
