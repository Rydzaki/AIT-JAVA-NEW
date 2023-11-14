package practice_1411;

public class HomeWork_10_3 {

//    Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
//    Найдите максимальный элемент массива и его индекс.

    public static void main(String[] args) {

        int[] row = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};

        int indexMax = 0;

        //System.out.println(Arrays.stream(row).max());

        for (int i = 0; i < row.length; i++) {
            if (row[i] > row[indexMax]) {
                indexMax = i;

            }
        }
        System.out.println("Maximum in array: " + row[indexMax]);
        System.out.println("Index in array: " + indexMax);

    }
}
