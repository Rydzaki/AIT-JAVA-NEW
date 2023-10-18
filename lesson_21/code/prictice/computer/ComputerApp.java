package prictice.computer;

import prictice.computer.model.Computer1;
import prictice.computer.model.Laptop1;

public class ComputerApp {

    public static void main(String[] args) {
        Computer1 computer = new Computer1("i5", 12, 512, "HP");
        Computer1 laptop = new Laptop1("i7", 16, 512, "Dell", 3, "2.1"); // Laptop можно ссыласться сразу на родительский каталог

        Computer1[] shop = new Computer1[3];
        shop [0] = new Computer1("i5", 12, 512, "HP");
        shop [1] = new Laptop1("i7", 16, 512, "Dell", 3, "2.1");
        shop [2] = new Laptop1("i7", 32, 1024, "Asus", 3, "2.1");

        // System.out.println(shop); в массивах тип toString не определен
////        for (int i = 0; i < shop.length; i++) {
////            System.out.println(shop[i]);
//        }
        printAll(shop);
        System.out.println("----------------------------------------------------");

//        laptop.display(); // уже не нужно
//        computer.display();
        System.out.println(laptop.toString());
        System.out.println(computer.toString());
        System.out.println("----------------------------------------------------");
        System.out.println(laptop); // в object есть toString не обязательно писать toString в принте для печати
        System.out.println(computer);
        System.out.println("++++++++++++++++++++++++");
        Object laptop1 = new Laptop1("i7", 16, 512, "Dell", 3, "2.1");
        System.out.println(laptop1);
        System.out.println("++++++++++++++++++++++++");
    }
    public static void printAll (Object[] arr){// можно передать в тип название родительского класса Computer или просто Object
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("++++++++++++++++++++++++");
    }

}
