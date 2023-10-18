package practice;

// Задача 2. Написать метод, принимающий массив целых чисел, и
// возвращающий произведение всех его элементов с четными индексами.

public class HomeWork_11_2 {
    public static void main(String[] args) {

        int[] randomInt = new int[10];
        int a = -10;
        int b = 10;
        int sum = 0;

        for (int i = 0; i < randomInt.length; i++) { // создаем рандомный масив
            randomInt[i] = (int)(Math.random() * (b -a + 1)+ a);}

        for (int i = 0; i < randomInt.length; i++) { // печатаем созданный массив
            System.out.print(randomInt[i] + " | ");
        }
        for (int i = 0; i < randomInt.length; i++) { // определяем черные числа и суммируем их
            if (i % 2 == 0){
                sum += randomInt[i];
            }
        }
        System.out.println();
        System.out.print("Сумма чисел c четными индексами = " + sum);
    }
}
