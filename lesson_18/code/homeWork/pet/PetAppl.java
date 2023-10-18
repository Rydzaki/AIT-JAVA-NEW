package homeWork.pet;

import homeWork.pet.model.Cat;
import homeWork.pet.model.Dog;
import homeWork.pet.model.Pet;

public class PetAppl {
    public static void main(String[] args) {

        Cat cat1 = new Cat(8, "Cat", 32, "Murzik", "barn cat", 25,  5);
        Cat cat2 = new Cat(9, "Cat", 22, "Pirat", "Siam", 30, 4.5);
        Cat cat3 = new Cat (12, "Cat", 3, "Kris", "Bermud", 33, 12.2);
        Dog dog1 = new Dog(15, "Dog", 3, "Sharik", "Basengi", 34, 12);
        Dog dog2 = new Dog(33, "Dog", 10, "Rex", "Jack Rassel", 25, 8);
        cat1.toPrint();
        cat1.voice();
        cat1.eat();
        cat1.play();
        cat1.sleep();
        cat1.walk();
        System.out.println("--------------------------------------------");
        cat2.toPrint();
        cat2.voice();
        cat2.eat();
        cat2.play();
        cat2.sleep();
        cat2.walk();
        System.out.println("--------------------------------------------");
        cat3.toPrint();
        cat3.voice();
        cat3.eat();
        cat3.play();
        cat3.sleep();
        cat3.walk();
        System.out.println("--------------------------------------------");
        System.out.println("--------------------------------------------");
        dog1.toPrint();
        dog1.voice();
        dog1.eat();
        dog1.play();
        dog1.sleep();
        dog1.walk();
        System.out.println("--------------------------------------------");
        dog2.toPrint();
        dog2.voice();
        dog2.eat();
        dog2.play();
        dog2.sleep();
        dog2.walk();
        System.out.println("--------------------------------------------");
    }

}
