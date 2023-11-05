package home_work;

import java.util.Scanner;
import java.util.SplittableRandom;

public class HomeWork_24 {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter type: ");
//        String typeOrig = scanner.next();
//        String type = typeOrig.toLowerCase();
        if (args.length == 0) {
            System.out.println("No command line arguments provided.");
            return; // Прекратить выполнение программы
        }
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "byte" -> System.out.println("Byte MIN = " + Byte.MIN_VALUE + "; " + "Byte MAX = " + Byte.MAX_VALUE);
                case "short" -> System.out.println("Short MIN = " + Short.MIN_VALUE + "; " + "Short MAX = " + Short.MAX_VALUE);
                case "char" -> System.out.println("Char MIN = " + Character.MIN_VALUE + "; " + "Char MAX = " + Character.MAX_VALUE);
                case "int" -> System.out.println("Integer MIN = " + Integer.MIN_VALUE + "; " + "Integer MAX = " + Integer.MAX_VALUE);
                case "long" -> System.out.println("Long MIN = " + Long.MIN_VALUE + "; " + "Long MAX = " + Long.MAX_VALUE);
                case "float" -> System.out.println("Float MIN = " + Float.MIN_VALUE + "; " + "Float MAX = " + Float.MAX_VALUE);
                case "double" -> System.out.println("Double MIN = " + Double.MIN_VALUE + "; " + "Double MAX = " + Double.MAX_VALUE);
                default -> System.out.println("Неверный тип");
            }
        }
    }
}
