package practice_1411;

import java.util.Scanner;

public class HomeWork_06_1 {
    public static void main(String[] args) {

        double basic_salary = 500;
        Scanner ege = new Scanner(System.in);
        System.out.println("Input your experience: ");
        int exp = ege.nextInt();
        double incr = 0;

        double add_inc = increase(basic_salary, incr);


        if ((exp >= 3) & (exp < 5)) {
            incr = 0.1;
            System.out.println("Your salary increase: " + incr * 100 + " %");
            System.out.println("Your updated salary: " + increase(basic_salary, incr));
        } else if ((exp >= 5 ) & (exp < 10 )) {
            incr = 0.5;
            System.out.println("Your salary increase: " + incr * 100 + " %");
            System.out.println("Your updated salary: " + increase(basic_salary, incr));
        } else if ((exp >=10) & (exp < 15)) {
            incr = 1;
            System.out.println("Your salary increase: " + incr * 100 + " %");
            System.out.println("Your updated salary: " + increase(basic_salary, incr));
        } else if (exp >= 15) {
            incr = 1.5;
            System.out.println("Your salary increase: " + incr * 100 + " %");
            System.out.println("Your updated salary: " + increase(basic_salary, incr));
        }

    }public static double increase(double a, double b) {
        return a*b+a;
    }
}
