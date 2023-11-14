package practice_1411;

//Задача 2. Вводится положительное целое число, найдите сумму его цифр.

import java.util.Scanner;

public class HomeWork_08_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int num = scanner.nextInt(); // сохранять в отдельную переменную, если нужно потом выводить ее
        int sum = 0;
        int remai = 0;

        while (num > 0) {
            remai = num % 10;
            sum += remai;
            num /= 10;
        }
        System.out.println("The sum of the entered numbers: " +sum);
    }
}

