package practice_1411;

import java.util.Scanner;

public class DigitsNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number");
        int number = scanner.nextInt();
        System.out.println("Your number is: "+ number);


        // Составляем алгоритм
        // смысл цифры определяется ее положением, единицы, десятки, соты...
        // Делим в цикле наше число на 10, пока больше нуля
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count ++;

        }
        System.out.println("Digits in number " +" is "+ count);
    }
}
