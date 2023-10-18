package homeWork_28.HW_28_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest {

    ArrayMethods methods;

    final int [] arr = {1, 2, 3, 4, 5};
    final int x = 3;

    @BeforeEach
    void setUp() {
        methods = new ArrayMethods ();
    }

    @Test
    void sumArray() {
        assertEquals(15, methods.sumArray(arr));
    }

    @Test
    void searchArray() {
        assertEquals(2, methods.searchArray(arr, x));
    }
}