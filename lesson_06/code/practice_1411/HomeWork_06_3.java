package practice_1411;

import java.util.Scanner;

public class HomeWork_06_3 {
    public static void main(String[] args) {
        Scanner operation = new Scanner(System.in);

        Scanner number1 = new Scanner(System.in);
        System.out.println("Введите первое число для операции");
        double num1 = number1.nextDouble();

        System.out.println("Выберите арифметическое действие: " +
                "1 - сложение; " +
                "2 - вычитание; " +
                "3 - умножение; " +
                "4 - деление; " +
                "5 - вычисление остатка: ___");
        int oper = operation.nextInt();

        Scanner number2 = new Scanner(System.in);
        System.out.println("Введите второе число для операции");
        double num2 = number1.nextDouble();


        //double a = 0;
        //double b = 0;

        double add1 = add(num1, num2);
        double sub2 = sub(num1, num2);
        double multi3 = multi(num1, num2);
        double div4 = div(num1, num2);
        double rem5 = rem(num1, num2);

        switch (oper) {
            case 1: {
                System.out.println(add1);
                break;
            }
            case 2: {
                System.out.println(sub2);
                break;
            }
            case 3: {
                System.out.println(multi3);
                break;
            }
            case 4: {
                System.out.println(div4);
                break;
            }
            case 5: {
                System.out.println(rem5);
                break;
            }
            default: {
                System.out.println("Wrong input");
            }
        }


    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double multi(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static double rem(double a, double b) {
        return a % b;
    }
}