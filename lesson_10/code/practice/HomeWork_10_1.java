package practice;

import java.util.Scanner;

//Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
//        Выведите на печать температуру, которая была во вторник и затем в четверг.
//        Найти среднюю температуру за прошлую неделю.
public class HomeWork_10_1 {
    public static void main(String[] args) {

       // double[] temperature = new double[7];
        double[] temperature = {19.0, 19.0, 18.0, 17.0, 16.0, 18.0, 15.0};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number day of week");
        int day = scanner.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

        System.out.println("Temperature: " + temperature[day-1]);
        double tempAver = 0;

        for (int i = 0; i < temperature.length; i++) {
            tempAver = tempAver + temperature[i];
        }
        System.out.println("____________________________________________");
        System.out.printf("Average temperature over the past week: %.2f", tempAver/temperature.length);
    }
}
