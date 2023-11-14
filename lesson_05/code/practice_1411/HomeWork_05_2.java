package practice_1411;

public class HomeWork_05_2 {
    public static void main(String[] args) {

        double a = 100; //cost
        double d = 10; //discount
        double b = 100; //cost
        double c = 10; //discount//discount

        int buyA = 1; // A
        int buyB = 1; // B

        double total_cost_hold = 100;
        double add_dis = 5;
        double total_costA = cost(a, buyA);
        double total_costB = cost(b, buyB);
        double add_total_cost = total_costA + total_costB; // общая стоимость всех товаров А и B без учета скидок
        double total_cost_allA = total_all(total_costA, d); // общая стоимость всех товаров А с учетом скидки
        double total_cost_allB = total_all(total_costB, c); // общая стоимость всех товаров B с учетом скидки
        double total_cost = total_cost_allA + total_cost_allA;
        double total_discoun = d + c;

        if (total_cost > total_cost_hold) {
            total_cost = total_all(total_cost, add_dis);
            total_discoun = total_discoun + add_dis;
            System.out.println("Итоговая стомость покупки: " + total_cost + " euro");
            System.out.println("Итоговая величина скидки: " + total_discoun + " %");
        } else {
            System.out.println("Итоговая стомость покупки: " + total_cost + " euro");
            System.out.println("Итоговая величина скидки: " + total_discoun + " %");
        }
    }
    public static double cost (double a, double b){
        return a * b;
        }

    public static double total_all (double a, double b){
        return a -((a/100) * b);
        }

    }

