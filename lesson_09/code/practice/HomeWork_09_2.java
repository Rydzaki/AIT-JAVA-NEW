package practice;


import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

//Задача 2. Определение времени суток. Напишите программу, которая принимает текущий час (от 0 до 23) и выводит
//        приветствие в зависимости от времени суток (утро, день, вечер, ночь).
public class HomeWork_09_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущее час");

        int time = scanner.nextInt();

        String morning = "Доброе утро!";
        String afternoon = "Добрый день!";
        String evening = "Добрый вечер!";
        String night = "Доброй ночи!";

        if (time >= 6 && time < 12){
            System.out.println(morning);

        } else if (time >=12 && time < 17) {
            System.out.println(afternoon);
        } else if (time >= 17 && time < 21) {
            System.out.println(evening);
        } else {System.out.println(night);}
        }
    }
