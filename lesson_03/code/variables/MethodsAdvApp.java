package variables;

public class MethodsAdvApp {
    public static void main(String[] args) {
        // длина окружности l= 2 * Pi * r
        double cons = pi();
        //System.out.println(cons);
        printPi(cons);
        double res = circleLenght(100); // в скобках это радиус окружности
        System.out.println("L = " + res);

    }

    public static double circleLenght(double radius) {
        double l = 2 * pi() * radius;
        return l; // возвращает в метод значение L
    }

    public static void printPi(double pi) { // возвращает дабл
        //System.out.println("Pi = " + pi);
    }


    public static double pi() { // double метод должен вернуть такой тип
        double pi = 3.1415926;
        return pi;
    }
}
