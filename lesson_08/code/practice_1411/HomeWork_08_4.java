package practice_1411;

import java.util.Scanner;

//Задача 4. (*) Вводится шестизначное число (номер автобусного билета). Определите, является ли этот билет "счастливым"
// (сумма первых трех цифр равна сумме трех последних цифр).
public class HomeWork_08_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number ***-***");
        int number = scanner.nextInt();

        //int number1 = number;

        int sum1 = 0; // первые слева 3 цифры
        int sum2 = 0;

        while (number > 999 & number < 1000000) {
           int number1 = number % 10;
            number /= 10; // убиваю переменную number на последние 3 цифры циклом
            sum2 += number1;
        }
        //System.out.println(number);

        while (number > 0) { // & number < 1000 - не нужно дополнительное условие/ number заходит уже меньше на 3 цифры
            int number1 = number % 10;
            number /= 10;
            sum1 += number1;
        }
        //System.out.println(sum1);
        //System.out.println(sum2);

        if (sum1 == sum2){
            System.out.println("You have a lucky ticket");
        }else {
            System.out.println("You don't have a lucky ticket");}

    }//100 000
      //99 999
}
