package practice.programers;

import java.util.Arrays;

public class Programmer {

    // В этом классе нужно учесть состав и количество языков программирования, которые знает программист (technology).

    String name;
    String[] technologies; // стек технологий

    public Programmer(String name, String... technologies) { // ... это называется вараргс Varafgs - позволяя использовать массивы разной длинны
        this.name = name;
        this.technologies = technologies;
    }

    public String getName() {
        return name;
    }

    public String[] getTechnologies() {
        return technologies;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", technologies=" + Arrays.toString(technologies) +
                '}';
    }


}
