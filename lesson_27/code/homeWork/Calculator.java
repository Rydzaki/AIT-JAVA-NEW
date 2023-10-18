package homeWork;

import homeWork.metods.CalculatorMetods;

import java.util.Scanner;


public class Calculator {
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

        double add1 = CalculatorMetods.add(num1, num2);
        double sub2 = CalculatorMetods.sub(num1, num2);
        double multi3 = CalculatorMetods.multi(num1, num2);
        double div4 = CalculatorMetods.div(num1, num2);
        double rem5 = CalculatorMetods.rem(num1, num2);

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

}