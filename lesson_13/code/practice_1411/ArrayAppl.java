package practice_1411;

public class ArrayAppl {
    public static void main(String[] args) {
        ArrayMethods.split();

        int[] number = {8, 9, 12, 65, 98, 3, 57, 4, 1, 22};
        ArrayMethods.printArray (number);
        int max = ArrayMethods.maxArray(number);
        int maxIndex = ArrayMethods.maxArrayIndex(number);
        System.out.println("Maximum = " + max);
        System.out.println("Max index = "+ maxIndex);
        ArrayMethods.sortArray(number); //выполняем сортировку
        ArrayMethods.printArray(number); //Печатаем после сортировки
        ArrayMethods.split();

        int [] number2 = {-5, 56, -100, 0, 15, 52, 67, 8, 1};
        ArrayMethods.printArray(number2);
        int max2 = ArrayMethods.maxArray(number2);
        int maxIndex2 = ArrayMethods.maxArrayIndex(number2);
        System.out.println("Maximum = " + max2);
        System.out.println("Max index = "+ maxIndex2);
        ArrayMethods.sortArray(number2); //выполняем сортировку
        ArrayMethods.printArray(number2); //Печатаем после сортировки
        ArrayMethods.split();

        String[] digits = {"one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine"};
        ArrayMethods.printArray(digits);






    }
}
