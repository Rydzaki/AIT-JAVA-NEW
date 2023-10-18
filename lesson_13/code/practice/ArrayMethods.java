package practice;

public class ArrayMethods {

    // печать массива
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "|");
        }
        System.out.println();
    }
    // печать массива типа String
    public static void printArray(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "|");
        }
        System.out.println();
    }
    // ищем максимум массива с целыми числами
    public static int maxArray (int[] arr){
        int max = arr [0]; //первое приближения для максимума
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){ // если текущий элемент больше макса
                max = arr[i]; // макс принимает наибольший текущий элемент, до конца массива
            }
        }
        return max;
    }
    // ищем ИНДЕКС максимального элемента
    public static int maxArrayIndex (int[] arr){
        int max = arr [0]; //первое приближения для максимума
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) { // если текущий элемент больше макса
                max = arr[i]; // макс принимает наибольший текущий элемент, до конца массива
                maxIndex = i; // присваевам переменной число (текущий индекс) макса
            }
        }
        return maxIndex;
    }
    // пузырькова сортировка от мин к макс
    public static int[] sortArray(int[] arr){
        int min = arr[0]; // первый элемент массива
        int IndexMin = 0;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i]; // элемент
            IndexMin = i; // индекс
            for (int j = i; j < arr.length; j++) {
                if(arr [j] < min){
                    min = arr[j];
                    IndexMin = j;
                }
            }
            // переставляем минимальный элемент в начало массива
            int temp = arr [i];
            arr[i] = arr [IndexMin];
            arr[IndexMin] = temp;
        }
        return arr;
    }
    //сплит метод печатает разрывы строки
    public static void split (){
        System.out.println("++++++++++++++++++++++++++++++++");

    }
    public static void randomArray(int a, int b){

    }

}
