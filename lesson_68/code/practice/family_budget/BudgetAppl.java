package practice.family_budget;

import practice.family_budget.dao.Budget;
import practice.family_budget.dao.BudgetImpl;
import practice.family_budget.model.Menu;
import practice.family_budget.model.Product;
import practice.family_budget.model.Purchase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class BudgetAppl {
    public static void main(String[] args) {

        List<Purchase> purchaseList = new ArrayList <>();// ??
        List<Product>productList = new ArrayList <>();
        BudgetImpl budget = new BudgetImpl(purchaseList, 0);
        LocalDate now = LocalDate.now();


        while (true){
            Menu.perintMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your choice: ");

            int choice = scanner.nextInt();
            switch (choice){
                case 1-> {
                    System.out.println("Input budget amount");
                    double b = scanner.nextInt();
                    //??
                    //print
                }
                case 2 -> {
                    // load data
                    //print
                    break;
                }
                case 3 -> {
                    System.out.println("Purchases by Store: ");
                    //  вызвать метод и распечатать

                }
                case 4 -> {
                    System.out.println("Purchased by person: ");

                }
                case 5 ->{
                    System.out.println("Purchased by period");
                }
                case 6 -> {
                    System.out.println("Input amount of purchase");
                }
                case 7 -> {
                    return;
                }
                default -> {
                    System.out.println("Wrong choice");
                }


            }
        }
    }
}
