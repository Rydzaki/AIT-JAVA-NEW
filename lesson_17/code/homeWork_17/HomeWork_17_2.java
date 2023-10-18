package homeWork_17;

import java.util.Random;

public class HomeWork_17_2 {
    public static void main(String[] args) {

        Random random = new Random();
        int r = random.nextInt(30);

        int[] pelmeshka = new int[30];

        int minPelmen = 25;
        int maxPelmen = 35;

        for (int i = 0; i < pelmeshka.length; i++) { // создаем рандомный массив
            pelmeshka[i] = (int) (Math.random() * (maxPelmen - minPelmen + 1) + minPelmen);
        }
        print(pelmeshka);
        System.out.println();

        for (int i = 0; i < pelmeshka.length; i++) { // можно убрать цикл for здесь не нужен для перебора здесь
            pelmeshka[r] = pelmeshka[i] + 15;
        }
//        print(pelmeshka); // для проверки работы рандома
//
//        sortArrayMin(pelmeshka); // хотел использовать метод сортировки и выбрать последний элемент
//        System.out.println(pelmeshka[-1]);

        for (int i = 0; i < pelmeshka.length; i++) {
            int l = 0;
            if (pelmeshka[i] >= 40) {
                System.out.println("You have a lucky pelmeshka index: " + i);
            }
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
    }

//    public static int[] sortArrayMin(int[] arr){
//        int min = arr[0]; // первый элемент массива
//        int IndexMin = 0;
//        for (int i = 0; i < arr.length; i++) {
//            min = arr[i]; // элемент
//            IndexMin = i; // индекс
//            for (int j = i; j < arr.length; j++) {
//                if(arr [j] < min){
//                    min = arr[j];
//                    IndexMin = j;
//                }
//            }
//            // переставляем минимальный элемент в начало массива
//            int temp = arr [i];
//            arr[i] = arr [IndexMin];
//            arr[IndexMin] = temp;
//        }
//        return arr;


}

