package practice;

// Задача 1. Написать метод, принимающий массив целых чисел, и возвращающий
// сумму всех его нечетных элементов (не индексы!, а сами элементы).
public class HomeWork_11_1 {
    public static void main(String[] args) {

        int[] randomInt = new int[10];
        int a = -10;
        int b = 10;
        int sum =0;

        fillArray(randomInt, a, b);
        printArray(randomInt);

        System.out.println();



        for (int i = 0; i < randomInt.length; i++) { // создаем рандомный масив
            randomInt[i] = (int)(Math.random() * (b -a + 1)+ a);}

        for (int i = 0; i < randomInt.length; i++) { // печатаем созданный массив
            System.out.print(randomInt[i] + " | ");
        }

        for (int i = 0; i < randomInt.length; i++) { // определяем черные числа и суммируем их
            if (randomInt[i] % 2 != 0){
                sum += randomInt[i];
            }

        }
        System.out.println();
        System.out.print("Сумма нечетных чисел = " + sum);
    }
    public static void fillArray(int[] arr, int a, int b) {
        for (int i = 0; i < arr.length; i++) { // создаем рандомный массив
            arr[i] = (int)(Math.random() * (b -a + 1)+ a);}
    }
    public static void printArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " | ");
        }
    }

}
