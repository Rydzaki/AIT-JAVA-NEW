package prictice;
// Задача 3. В сберкассу на трёхпроцентный вклад положили s рублей.
// Какой станет сумма вклада через n лет. Использовать цикл for.

import java.util.Scanner;

public class HomwWork_14_repeat_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input money: ");
        int s = scanner.nextInt();

        System.out.println("Input years: ");
        int n = scanner.nextInt();

        System.out.println("Input %: ");
        int p = scanner.nextInt();


        double sum = s;

        for (int i = 0; i <= n; i++) {
            if (sum  > 0){
                sum = sum + (sum * (p *0.01)) ;
            }
        }
        String ege =" ";
        switch (n){
            case 2, 3, 4 -> ege = "года";
            case 1 -> ege = "год";
            case 5, 6, 7, 8, 9, 10 -> ege = "года";
        }

        System.out.printf("За период: " + n + ege+ " вы заработаете: %.2f", sum);

    }
}
