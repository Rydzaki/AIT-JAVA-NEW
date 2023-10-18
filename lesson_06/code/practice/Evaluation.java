package practice;

import java.util.Scanner;

public class Evaluation {
    public static void main(String[] args) {

        int timeForGame = 60; // сколько разрешено играть на компе

        Scanner scanner = new Scanner(System.in); // включили ввод данных с клавиатуры
        System.out.println("Input today's mark"); //приглашение ко вводу данных
        int mark = scanner.nextInt(); //получение оценки с клавиатуры

        switch (mark) {
            case 1 -> {
                System.out.println("Good child"); // похвалили
                timeForGame = timeForGame + 30; //увеличили время
                System.out.println("Time for game " + timeForGame + " min");
            }
            case 2 -> {
                System.out.println("Sher gut");
            }
            case 3 -> {
                System.out.println("Not so good");
                timeForGame = timeForGame - 30; // уменьшаем время
                System.out.println("Time for game " + timeForGame + " min");
            }
            case 4 -> {
                System.out.println("Very bad");
                timeForGame = 0;// обнуляем время
                System.out.println("Time for game " + timeForGame + " min");
            }
            case 5 -> {
                System.out.println("Shane you!");
                System.out.println("No games for 2 days!");
            }
            default -> { //если пользоаптель ввел чтото другое
                System.out.println("Wrong input");
            }
        }
    }
}


