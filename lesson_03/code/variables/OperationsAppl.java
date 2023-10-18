package variables;

public class OperationsAppl {
    public static void main(String[] args) {

        // operations with integer numbers
        int x = 20; //объявили переменную
        int y = 10; // вторая переменная
        int z = x + y; //сложение

        System.out.println("Sum x:" + x + " + y:" + y + " = " + z);
        System.out.println(x + y + z);
        System.out.println(x + "; " + y);

        z = x * y;

        System.out.println(z);
    }
}
