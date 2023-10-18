package practice;

import java.util.Scanner;

//Задача 3. В кинотеатре есть разные типы билетов: стандартный, студенческий (-10%) и для пенсионеров(-25%). Каждый тип
// билета имеет свою стоимость. Клиент может также выбрать место в VIP-зоне, что увеличит стоимость билета на 25%.
// Создайте метод calculateTicketPrice, который принимает возраст клиента, статус студента и флаг VIP-места.
public class HomeWork_09_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indicate your age");
        int age = scanner.nextInt();



        System.out.println("Do you want VIP seat? \n1. YES; \n2. NO");
        int vip = scanner.nextInt();

        boolean answer = true;

        double price = 100;
        double discount = 0;

        double totalPrice = calculateTicketPrice(price, discount);

        if (age >= 18 && age < 65) {
            System.out.println("Are you a student? \n1. YES; \n2. NO");
            int student = scanner.nextInt();
            if (student == 1){
                discount = 0.1;
            }
        } else if (age >= 65) {
            discount = 0.25;}

        if (vip == 1){
                discount -= 0.25;
            }

        totalPrice = calculateTicketPrice(price, discount);
        System.out.println("price for you: "+ totalPrice+ " your discount: "+ (discount *100) + "%");

    }
    public static double calculateTicketPrice(double  a, double b){
        return a * (1-b);
    }
}