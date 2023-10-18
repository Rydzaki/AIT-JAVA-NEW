package practice;

//Задача 3. В первый день спортсмен пробежал s километров, а затем он каждый день увеличивал пробег на 10 % от
// предыдущего значения. Определите номер того дня, на который пробег спортсмена составит не менее target километров.
// Программа получает на вход действительные числа s и target и должна вывести одно натуральное число.

import java.util.Scanner;

public class HomeWork_08_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How far can you run?...");
        double holdLen = scanner.nextDouble();
        System.out.println("What is your target?...");
        double target = scanner.nextDouble();

        int dayNamber = 0;

        while (holdLen < target){
            holdLen = holdLen + holdLen * 0.1;
            dayNamber ++ ;
            System.out.printf("Distance: %.2f;\n", holdLen); // оставляет только 2 знака после запятой printf
            //System.out.println(dayNamber);
        }
        System.out.println("You will results in " + dayNamber+ " days");



    }
}
