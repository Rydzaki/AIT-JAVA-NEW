package practice_1411;

import java.util.Scanner;

//Задача 4. (*) Вводится шестизначное число (номер автобусного билета). Определите, является ли этот билет "счастливым"
// (сумма первых трех цифр равна сумме трех последних цифр).
public class HW_08_4_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number ***-***");
        int number = scanner.nextInt();

        int sum1 = 0;
        int sum2 = 0;
        int count = 0;


        while (number > 0) {
            int number1 = number % 10;
            number /= 10;
            count++;

            if (count <= 3) {
                sum1 += number1;
            } else {
                sum2 += number1;
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);

        if (sum1 == sum2){
            System.out.println("You have a lucky ticket");
        }else {
            System.out.println("You don't have a lucky ticket");}

    }//100 000
    //99 999
}
