package practice_1411;

//Создайте массив из 20 целых чисел в интервале от 10 до 30. Выведите массив на печать.
// Поменяйте местами первый и
// последний элементы массива и снова выведите массив на печать.

public class HomeWork_10_2 {
    public static void main(String[] args) {

        int[] row = new int[21];

        for (int i = 0; i < row.length; i++) {
            row[i] = 10 + i;
        }
        for (int i = 0; i < row.length; i++) {
            System.out.print(row[i]+ "|");
        }
        System.out.println();
        System.out.println();
        int temp1 = row[0];
        int temp2 = row[20];

        row[20] = temp1;
        row[0] = temp2;

        for (int i = 0; i < row.length; i++) {
            System.out.print(row[i]+ "|");
        }
    }
}
