package homeWork_28.HW_28_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RendomArrTest {
    RendomArr rendomArr;
    final int a = -10;
    final int b = 10;
    final int x = 100;


    @BeforeEach
    void setUp() {
        rendomArr = new RendomArr();
    }

    @Test
    void randomArray() {
    }

    @Test
    void positiveNum() {
        int [] arr = rendomArr.randomArray(a, b, x);
        assertEquals(5, rendomArr.positiveNum(arr));
    }

    @Test
    void negativeNum() {
        int [] arr = rendomArr.randomArray(a, b, x);
        assertEquals(5, rendomArr.negativeNum(arr));
    }

    @Test
    void evenNum() {
        int [] arr = rendomArr.randomArray(a, b, x);
        assertEquals(5, rendomArr.evenNum(arr));
    }

    @Test
    void zeroArr() {
        int []  arr = rendomArr.randomArray(a, b, x);
        assertEquals(10, rendomArr.zeroArr(arr));
    }
}