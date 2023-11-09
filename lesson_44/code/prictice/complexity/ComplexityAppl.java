package prictice.complexity;

import java.util.Arrays;

public class ComplexityAppl {
    public static void main(String[] args) {
        //заведем простой массив целых чисел
        // будем выполнять операции( сложение, среднее, поиск мин макс, сортировка)

        // оценим вычислительную сложность алгоритма

        int[] arr = {-24, 7, -67, 15, 8, 93, 1};
        /*
        - узнать длинну массива
        - в цикле скаладывается
        - сумма делится
         */
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length; // кастинг в другой тип
        System.out.println(avg);


        // вычисление среднего значения

        // коллличество операций прямо пропорцианально колличеству элементов
        // О(n) - это вычислительная сложность

        //Arrays.sort(arr); //сортирует целые числа
        /*
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------");
        int index = Arrays.binarySearch(arr, -67);
        System.out.println(index);
         index = Arrays.binarySearch(arr, 93);
        System.out.println(index);
         index = Arrays.binarySearch(arr, -100);
        System.out.println(index);
        */
        // сортировка бабл сорт сравниваем по два элемента i -текущий, i+1 - следующий
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    // переставим элементы местами

                    int temp = arr[j];
                    arr[j] = arr[j+1];

                    arr[j+1] = temp;

                }
            }

        }
        System.out.println(Arrays.toString(arr));
        // O(n ^ 2)
        Arrays.sort(arr); //сортирует целые числа
        System.out.println(Arrays.toString(arr));
        // сложность в методе sort - полилинейная






    }
}
