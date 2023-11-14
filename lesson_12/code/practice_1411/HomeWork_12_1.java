package practice_1411;

//Задача 1. Напишите метод, принимающий массив целых чисел, и печатающий его в
//        обратном порядке. Сначала последний элемент, потом предпоследний, и т.д.
//
//        Измените (лучше скопируйте и сделайте еще один метод) метод так, чтобы
//        он работал с
//        массивом, заполненном "цифрами прописью": zero, one, two, three, ...,
//        nine Выполните "разворот" это массива.

public class HomeWork_12_1 {
    public static void main(String[] args) {

        int[] randomInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] randomStr = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        reversArray(randomInt);
        reversArray(randomStr);

        for (int i = 0; i < randomInt.length; i++) {
            System.out.print(randomInt[i] + " ; ");
        }
        System.out.println();

        for (int i = 0; i < randomStr.length; i++) {
            System.out.print(randomStr[i] + " - ");
        }
    }

    public static void reversArray(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i]; // создаем временную переменную
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
    public static void reversArray(String [] arr) { // перегрузка методов, можно использовать одно и тоже имя для методов с разными типами переменных
        String temp = " ";
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i]; //
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}


