package practice;

public class Abiturient {
    public static void main(String[] args) {
        // объявили и заполнили массив
        int[] marks = {2, 3, 3, 1, 4, 1, 3, 2, 1, 2, 3, 1, 2};

        int sumOfMacks = 0;
        for (int i = 0; i < marks.length; i++) {
            //sumOfMacks = sumOfMacks + marks[i]; // сумма всех элементов массива
            sumOfMacks += marks[i]; // короткая версия
        }
        double averMark = (double) sumOfMacks / marks.length; // провели кастинг (смену типа переменной)
        System.out.printf("%.2f", averMark); // оставили 2 знака после запятой

    }
}
