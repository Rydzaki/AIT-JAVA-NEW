package practice;
// Задача 1. Программа получает на вход строку и число повторений этой строки. Программа должна
// вывести эту строку нужное количество раз.

import java.util.Scanner;

public class HomeWork_08_1 {
    public static void main(String[] args) {

        Scanner string = new Scanner(System.in);
        System.out.println("Enter your phrase: ");
        String string1 = string.nextLine(); // nextLine() - считывает все строку включая пробелы


        Scanner number = new Scanner(System.in); // сканер нужно использовать только один
        System.out.println("Enter how many times be repeated: ");
        int num = number.nextInt();
        int couter = num;

        while (couter > 0){
            // couter--; получается не имеет значение перед/после soup
            System.out.println(string1);
            couter--;

        }

    }
}
