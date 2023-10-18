package prictice;

public class HW_14_ArrMetod {

    public static int[]  randomArray10 (int a, int b){
        int [] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (b -a + 1)+ a);
        }
        // напечатаем полученный массив
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
        return arr;
    }
    public static int[]  randomArray20 (int a, int b){
        int [] arr = new int [20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (b -a + 1)+ a);
        }
        // напечатаем полученный массив
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
        return arr;
    }

    //сплит метод печатает разрывы строки
    public static void split (){
        System.out.println("++++++++++++++++++++++++++++++++");

    }
    // сортировка выбором от MAX to MIN
    public static int [] sortArrayMax (int [] arr){
        int max; // первый элемент массива которыцй мы считаем потенциальным макс
        int indexMax;
        for (int i = 0; i < arr.length; i++) {
            max = arr[i];
            indexMax = i;
            for (int j = i +1; j < arr.length; j++) { // цикл начинается I!!!
                if (arr [j] > max) {
                    max = arr [j];
                    indexMax = j;
                }
                // переставляем макс элемент в начало массива
            }
            int temp = arr[i];
            arr[i] = arr[indexMax]; // становится
            arr [indexMax] = temp;

        }
        return arr;

    }
    //  сортировка выбором от мин к макс
    public static int[] sortArrayMin(int[] arr){
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
    // пузырьковая сортировка от мин к макс
    public static void bubbleSortMin(int[] arr){
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
    // пузырьковая сортировка от макс к мин
    public static void bubbleSortMax(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length -1 -i; j++) { // правый конец будет двигаться на встречу левому( к начала)
                if (arr [j] < arr[j+1]) { // если левый из соседей больше правого, то меняем их местами
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
