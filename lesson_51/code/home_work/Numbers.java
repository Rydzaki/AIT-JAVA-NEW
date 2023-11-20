package home_work;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Numbers {

    //    Задача 2. Написать программу, которая:
//    прочитает с клавиатуры количество вводимых чисел,
//    прочитает с клавиатуры сами числа и соберёт их в множество,
//    удалить из множества числа большие 10 и выведет полученные результаты на экран. Все числа, которые подаются на вход программы, целые.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();
        System.out.println("Enter the desired number of input numbers ");
        int numbersEntered = scanner.nextInt();
        int count = numbersEntered;

        do {
            System.out.println("it remains to enter: " + count);
            Integer n = scanner.nextInt();
            numbers.add(n);
            count--;
        } while (count > 0);

        System.out.println("До сортировки");
        System.out.println(numbers);

        Set<Integer> numbersAfterSort = new HashSet<>();
        for (Integer n : numbers) {
            if (n < 10) {
                numbersAfterSort.add(n);
            }
        }
        System.out.println();
        System.out.println("После сортировки по условию");
        System.out.println(numbersAfterSort);


    }
}
