package practice_1411;

// Задача 1. Задать в программе три стороны треугольника. Проверить выполнимость неравенства треугольника - любая из сторон должна быть меньше суммы двух других. Сообщить результат - существует или нет треугольник с заданными сторонами.
// Задача 2. Сделайте расчет покупки товаров со скидками. Товар А стоит X евро и на него скидка D%, а товар B стоит Y евро и на него скидка С%. Клиент взял N товаров A и M товаров B. Если сумма покупки превысила 100 евро, то полагается дополнительная скидка 5%. Вычислите итоговую стоимость покупки и величину полученной скидки.


public class HomeWork_05 {
    public static void main(String[] args) {

        int a, b, c;
        a = 5;
        b = 10;
        c = 15;

        int d1 = tri(a, b);
        int d2 = tri(a, c);
        int d3 = tri(b, c);

        if ((a < d3) && (b < d2) && (c < d1)) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник по заданным параметрам не может существовать");
        }
    }

    public static int tri(int a, int b) {
        return a + b;
    }





}
