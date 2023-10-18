package prictice;

public class BubbleSortV2 {

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length -1 -i; j++) { // правый конец будет двигаться на встречу левому( к начала)
                if (arr [j] > arr[j+1]) { // если левый из соседей больше правого, то меняем их местами
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    // печать массива
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
    }

}
