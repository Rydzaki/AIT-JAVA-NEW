package practice_1411.homeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlanetsAppl {

    public static void main(String[] args) {

        List<Planet> planetsList = new ArrayList<>();
        planetsList.add(new Planet("Mercury", 58, 0.055, 0));
        planetsList.add(new Planet("Venus", 108, 0.815, 0));
        planetsList.add(new Planet("Earth", 149, 1, 1));
        planetsList.add(new Planet("Mars", 228, 0.107, 2));
        planetsList.add(new Planet("Jupiter", 776, 318, 79));
        planetsList.add(new Planet("Saturn", 1430, 95, 83));
        planetsList.add(new Planet("Uranus", 2870, 14, 27));
        planetsList.add(new Planet("Neptune", 4500, 17, 14));

        Collections.sort(planetsList);

        for (Planet p : planetsList) {
            System.out.println(p + " | ");
        }
        System.out.println("================Sort By Names=================");
        Collections.sort(planetsList, new PlanetsSortByNames());
        for (Planet p : planetsList) {
            System.out.println(p + " | ");
        }
        System.out.println("=================Sort By Satellites================");
        Collections.sort(planetsList, new PlanetsSortBySatellites());
        for (Planet p : planetsList) {
            System.out.println(p + " | ");
        }
    }
}
