package practice;

import java.util.Scanner;

public class Ampel {
    public static void main(String[] args) {
        // как будем кодировать цвет светофора?
        // либо цифры 1, 2, 3, либо задаем программе строкой
        Scanner scanner = new Scanner(System.in);
        System.out.println(" What is the color? (Red, Yellow, Green): ");


        // String color = "Green"; // задаем переменную стрового типа String
        String color = scanner.next();

        switch (color) {
            case "Red" -> System.out.println("Stop, wait!");
            case "Yellow" -> System.out.println("Be ready to go");
            case "Green" -> System.out.println("You can go");
            default -> System.out.println("Wrong input");
        }

    }
}
