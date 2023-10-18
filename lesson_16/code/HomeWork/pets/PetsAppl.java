package HomeWork.pets;

import HomeWork.pets.model.Pets;

public class PetsAppl {
    public static void main(String[] args) {
        Pets pet1 = new Pets(1, "dog", 3, "Sharik");
        Pets pet2 = new Pets(2, "Cat", 12, "Murzik");

        pet1.displey();
        pet2.displey();
        System.out.println();

        pet1.sleep();
        pet1.eat();
        pet1.sound();
        pet1.play();
        pet1.walk();
        System.out.println();
        pet2.sleep();
        pet2.eat();
        pet2.sound();
        pet2.play();
        pet2.walk();

        System.out.println();
        System.out.println(pet1.toString());
        System.out.println(pet2.toString());

        String name1 = pet1.getName();
        System.out.println(name1);


    }
}
