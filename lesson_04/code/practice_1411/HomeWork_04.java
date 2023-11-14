package practice_1411;

public class HomeWork_04 {

// Задача 1. Написать приложение, которое вычисляет объем куба по длине его ребра и площадь его поверхности.

// Задача 2. Написать приложение, которое вычисляет площадь треугольника по его основанию и высоте.

    public static void main(String[] args) {

        // v = a3
        // s = 6 * h2
        // s_tri = 0.5 * a * h

        int sideA;
        sideA = 10;
        int V = kub(sideA);
        int S = area (sideA);
        int l, h;
        l = 11;
        h =3;
        float s_tri = tri(l, h);


        System.out.println("Объем куба: "+ V +" метров кубических");
        System.out.println("Площадь куба: " + S +" метров квадратных");
        System.out.println("Площадь треугольника: " + s_tri);
    }
    public static int kub(int a){
        return a*a*a;
    }
    public static int area(int b){
        return b * b * 6;
    }
    public static float tri(float l, float h){
        return (float) (0.5 * l * h);

    }

}
