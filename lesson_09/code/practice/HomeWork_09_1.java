package practice;

import java.util.Scanner;

// Задача 1. Распечатайте все числа меньшие 200 и кратные 13.
public class HomeWork_09_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите до которого числа сделать расчет");
        int number = scanner.nextInt();
        System.out.println("Введите число которому должно быть кратно");
        int div = scanner.nextInt();


        while (number > 0){
            while (number % div == 0){
                System.out.print(number+ " | ");
                number --;
            }number --;
        }

//        while (number > 0){
//            if(number % div == 0){
//                System.out.println(number);
//            }number--;
//        }


    }
}
