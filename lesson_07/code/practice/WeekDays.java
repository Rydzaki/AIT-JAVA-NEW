package practice;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day of week (two first letter of day): ");
        // int dayOfWeek = scanner.nextInt();
        String dayOfWeek = scanner.next();
        dayOfWeek = dayOfWeek.toLowerCase();

        switch (dayOfWeek) {
            case "mo" -> System.out.println("this is Monday");
            case "Tu" -> System.out.println("this is Tuesday");
            case "We" -> System.out.println("this is Wednesday");
            case "Th" -> System.out.println("this is Thursday");
            case "Fr" -> System.out.println("this is Friday");
            case "Sa" -> System.out.println("this is Saturday");
            case "Su" -> System.out.println("this is Sunday");
            default -> System.out.println("Wrong input");
        }

    }
}
