package practice;

import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        //задаем массив

        int[] randomInt = new int[10];
        int a = -20;
        int b = 20;
//        int n = (int)(Math.random() * (b - a + 1) + a) - генерирует случайное **целое** число в интервале [a, b]
//        a  - может быть, b  - может быть

        for (int i = 0; i < randomInt.length; i++) {
            randomInt[i] = (int)(Math.random() * (b -a + 1)+ a);
        }
        // напечатаем полученный массив

        for (int i = 0; i < randomInt.length; i++) {
            System.out.print(randomInt[i] + " | ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int num = scanner.nextInt();

        boolean isInArray = searchInArray(randomInt, num);
        //boolean isInArray = searchInArray(int[] arr, int n); пример оформления
        if(isInArray){
            System.out.println("Number "+ num + " presents in array");
        } else {
            System.out.println("Number "+ num + " does not presents in array");
        }
    }
    public static boolean searchInArray (int[] arr, int n){
        boolean res  = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == n){
                res = true;
            }
        }
        return res;

    }
}
