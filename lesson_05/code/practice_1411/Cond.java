package practice_1411;

public class Cond {
    public static void main(String[] args) {

        int x = -0;
        if (x > 0) {
            System.out.println("x - положительное");

        } else if (x == 0) {
            System.out.println("x равен нулю");
        } else {
            System.out.println("x - отрицательное");
        }
        // четное не четное

        int y = 11;
        if (y % 2 == 0) {
            System.out.println("y - четное");


        } else {
            System.out.println("y - не четное");
        }
        // проверка возраста

        int ege = 18;
        if (ege >= 18) {
            System.out.println("Вам разрешено действовать самостоятельно");

        }else {
            System.out.println("Несовершеннолетний");
        }

    }
}
