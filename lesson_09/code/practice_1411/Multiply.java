package practice_1411;

public class Multiply {
    public static void main(String[] args) {

        int n = 1;
        int m = 1;

        while (n < 10){
            while (m <= 10){
                System.out.print(n + " * "+ m + " = " + n*m + " | ");
                m++;

            }
            System.out.println(); //переход на следующую строку
            m = 1; // сбросили м на начальное значение
            n++; // увеличиваем n на 1
        }
    }
}
