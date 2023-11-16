package home_work.country;

import java.util.Comparator;
import java.util.Objects;

public class Country implements Comparable<Country> {

    public String name;
    public double population;
    public String continent;

    public Country(String name, double population, String continent) {
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name=" + name +
                ", population=" + population +
                ", continent='" + continent + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return name == country.name && Double.compare(population, country.population) == 0 && Objects.equals(continent, country.continent);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, population, continent);
    }

    @Override
    public int compareTo(Country o) {
        int res =  this.getName().compareTo(o.getName());
        return res;
    }

//    по размеру населения в стандартном и обратном порядках;
//принадлежности континенту и размеру населения в порядке от большего к меньшему.
}
class CountryBySort implements Comparator<Country>{
    @Override
    public int compare(Country o1, Country o2) {
        return Double.compare(o1.getPopulation(), o2.getPopulation());
    }
}
class CountryBySortRevers implements Comparator<Country>{
    @Override
    public int compare(Country o1, Country o2) {
        return -Double.compare(o1.getPopulation(), o2.getPopulation());
    }
}
class CountryBySortContinentPopulation implements Comparator<Country>{
    @Override
    public int compare(Country o1, Country o2) {
        int continentSort = o1.getContinent().compareTo(o2.getContinent());

        return continentSort != 0 ? continentSort : -Double.compare(o1.getPopulation() , o2.getPopulation());
    }
}
