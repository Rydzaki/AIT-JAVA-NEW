package practice_1411.beverage;

import practice_1411.beverage.model.Beer;
import practice_1411.beverage.model.Beverage;

public class BeverageAppl {
    public static void main(String[] args) {
        Beverage b0 = new Beverage();
        b0. displayStock();
        System.out.println("---------------------------");

        Beverage b1 = new Beverage("Milk", "box", 10);
        b1.toBuy("milk", "box", 20);
        b1.displayStock();
        System.out.println("---------------------------");

        Beer beer = new Beer();
        beer.displayStock();
        System.out.println("---------------------------");

        Beer b2 = new Beer("Guiness", "pack", 10, "Dark");
        b2.toBuy("Guiness", "pack", 10, "Dark");
        b2.displayStock();
        System.out.println("---------------------------");






    }
}
