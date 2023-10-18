package practice;

import java.util.Scanner;

public class HomeWork_07_3 {
    public static void main(String[] args) {

        Scanner month = new Scanner(System.in);
        System.out.println("Indicate month");
        int mon = month.nextInt();

        Scanner egeX = new Scanner(System.in);
        System.out.println("Indicate ege");
        int ege = egeX.nextInt();
        int day = 0;

        if (mon >= 1 && mon <= 12) {
            if (mon == 2) {
                if (ege % 4 == 0 & ege % 100 != 0 | ege % 100 == 0 & ege % 400 == 0) {
                    day = 29; // високосный год
                } else {
                    day = 28;
                }
            } else if (mon == 4 || mon == 6 || mon == 9 || mon == 11) {
                day = 30;
            } else {
                day = 31;
            }
        }
        switch (mon) {
            case 1 -> System.out.println("January " + day + " days");
            case 2 -> System.out.println("February " + day + " days");
            case 3 -> System.out.println("March " + day + " days");
            case 4 -> System.out.println("April " + day + " days");
            case 5 -> System.out.println("May " + day + " days");
            case 6 -> System.out.println("June " + day + " days");
            case 7 -> System.out.println("July " + day + " days");
            case 8 -> System.out.println("August " + day + " days");
            case 9 -> System.out.println("September " + day + " days");
            case 10 -> System.out.println("October " + day + " days");
            case 11 -> System.out.println("November " + day + " days");
            case 12 -> System.out.println("December " + day + " days");
        }


    }

}
