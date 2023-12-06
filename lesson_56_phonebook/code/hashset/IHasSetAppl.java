package hashset;

import Movie.dao.MoviesCollectionImps;
import Movie.model.Movie;

import java.time.LocalDate;
import java.util.*;

public class IHasSetAppl {

    public static void main(String[] args) {

        ISet<String> mySet = new IHashSet<>();
        System.out.println(mySet.size());
        mySet.add("Berlin");
        mySet.add("Leipzig");
        mySet.add("Hamburg");
        mySet.add("Munich");
        System.out.println(mySet.size());
        mySet.add("Leipzig");
        System.out.println(mySet.size());
        System.out.println("=======Iterator=====");
        for (String s : mySet) {
            System.out.println(s);
        }

        ISet<Integer> numberSet = new IHashSet<>();

        for (int i = 0; i < 100; i++) {
            numberSet.add(i);
        }
        System.out.println("======= Numbers =====");
        for (Integer n : numberSet) {
            System.out.print(n + " | ");
        }

        ISet<Integer> numberRevSet = new IHashSet<>();
        for (int i = 100; i >= 0; i--) {
            numberRevSet.add(i);
            }
        System.out.println();
        System.out.println("=============Numbers reverse============ ");
        for (Integer n :numberRevSet) {
            System.out.print(n + " | ");

        }
        System.out.println();
        ISet<Integer> numbersRandomSet = new IHashSet<>();
        int min = 0;
        int max = 100;
        for (int i = 0; i < 100; i++) {
            int ramdom = (int)(Math.random()* (max - min)+min);
            numbersRandomSet.add(ramdom);
        }
        System.out.println("======================Random numbers=============================");
        for (Integer n : numbersRandomSet) {
            System.out.print(n + " | ");
        }
        System.out.println();

        ISet<Object> objects = new IHashSet<>();

        objects.add(new Movie(10, "The Lord of the Rings: The Fellowship of the Ring", "Peter Jackson", "Action", LocalDate.of(2001,9,13)));
        objects.add(new Movie(12, "The Good, the Bad and the Ugly", "Sergio Leone", "Western", LocalDate.of(1966,9,13)));
        objects.add (new Movie(9, "Forrest Gump", "Robert Zemeckis", "Drama", LocalDate.of(1994,9,13)));
        objects.add(new Movie(13, "Fight Club", "David Fincher", "Drama", LocalDate.of(1999,9,13)));
        objects.add(new Movie(12, "The Lord of the Rings: The Two Towers", "Peter Jackson", "Action", LocalDate.of(2002,9,13)));

        System.out.println("===============Print object=================");
        for (Object o : objects ) {
            System.out.println(o + " || ");

        }




    }
}
