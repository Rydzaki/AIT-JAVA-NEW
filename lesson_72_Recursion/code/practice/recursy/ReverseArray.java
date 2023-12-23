package practice.recursy;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        Integer[] arr = {1, 3, 6, 9, 11, 13, 15, 17, 19, 21, 10}; // массив как есть
        // reverse {21, 19, 17, ... 6, 3, 1};
        Arrays.stream(arr).forEach(a -> System.out.print(a+ " | "));
        System.out.println();

        reverseArrayRecursion(arr);// разворот массива
        Arrays.stream(arr).forEach(a -> System.out.print(a+ " | "));
        System.out.println();

    }

    public static <T> void reverseArrayRecursion(T[] arr) { // для любого типа данных массива
        // меняем первый элемент с последним и тд...
        reverseArrayRecursion(arr, 0, arr.length-1);
    }
    public static <T> void reverseArrayRecursion(T[] arr, int left, int right  ){
        if(left >= right){
            return;}

        T tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;

        reverseArrayRecursion(arr, left +1, right -1);// вызываем с новыми значениями
    }
}
