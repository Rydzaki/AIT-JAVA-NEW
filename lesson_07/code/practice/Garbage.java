package practice;

import java.util.Scanner;

public class Garbage {
    public static void main(String[] args) {

        // Ввод названия мусора - строкой. Может быть много значений
        // Желтый бак должен принять упаковки, пластик, пакеты
        // черный бак должен принять - отходы, мусор
        // синий бак для бумаги

        Scanner scanner = new Scanner(System.in);
        System.out.println("input type of garbage: ");
        System.out.println("package, plastic, bag, rest, waste, paper, carton");

        String garbage = scanner.next(); // ответы пользователя

        if (garbage.equals("package")  | garbage.equals("plastic") | garbage.equals("bag")) { // == плохо для стрингов используем .equals()
            System.out.println("Put it into \n yellow box"); // \n перенос на новую строку
        } else if (garbage.equals("rest") | garbage.equals("waste") ) {
            System.out.println("Put it into black box");
        }else {
            System.out.println("Put it into blue box");
        }

    }
}
