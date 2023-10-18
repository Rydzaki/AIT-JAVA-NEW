package practice.binary_search;

public class HW_metods {

    // random
    public static int[]  randomArr20 (int a, int b){
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

    public static void printArr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
    }

    // sort

    public static int binarySearch(int[] arr, int n) {
        int left = 0;                    // Устанавливаем начальный индекс слева массива.
        int right = arr.length - 1;      // Устанавливаем начальный индекс справа массива.

        while (left <= right) {          // Пока индекс слева не станет больше индекса справа.
            int mid = (left + right) / 2;  // Находим средний индекс массива.

            if (arr[mid] == n) {         // Если значение по среднему индексу равно искомому числу.
                return mid;              // Возвращаем индекс среднего элемента, который равен искомому числу.
            } else if (n < arr[mid]) {   // Если искомое число меньше значения по среднему индексу.
                right = mid - 1;         // Уменьшаем правую границу поиска на одну позицию левее среднего элемента.
            } else {                     // Иначе (искомое число больше значения по среднему индексу).
                left = mid + 1;          // Увеличиваем левую границу поиска на одну позицию правее среднего элемента.
            }
        }

        // Если элемент не найден, возвращаем отрицательное значение.
        // Это значение может быть использовано для определения, где элемент должен быть вставлен, если это необходимо.
        return -left - 1;
    }


    public static int[] sortedSort(int[] arr){
        int min = arr[0];
        int indexMin = 0;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            indexMin = i;
            for (int j = i; j < arr.length; j++) {
                if( arr[j] < min ) {
                    min = arr[j];
                    indexMin = j;
                }
            }
            // переставляем минимальный элемент в начало
            int tmp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = tmp;
        }
        return arr;
    }

    //сплит метод печатает разрывы строки
    public static void split (){
        System.out.println("++++++++++++++++++++++++++++++++");

    }
    public static void sortedPlus(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            if (arr [i] > 0){
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println();
    }
}
