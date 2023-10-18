package practice;

import java.util.Scanner;

public class HomeWork_07_1 {
    public static void main(String[] args) {
        Scanner coffee = new Scanner(System.in);
        System.out.println(" Please select a drink:" +
                "\n 1. Espresso " +
                "\n 2. Americano" +
                "\n 3. Latte" +
                "\n 4. Cappuccino");
        int number = coffee.nextInt();
        String drinkChoice = " ";
        double price = 0;

        switch (number) {
            case 1 -> {
                drinkChoice = "Espresso";
                price = 2;
                System.out.println("Your drink "+ drinkChoice + " price: "+ price + " eur");
            }case 2 -> {
                drinkChoice = "Americano";
                price = 1.5;
                System.out.println("Your drink "+ drinkChoice + " price: "+ price + " eur");
            }case 3 -> {
                drinkChoice = "Latte";
                price = 2.80;
                System.out.println("Your drink "+ drinkChoice + " price: "+ price + " eur");
            }case 4 -> {
                drinkChoice = "Cappuccino";
                price = 3;
                System.out.println("Your drink "+ drinkChoice + " price: "+ price + " eur");
            }
            default -> System.out.println("Wrong input");
        }
    }
}
