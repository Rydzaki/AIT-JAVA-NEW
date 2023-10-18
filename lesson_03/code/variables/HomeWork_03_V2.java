package variables;

public class HomeWork_03_V2 {
    public static void main(String[] args) {
        // круг
        double res = radius(100); // S круга
        double cons = pi(); // число Пи
        System.out.println("Площадь окружности: " + res);

        // квадрат
        double res_sq = square(10); // S
        System.out.println("Площадь квадрата: " + res_sq);

        // прямоугольник
        //double res_rec = rectangle(sideA(10) * sideB(20));
        int A = 10;
        int B = 20;
        //double C = A; смотел как можно вносить дополнительные переменные в метод
        //double D = B;
        double res_rec = add(A, B); // add(A, B, C, D)
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
    public static double add(double A, double B){ // (double A, double B, double C, double D)
        //double res_rec = A * B; // (A+B+C+D)
        //return res_rec;
        return A * B; // можно и так сократить убрать лишнюю переменную!!!

    }
}
