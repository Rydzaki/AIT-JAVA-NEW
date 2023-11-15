package home_work;

import java.util.LinkedList;

public class GermanyAppl {
    public static void main(String[] args) {

        LinkedList germany = new LinkedList<>();

        germany.add("Berlin");
        germany.add("Munich");
        germany.add("Cologne");
        germany.add("Stuttgart");
        germany.add("Dortmund");
        germany.add("Lei");
        germany.add("Hanover");

        // gepmany.add("Hamburg");

        for (Object l : germany) {
            System.out.print(l + " | ");
        }
        System.out.println();

        germany.addFirst("Humburg");
        System.out.println("=============" + "Humburg on the first index " + "===============");
        System.out.print(germany.toString());
        System.out.println();

        int index = 3;
        germany.remove("Humburg");
        germany.add(index, "Humburg");
        System.out.println("=============" + "Humburg on the "+ index+ "rd index" + "===============");
        System.out.print(germany.toString());

        germany.clear();


    }
}
