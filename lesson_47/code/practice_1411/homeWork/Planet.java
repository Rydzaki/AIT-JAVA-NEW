package practice_1411.homeWork;

import java.util.Comparator;
import java.util.Objects;

public class Planet implements Comparable<Planet> {


    public String name;
    public int distanseToSun;
    public double weight;
    public int numberOfSatellites;

    public Planet(String name, int distanseToSun, double weight, int numberOfSatellites) {
        this.name = name;
        this.distanseToSun = distanseToSun;
        this.weight = weight;
        this.numberOfSatellites = numberOfSatellites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistanseToSun() {
        return distanseToSun;
    }

    public void setDistanseToSun(int distanseToSun) {
        this.distanseToSun = distanseToSun;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getNumberOfSatellites() {
        return numberOfSatellites;
    }

    public void setNumberOfSatellites(int numberOfSatellites) {
        this.numberOfSatellites = numberOfSatellites;
    }

    //    public Planet() {
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return distanseToSun == planet.distanseToSun && weight == planet.weight && numberOfSatellites == planet.numberOfSatellites && Objects.equals(name, planet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, distanseToSun, weight, numberOfSatellites);
    }

    @Override
    public String toString() {
        return "Planets{" +
                "name='" + name + '\'' +
                ", distanseToSun=" + distanseToSun +
                ", weight=" + weight +
                ", numberOfSatellites=" + numberOfSatellites +
                '}';
    }
//Вывести список планет отсортированный по:
//
//порядку расположения в солнечной системе;
//алфавиту;
//массе;
//количеству спутников.

    @Override
    public int compareTo(Planet o) {
        return Double.compare(this.weight, o.weight);
    }
}
class PlanetsSortBySatellites implements Comparator<Planet> {
    @Override
    public int compare(Planet o1, Planet o2) {
        return Integer.compare(o1.getNumberOfSatellites(), o2.getNumberOfSatellites());
    }
}
class PlanetsSortByNames implements Comparator<Planet> {
    @Override
    public int compare(Planet o1, Planet o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
abstract class PlanetsSort implements Comparable<Planet>{

    @Override
    public int compareTo(Planet o) {

        return 0;
    }
}

