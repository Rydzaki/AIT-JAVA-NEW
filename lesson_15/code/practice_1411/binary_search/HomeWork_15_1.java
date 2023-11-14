package practice_1411.binary_search;

import java.util.Random;

public class HomeWork_15_1 {

    public static void main(String[] args) {
        int [] array = HW_metods.randomArr20(-100, 100); // создали массив
        HW_metods.split();
        HW_metods.printArr(HW_metods.sortedSort(array)); // печать сортированного масиива
        HW_metods.split();
        int num = 10;
        int index = HW_metods.binarySearch(array, num); // поиск индекса
//        for (int i = 0; i < array.length; i++) {

            // System.out.println("Index = " + index); // что нм вернул метод сортировки
            if (index >= 0) { // мы изменили интерпритацию полученного индекса
                System.out.println(0 + " presents in array, index = " + index);
            } else {
                System.out.println(0 + " doesn't preset in array, index for possible position is " + (-index -1));
//            }
        }
        // System.out.println("Index: " + index);
        ; // можно добавить if чтобы если 0 отсутствует печало (index* -1(-1))
        HW_metods.split();

        // Задача 3. Создать массив из 20-ти случайных целых
        // чисел из интервала от -100 до 100. Реализуйте метод,
        // который получает на вход исходный массив и возвращает массив,
        // содержащий только положительные числа из исходного массива.

        int [] array2 = HW_metods.randomArr20(-100, 100); // создали массив
        HW_metods.split();
        HW_metods.sortedPlus(HW_metods.sortedSort(array2));
        HW_metods.split();


        //Задача 4.(*) Реализовать способ обмена значениями двух
        // переменных целого типа, не используя третьей переменной.
        // В идеале написать метод swap(a, b).
Random random = new Random();
        int a = random.nextInt(99);
        int b = random.nextInt(99);

        System.out.print("a = "+ a + "; "+ "b = "+ b);
        System.out.println();
        HW_metods.split();
        swap(a, b);
    }
    public static void swap (int a, int b){
        a = a + b; //15
        b = a - b; // 15 - 10 = 5
        a = a - b; // 15 - 5 = 10
        System.out.print("a = "+ a + "; "+ "b = "+ b);
    }
}
