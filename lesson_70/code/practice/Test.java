package practice;

public class Test {
    public static void main(String[] args) {
        int[] arr = {12, 32, 23, 432, 24, 44, 76, 838, 543, 899, 2, 4, 7};

        System.out.println("Неотсортированный массив: ");
        for (int i: arr) {
            System.out.print(i+ " ");
        }
        System.out.println("\n------------------------------------------");
        System.out.println("Отсортированный массив: ");
        bubblesort(arr);
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n============Binary Search=======================");

        int target = 76;
        int result = binarySearch(arr, target);

        if(result == -1){
            System.out.println("Искомый элемент не найден");
        } else {
            System.out.println("Искомый элемент найден под индексом: "+ result);}
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            //int middle = (int) Math.floor((start + end)/2);
            int middle = start +(end - start) / 2;

            if (arr[middle] == target){
                return middle; // элемент найден возвращаем его индекс
            }
            if (arr[middle] < target){
                start = middle + 1; // искомый элемент в правой половине массива
            }
            if(arr[middle] > target){
                end = middle -1; // искомое значение слева
            }
        }
        return -1; // вернуть -1 если элемент не найден
    }

    private static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j +1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


}
