package practice;

//Задача 2. Бросьте кубик с 6-ю гранями 20 раз. Подсчитайте, сколько
//раз выпала каждая цифра.

public class HW_12_2 {
    public static void main(String[] args) {

        int[] kub = new int[20];
        int a = 1;
        int b = 6; //начало и конец массива
        // заполняем массив с цифрами
        for (int i = 0; i < kub.length; i++) {
            kub[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        String[] prob = {"one", "two", "three", "four", "five", "six"}; // массив с названиями граней

        printArray(kub); //печать
        System.out.println(); // отступ строки

        int [] countsKud = new int[6]; // массив для хранения результатов
        for (int i = 0; i < kub.length; i++) {
            int temp = kub[i]; // вводим временную переменную для хранения текущего элемента
            countsKud [temp -1]++; // цифр 6, индекс цифра -1
        }
//        for (int i = 0; i < countsKud.length; i++) { // проверка массива
//            System.out.print(countsKud[i] + " - ");
//        }
//        System.out.println("результаты");
//        System.out.println();

        for (int i = 0; i < prob.length; i++) {
            System.out.println(prob[i] + " = " + countsKud[i] + "|" + (double) countsKud[i] / 20);} // собираем результат
    }
    public static void printArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
    }

}
