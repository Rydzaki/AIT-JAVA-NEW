package practice_1411.comparator_urils;

import java.util.Comparator;
import java.util.function.Predicate;

public class ArrayTools {

    public static void  printArray(Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("--------------------------------");
    }
//    public static int search(Object[] arr, Object value){
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i].equals(value)){
//                return i;
//            }
//        }
//        return -1;
//    }

    public static <T> int search(T[] arr, T value){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(value)){
                return i;
            }
        }
        return -1;
    }

    public static <T>  T findByPredicate(T[] arr, Predicate<T> predicate){ // предикат гарантирует что у объекта есть метод "тест" булевн
        for (int i = 0; i < arr.length; i++) {
            if (predicate.test(arr[i])){
                return arr[i];
            }
        }
        return null;

    }

    public static <T extends Comparable<T>> void bubbleSort(T[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                //if (arr[j] > arr[j +1])
                if (arr[j].compareTo(arr[j + 1]) > 0){
                    T t = arr[j]; //временная переменная
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public static <T> void bubbleSort(T[] arr, Comparator<T> comparator){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                //if (arr[j] > arr[j +1])
                if (comparator.compare(arr[j], arr[j + 1]) > 0){
                    T t = arr[j]; //временная переменная
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

}
