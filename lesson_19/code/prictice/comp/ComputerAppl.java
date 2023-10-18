package prictice.comp;

import prictice.comp.model.Computer;
import prictice.comp.model.Laptop;
import prictice.comp.model.SmartPhone;

public class ComputerAppl {
    public static void main(String[] args) {

        Computer [] comp = new Computer[4];

        comp[0] = new Computer("I9", 16, 512, "Asus");
        //System.out.println(comp[0].toString()); //используется по умолчанию toString
        System.out.println("--------------------------------");
        comp[1]  = new Laptop("AMD", 8, 256, "HP", "14'", 14000, 2);
        //System.out.println(comp[1]);
        System.out.println("++++++++++++++++++++++++++++++++");
        comp[2] = new Laptop("M2", 16, 512, "MacBook", "14", 5000, 1.6);
        comp[3] = new SmartPhone("Google Tensor", 12, 512, "Google Pixel", "6.7", 5500, 0.4, 48, "Android");


        for (int i = 0; i < comp.length; i++) {
            System.out.print(comp[i]); // печатаем весь массив
            System.out.println();
        }
        int sumHdd = 0;
        for (int i = 0; i < comp.length; i++) {
            sumHdd = sumHdd + comp[i].getSsd();
        }

        System.out.println("Total ROM = " + sumHdd);

    }
}
