package prictice;

import java.util.Scanner;

// Задача 4. Ввести с клавиатуры 10 пар целых чисел.
// Сравните числа в каждой паре и напечатайте большие из них.
// Использовать цикл for.
public class HomeWork_14_repeat_4 {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int[] max = new int [10];
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Input 1st number: ");
//            int number1 = scanner.nextInt();
//
//            System.out.println("Input 2nd number: ");
//            int number2 = scanner.nextInt();
//
//            max[i] = Math.max(number1, number2);
//        }
//        System.out.println("Max number in pair: ");
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("pair"+ (i+1) + " - " + max[i]);
//        }
//        System.out.println("+++++++++++++++++++++++++++++++++++++++");

    // Задача 5. Найти произведение двузначных нечетных чисел кратных 17.

    int comp = 1;
        for (int i = 17; i <=99; i+=17) {
            if (i % 2 !=0){
                System.out.print(i + "| ");
                comp *= i;
            }
        }
        System.out.println(comp);
    }
}


