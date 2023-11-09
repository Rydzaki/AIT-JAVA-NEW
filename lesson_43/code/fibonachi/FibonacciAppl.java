package fibonachi;

import java.util.Iterator;

public class FibonacciAppl {

    public static void main(String[] args) {


        Fibonacchi fibonacci = new Fibonacchi(21);

        Iterator<Integer> iterator = fibonacci.iterator();
        int sum = 0;
        int sum1 = 0;
        while (iterator.hasNext()) {
            int f = iterator.next();
            System.out.print(f + " | ");

            // todo - распечатать первые 8 чисел из ряда

            // 1, 1, 2, 3, 5, 8, 13, 21

            sum += f;
            // TODO - сложить все эти числа
            //sum ==54
        }
        System.out.println();
        System.out.println("Sum = " + sum);




        for (Integer integer: fibonacci){
            System.out.print(integer + " | ");
            sum1 += integer;

        }
        System.out.println();
        System.out.print(sum);
    }
}
