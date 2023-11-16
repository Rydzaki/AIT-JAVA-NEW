package home_work.country;

import java.util.Collections;
import java.util.LinkedList;

public class CountryAppl {
    public static void main(String[] args) {

        LinkedList<Country> countries = new LinkedList<>();

        countries.add(new Country("United States ", 333.29, "North America"));
        countries.add(new Country("Mexico", 126.0, "North America"));
        countries.add(new Country("Canada", 38.0, "North America"));
        countries.add(new Country("China", 1410.0, "Asia"));
        countries.add(new Country("India", 1390.0, "Asia"));
        countries.add(new Country("France", 67.0, "Europa"));
        countries.add(new Country("United Kingdom ", 67.0, "Europa"));
        countries.add(new Country("Nigeria", 206.0, "Africa"));
        countries.add(new Country("Ethiopia", 118.0, "Africa"));
        countries.add(new Country("South Africa ", 60.0, "Africa"));
        countries.add(new Country("Australia", 26.0, "Australia"));

        //System.out.print(countries.toString());

        for (Country c :countries) {
            System.out.println(c + "|");
        }
        System.out.println("====================Sort by name======================");
        countries.sort(Country::compareTo);
        for (Country c :countries) {
            System.out.println(c + "|");
        }
        System.out.println("====================Sort by population======================");
        Collections.sort(countries, new CountryBySort());
        for (Country c :countries) {
            System.out.println(c + "|");
        }
        System.out.println("====================Sort by population revers======================");
        Collections.sort(countries, new CountryBySortRevers());
        for (Country c :countries) {
            System.out.println(c + "|");
        }
        System.out.println("====================Sort by continent and population======================");
        Collections.sort(countries, new CountryBySortContinentPopulation());
        for (Country c :countries) {
            System.out.println(c + "|");
        }

    }



}
