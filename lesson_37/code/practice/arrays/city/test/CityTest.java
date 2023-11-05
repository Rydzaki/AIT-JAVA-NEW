package practice.arrays.city.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.arrays.city.model.City;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {

    City[] cities;

    @BeforeEach
    void setUp() {
        cities = new City[6];
        cities[0] = new City("Denver", 600_000);
        cities[1] = new City("Boston", 670_000);
        cities[2] = new City("Chicago", 2_700_000);
        cities[3] = new City("Atlanta", 470_000);
        cities[4] = new City("New York", 8_500_000);
        cities[5] = new City("Dallas", 1_300_000);



    }

    void printArray (Object[] arr, String title){
        System.out.println("=============== "+ title+ " =================" );
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    @Test
    void testIntegerDesc(){
        Integer[] actual = {-1, Integer.MIN_VALUE, Integer.MAX_VALUE};
        Integer[] expected = {Integer.MAX_VALUE, -1, Integer.MIN_VALUE};
        //Arrays.sort(actual, (n1, n2) -> n2 -n1);

        Arrays.sort(actual, (n1, n2) -> Integer.compare(n2, n1)); // лучше использовать Integer.compare
        assertArrayEquals(expected, actual);
    }
    @Test
    void testCityComparable(){
        printArray(cities, "Original area");
        Arrays.sort(cities);
        printArray(cities, "Natural order");
        City pattern = new City(null, 2_700_000); // в compareTo название города значения не имеет
        // int index = Arrays.binarySearch(cities, city);
        int index = Arrays.binarySearch(cities, pattern);
        System.out.println("Index = " + index);

    }

    @Test
    void testCityNameComparator(){
        Comparator<City> comparator = (c1, c2) -> c1.getName().compareTo(c2.getName());
        Arrays.sort(cities, comparator);
        printArray(cities, "Sort by name");
        //System.out.println(comparator.compare(cities[0], cities[2]));

        City pattern = new City("Chicago", 0);
        int index = Arrays.binarySearch(cities, pattern, comparator);
        System.out.println("Index = " + index);
    }
    @Test
    void testArrayCopy(){
        Comparator<City> comparator = (c1, c2) -> c1.getName().compareTo(c2.getName());
        //City[] citiesCopy = cities;
//        City[] citiesCopy = new City[cities.length];
//        for (int i = 0; i < citiesCopy.length; i++) {
//            citiesCopy[i] = cities[i];
//
//        }
        City[] citiesCopy = Arrays.copyOf(cities, cities.length*2);// *2 создаст массив в 2 раза больше (забьет null)
        printArray(citiesCopy, "citiesCopy before sort");
        Arrays.sort(citiesCopy, 0, cities.length, comparator); // 0, cities.length, - диапазон сортировки
        printArray(citiesCopy, "citiesCopy after sort");
        printArray(cities, "cities array");

        City pattern = new City("Yalta", 0);
        int index = Arrays.binarySearch(citiesCopy, 0, cities.length, pattern, comparator);
        System.out.println("index = " + index);



    }
    @Test
    void testArrayCopy1() {
        Comparator<City> comparator = (c1, c2) -> c1.getName().compareTo(c2.getName());
        City[] citiesCopy = Arrays.copyOf(cities, cities.length * 2); // копирование из старого массива с заданной длинной в новый массив
        printArray(citiesCopy, "citiesCopy before sort");
        Arrays.sort(citiesCopy, 0, cities.length,  comparator);
        printArray(citiesCopy, "citiesCopy after sort");
        City pattern = new City("Yalta", 0);
        int index = Arrays.binarySearch(citiesCopy, 0, cities.length, pattern, comparator);
        System.out.println("index = " + index);
    }
    @Test
    void testCopyOfRange(){
        City[] citiesCopy = Arrays.copyOfRange(cities, 1, cities.length -1 );// копирует элементы не включая последний индекс
        printArray(citiesCopy, "copy of range");
    }

    @Test
    void testSystemArrayCopy(){
        City[] citiesCopy = new City[cities.length * 2];
        System.arraycopy(cities, 1, citiesCopy, 1, 4); // от куда, с какой позиции, куда, на какю позицию, сколько

        printArray(citiesCopy, "System.arrayCopy");
    }
    @Test
    void testKeepSorted(){
        Arrays.sort(cities);
        printArray(cities, "Natural order");
        City city = new City("Salem", 690_000); // в compareTo название города значения не имеет
        City[] citiesCopy   = Arrays.copyOf(cities, cities.length +1);

//        Wrong way
//        citiesCopy[citiesCopy.length-1] = city;
//        Arrays.sort(citiesCopy);

        int index = Arrays.binarySearch(citiesCopy, 0, citiesCopy.length-1, city);
        index = index >= 0 ? index : -index -1; // если индекс будет отрицательным
        System.arraycopy(citiesCopy, index, citiesCopy, index+1, cities.length - index - 1);
        citiesCopy[index] = city;
        cities = citiesCopy;
        printArray(cities, "Natural order after add city");


    }
}