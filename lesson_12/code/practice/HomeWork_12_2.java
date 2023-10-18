package practice;
//Задача 2. Бросьте кубик с 6-ю гранями 20 раз. Подсчитайте, сколько
//раз выпала каждая цифра.
public class HomeWork_12_2 {
    public static void main(String[] args) {

        int[] kub = new int[20];
        int a = 1;
        int b = 6; //начало и конец массива
        // заполняем массив с цифрами
        for (int i = 0; i < kub.length; i++) {
            kub[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        String[] prob = {"one", "two", "three", "four", "five", "six"};
        printArray(kub); //печать
//        int one = 0;
//        int two = 0;
//        int three = 0; // СЧЕТЧИКИ
//        int four = 0;
//        int five = 0;
//        int six = 0;
        int [] count = new int[6]; // счетчик

        for (int j = 0; j < kub.length; j++) {
            int temp = kub[j]; // временная
            count[temp -1]++; // цифры 1-6 индексы 0-5
            }

        for (int i = 0; i < prob.length; i++) {
            System.out.println(prob[i] + " = " + count[i] + "|" + (double) count[i] / 20);
        }
    }
    public static void printArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
            }
        System.out.println();
        }
    }
