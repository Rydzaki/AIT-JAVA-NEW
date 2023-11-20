package home_work;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;

public class HomeWork_51_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> namesOfLands = new HashSet<>();


        do {
            System.out.println("Enter the names of the lands of Germany ");
            String name = scanner.nextLine();
            System.out.println();
            if (namesOfLands.add(name)) {
                System.out.println("Name added");
            } else {
                System.out.println("Name alredy exists");

            }
            System.out.println("Continue? To exit, type 'exit' ");
            String ch = scanner.nextLine();
            if (ch.equalsIgnoreCase("exit")) {
                break;
            }
        } while (true);
        System.out.println("Names of the lands of Germany: " + namesOfLands.size());
        System.out.println(namesOfLands);
    }
}
