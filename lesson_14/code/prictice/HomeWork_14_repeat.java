package prictice;

import java.util.Scanner;

// Задача 1. Составьте программу, которая вычисляет сумму чисел от
// 1 до 1/n, n вводится с клавиатуры. Пример: n = 10 sum = 1 + 1/2 + 1/3 +
// ... + 1/10 Использовать цикл for.
public class HomeWork_14_repeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");

        int n = scanner.nextInt();


        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (double) +1 / i;

        }
        System.out.printf("Sum = %.2f", sum);

//        Задача 2. Вводится n - натуральное число. Напишите метод, который получает на вход n и
//        вычисляет n! = 1 * 2 * 3 *... * n. Вызовите полученный метод. При каком значении n
//        происходит переполнение памяти, выделяемой для n типа int? Использовать цикл for.

        int f =faktorial(n);
        System.out.println();
        System.out.println("=======================");
        System.out.println("Faktorial " + n + " = " + f);


    }
    public static int faktorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            if (f > 0) {
                f = f * i;
            }
        }
        return f;
    }
}
