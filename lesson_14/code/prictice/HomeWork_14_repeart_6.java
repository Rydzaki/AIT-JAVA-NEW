package prictice;
// Задача 6. Бизнесмен взял ссуду m тысяч рублей в банке под 10%
// годовых. Через сколько лет его долг превысит s тысяч рублей,
// если за это время он не будет отдавать долг.

public class HomeWork_14_repeart_6 {
    public static void main(String[] args) {

        double m =1000; //начальная сумма
        int s = 1100;
        double proc = 0.1;
        int ege = 0;

        for (ege = 0; m <= s; ege++) {
            m += (m * proc);
        }
        System.out.println("Долг через "+ ege + " yers долг = "+ m);


    }
}
