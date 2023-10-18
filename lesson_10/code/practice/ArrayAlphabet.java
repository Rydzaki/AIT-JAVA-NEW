package practice;

public class ArrayAlphabet {
    public static void main(String[] args) {

        int[] arrayNum = new int[20]; //объявили массив
        // цикл заполнениыя данными
        for (int i = 0; i < arrayNum.length; i++) { // ввели новую переменную и запускаем цикл
            arrayNum[i] = i + 1; //заполняем элементы массива
            //System.out.print(i + " | ");
        }
        //запускаем цикл для печали массива
        for (int i = 0; i < arrayNum.length; i++) {

            System.out.print(arrayNum[i] + ", ");

        }
        System.out.println();
        System.out.println("Нулевой по индексу элемент " + arrayNum[0]);
        System.out.println("19-й по индексу элемент " +arrayNum[19]);

        //System.out.println("20-й по индексу элемент " + arrayNum[20]); // Выход за пределы массива

        char[] alphabet = new char[26]; //длинна массива, сколько элементов в массиве

        // заполнение

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) (65 + i); // 65 это код буквы А (char) приведение int к типу 



        } // печать массива
        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");

        }

    }
}
