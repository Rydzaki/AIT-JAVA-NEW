package practice_1411;

public class HW_13_ArrMethod {

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
    //  сортировка выбором от мин к макс
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
    // возврат рандомного массива
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
    // поиск минимального элемента
    public static int minArray (int[] arr){
        int min = arr [0]; //первое приближения для минимума
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){ // если текущий элемент меньше минимума
                min = arr[i]; // минимум принимает наибольший текущий элемент, до конца массива
            }
        }
        return min;
    }
    // поиск минимального индекса
    public static int minArrayIndex (int[] arr){
        int min = arr [0]; //первое приближения для минимума
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) { // если текущий элемент больше макса
                min = arr[i]; // минимум принимает наименьший текущий элемент, до конца массива
                minIndex = i; // присваиваем переменной число (текущий индекс) мин
            }
        }
        return minIndex;
    }
    // сортировка выбором от MAX to MIN
    public static int [] sortArrayAsc (int [] arr){
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

}
