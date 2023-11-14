package practice_1411;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        // алгоритм
        // какое-то любое целое число n делить на числа меньше его, начиная с 2
        // 10/2 = 5 - не простое число, 11 делим на 2, на 3, на 4...10 если не разделилось, то число ПРОСТОЕ

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number: ");
        int number = scanner.nextInt();

        boolean isPrime = true;
        int div = 2; // делитель

        while (div < number){
            if(number % div == 0)  { // если разделилось число на цело
                isPrime = false;
                // выход из цикла. Можно выходить из цикла
            }
            div++; //увеличивем параметр делителя
        }
        System.out.println(number + " is prime "+ isPrime);



    }
}
