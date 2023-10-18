package practice;

import java.util.Scanner;

public class HomeWork_06_2 {
    public static void main(String[] args) {

        Scanner seasons = new Scanner(System.in);
        System.out.println("Please enter month number: ");
        int mounth = seasons.nextInt();

        switch (mounth) {
            case 12, 1, 2: {
                System.out.println("Winter");
                break;
            }
            case 3, 4, 5: {
                System.out.println("Spring");
                break;
            }
            case 6, 7, 8: {
                System.out.println("Summer");
                break;
            }
            case 9, 10, 11: {
                System.out.println("Autumn");
                break;
            }

        }
    }
}
