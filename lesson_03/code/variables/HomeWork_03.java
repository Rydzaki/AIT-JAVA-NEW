package variables;

public class HomeWork_03 {
    // Метод вычисляющий площадь круга;
    // Метод вычисляющий площадь квадрата;
    // Метод вычисляющий площадь прямоугольника (чуть сложнее чем 1. и 2.);
    // В методе main вызвать вышеуказанные методы с различными аргументами, и результаты вывести в консоль.

    public static void main(String[] args) {
        // круг
        double res = radius(100); // S круга
        double cons = pi(); // число Пи
        // double R = radius(10); // радиус окружности
        System.out.println("Площадь окружности: " + res);
        // System.out.println(cons);

        // квадрат
        double res_sq = square(10); // S
        System.out.println("Площадь квадрата: " + res_sq);

        // прямоугольник
        //double res_rec = rectangle(sideA(10) * sideB(20));
        double sideA = side1(10);
        double sideB = side2(20);
        double res_rec = sideA * sideB;
        System.out.println("Площадь прямоугольника: " + res_rec);

    }

    public static double pi() {
        double pi = 3.1415926;
        return pi;

    }

    public static double radius(double radius) {
        double S = pi() * radius * radius;
        return S;
    }

    // метод квадрата
    public static double square(double square) {
        double Sq = square * square;
        return Sq;
    }

    // прямоугольник
    public static double side1(double side1) {
        double A = side1;
        return A;
    }

    public static double side2(double side2) {
        double B = side2;
        return B;
    }
}