package practice;

import java.util.Scanner;

public class HomeWork_07_2 {
    public static void main(String[] args) {
        Scanner question = new Scanner(System.in);
        System.out.println("Привет мой друг как тебя зовут?");
        String question1 = question.next();
        System.out.println("Приятно познакомится " + question1 + " я R2T2 - бот-собеседник");

        Scanner question2 = new Scanner(System.in);
        System.out.println("Какой у тебя вес " + question1 + " в килограммах ?");
        double answer2 = question2.nextDouble();

        Scanner question3 = new Scanner(System.in);
        System.out.println("А какой у тебя " + question1 + " рост сантиметрах?");
        double answer3 = question3.nextDouble();

        double IMT1 = imt(answer2, answer3);
        int IMT = (int) IMT1;
        // System.out.println(IMT);


        if (IMT < 15) {
            System.out.println("Тебе бы к врачу надо, " + question1 + " твой индекс массы тела: " + IMT);
        } else if (IMT >= 15 & IMT < 20) {
            System.out.println("Кто-то у нас стройняшка, не забывай кушать, " + question1 + " твой индекс массы тела: " + IMT);
        } else if (IMT >= 20 & IMT < 25) {
            System.out.println("Поздравляю ты в отличной форме, " + question1 + " твой индекс массы тела: " + IMT);
        } else if (IMT >= 25 & IMT < 30) {
            System.out.println("Ну к пляжному сезону еще успеешь приготовиться, " + question1 + " твой индекс массы тела: " + IMT);
        } else if (IMT >= 30 & IMT < 35) {
            System.out.println("Тебе бы на диетке посидеть, " + question1 + " твой индекс массы тела: " + IMT);
        } else if (IMT >= 35 & IMT < 40) {
            System.out.println("Одной диетой делу не поможешь, " + question1 + " твой индекс массы тела: " + IMT);
        } else if (IMT >= 40) {
            System.out.println("Ну хорошего человека должно быть много, " + question1 + " твой индекс массы тела: " + IMT);
        }
    }

    public static double imt(double a, double b) {
        return a / (b/100 * b/100);
    }
}

