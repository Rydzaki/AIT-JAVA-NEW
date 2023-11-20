package home_work.currency;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static home_work.currency.CurrencyName.EUR;

import static home_work.currency.CurrencyName.*;

public class CurrencyAppl {
    public static void main(String[] args) {
        System.out.println("Welcome select the currency of interest");
        Scanner scanner = new Scanner(System.in);
        CurrencyName[] menu = CurrencyName.values();
        Set<CurrencyName> menuUniq = new HashSet<>();
        for (CurrencyName c : menu) {
            menuUniq.add(c);
        }
        //System.out.println(menuUniq); // IDEA и так не дас ввнести константу с таким же именем
        int count = 1;

        for (CurrencyName c : menuUniq) {
            System.out.println((count) + " - " + c.getName());
            count++;
        }
        while (true) {
            System.out.println("Input your choice (0 to exit): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                System.out.println("You chose: " +CNY.getName()+ ". Input your sum: ");
                    int sum = scanner.nextInt();
                    System.out.println(convertToEuro(CNY, (double) sum));
                    break;
                }
                case 2: {
                    System.out.println("You chose: " +JPY.getName()+ ". Input your sum: ");;
                    int sum = scanner.nextInt();
                    System.out.println(convertToEuro(JPY, (double) sum));
                    break;
                }
                case 3: {
                    System.out.println("You chose: " +GBP.getName()+ ". Input your sum: ");
                    int sum = scanner.nextInt();
                    System.out.println(convertToEuro(GBP, (double) sum));
                    break;
                }
                case 4: {
                    System.out.println("You chose: " +EUR.getName()+ ". Input your sum: ");
                    int sum = scanner.nextInt();
                    System.out.println(convertToEuro(EUR, (double) sum));
                    break;
                }
                case 5: {
                    System.out.println("You chose: " +USD.getName()+ ". Input your sum: ");
                    int sum = scanner.nextInt();
                    System.out.println(convertToEuro(USD, (double) sum));
                    break;
                }
                case 0: {
                    System.out.println("Exit the program");
                    return;
                }
            }
        }
    }
}
