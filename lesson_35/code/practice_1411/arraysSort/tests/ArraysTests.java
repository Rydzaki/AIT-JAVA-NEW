package practice_1411.arraysSort.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practice_1411.soldier.model.Soidier;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysTests {

    Integer[] arrNum;
    String[] arrStr;
    Soidier[] soldiers;

    @BeforeEach
    void setUp() {
        arrNum = new Integer[]{9, 7, 4, 7, 2, 5, 1, 0};
        arrStr = new String[]{"one", "two", "three", "four", "five"};
        soldiers = new Soidier[]{
                new Soidier("John", 182, 82.5, 91),
                new Soidier("Peter", 175, 77.1, 75),
                new Soidier("Rabindranate", 162, 55.1, 91),
                new Soidier("Mary", 159, 55.1, 91),
                new Soidier("Ann", 162, 55, 88)

        };
    }

    @Test
    void testArraysSort() {
        Arrays.sort(arrNum);
        System.out.println(Arrays.toString(arrNum));
        Arrays.sort(arrStr);
        System.out.println(Arrays.toString(arrStr));

    }

    @Test
    void testArraysSortComparator() {
        Arrays.sort(arrNum, (n1, n2) -> n2 - n1); //timsort
        System.out.println(Arrays.toString(arrNum));
        Arrays.sort(arrStr, (s1, s2) -> s1.length() - s2.length());
        System.out.println(Arrays.toString(arrStr));

    }

    @Test
    void testSortSoldiersNaturalOrder() {
        soldiers[0].compareTo(soldiers[2]);
        Arrays.sort(soldiers);
        printArray(soldiers);

    }

    private void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("------------------------------");
    }

    @Test
    void testSortSoldiersByName() {
        Arrays.sort(soldiers, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        printArray(soldiers);
    }

    @Test
    void testSortSoldiersByProfile() {
        Arrays.sort(soldiers, (s1, s2) -> s2.getProfile() - s1.getProfile());
        printArray(soldiers);
    }

    @Test
    void testSortSoldiersByPr() {
        Arrays.sort(soldiers, (s1, s2) -> {

            int res = s2.getProfile() - s1.getProfile();
            res = res != 0 ? res : -(s1.getHeight() - s2.getHeight()); // ? - возвращает res, : - это "Иначе", '-(s1.getHeight() - s2.getHeight())' - можно не менять местами если нужно изменить порядок сортировки

            res = res != 0 ? res : -(s1.getName().compareTo(s2.getName())); // ? - возвращает res, : - это "Иначе", '-(s1.getHeight() - s2.getHeight())' - можно не менять местами если нужно изменить порядок сортировки
            return res;
        });
        printArray(soldiers);
    }


    @Test
    void testSortSoldierByWeight() {
        Arrays.sort(soldiers, (s1, s2) -> {
            double res = s1.getWeight() - s2.getWeight();
            if (res < 0) {
                return -1;
            }
            if (res > 0) {
                return 1;
            }
            return 0;
        });
        printArray(soldiers);

    }

    @Test
    void testSortSoldierByWeight1() {
        Arrays.sort(soldiers, (s1, s2) -> Double.compare(s1.getWeight(), s2.getWeight())); // double.compare - для сортировки даблов
        printArray(soldiers);
    }

    @Test
    void testOdEvenComparator2() {
        Integer[] origin = {1, 4, 3, 2, 5, 6, 9, 8, 7, 3}; // если 1 надо менять месмами, меньше 1 не надо
        Comparator<Integer> comparator = (n1, n2) -> {
            if (n1 % 2 == 0 && n2 % 2 != 0) {
                return -1; // не меняем
            }
            if (n1 % 2 != 0 && n2 % 2 == 0) {
                return 1; // меняем
            }
            if (n1 % 2 == 0 && n2 % 2 == 0) {
                return n1 - n2; // проверяет условие
            }
            if (n1 % 2 != 0 && n2 % 2 != 0) {
                return n2 - n1; // проверяет условие
            }
            return 0; // не чего не далем
        };
        Arrays.sort(origin, comparator);
        System.out.println(Arrays.toString(origin));
    }
}

