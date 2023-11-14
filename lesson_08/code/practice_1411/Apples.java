package practice_1411;

public class Apples {
    public static void main(String[] args) {

        int apples = 30; // стартовые значения
        int counter = 0;   // счетчик цикла
        int applesInCycle = apples; // параметр цикла

        while (applesInCycle > 0){
            // тело цикла
            System.out.println("Take one apple from basket " + applesInCycle);
            applesInCycle --; // изменяем параметр цикла (-1)
            counter ++; // (+1) колличество выполненных операций

        }

        System.out.println("the job is done, total apples "+ counter+ " added in pie.");


    }
}
