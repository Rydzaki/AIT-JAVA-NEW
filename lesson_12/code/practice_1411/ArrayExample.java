package practice_1411;

public class ArrayExample {
    public static void main(String[] args) {

        int[] array = {75, -275, 34, -15, -123, 57, -145, 86, 77, -275, 48, -59, -275};
        int[] array1 = {0, 1, 3, 4, 5, 6};



        System.out.println("Minimum of array is: " + mineElOfArray (array));

        // mineElOfArray (array1); // длинная версия: int m = mineElOfArray (array1)

        int i = minElOfArrayIndex(array);

        System.out.print("Index of array is: " + i);

    } // end of mine
    // =======Method===========

    public static int minElOfArrayIndex (int[] array){ // нашел и вернул индекс минимального элемент

        // пробегаем по всему массиву каждый элемент сравним с минимумом
        int min = array[0];
        int indexMin = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min){ // если элемент массива с индексом i меньше min
                min = array[i];
                indexMin = i;
            }
        }
        return indexMin;
    }
    public static int mineElOfArray (int[] array){ // нашел и вернул минимальный элемент
        // пробегаем по всему массиву каждый элемент сравним с минумумом
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){ // если элемент массива с индексом i меньше min
                min = array[i];
            }
        }
        return min;
    }



    // ==========End of method ===============
}
