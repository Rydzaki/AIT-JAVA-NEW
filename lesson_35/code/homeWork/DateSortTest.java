package homeWork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DateSortTest {

    Comparator<String> comparator;

    @BeforeEach
    void setUp() {
        comparator = (s1, s2) -> {
            String[] str1 = s1.split("-");
            String[] str2 = s2.split("-");
            Integer years1 = Integer.parseInt(str1[2]);
            Integer years2 = Integer.parseInt(str2[2]);
            int res = years1.compareTo(years2);
            if (res != 0) {
                return res;
            }
            Integer mon1 = Integer.parseInt(str1[1]);
            Integer mon2 = Integer.parseInt(str2[1]);
            int res2 = mon1.compareTo(mon2);
            if (res2 != 0) {
                return res2;
            }
            Integer day1 = Integer.parseInt(str1[0]);
            Integer day2 = Integer.parseInt(str2[0]);
            int res3 = day1.compareTo(day2);
            if (res3 != 0) {

                return res3;
            }
            return 0;
        };
    }

    @Test
    void testDateSort() {
        String[] dates = {
                "07-05-1990",
                "28-01-2010",
                "11-08-1990",
                "15-01-2010",
                "16-06-1970"
        };
        String[] expected = {
                "16-06-1970",
                "07-05-1990",
                "11-08-1990",
                "15-01-2010",
                "28-01-2010"
        };
        Arrays.sort(dates, comparator);
        assertArrayEquals(expected, dates);
        printArray(dates);

    }

    private void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("------------------------------");
    }

}
