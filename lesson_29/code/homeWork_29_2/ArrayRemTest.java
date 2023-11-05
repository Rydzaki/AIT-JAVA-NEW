package homeWork_29_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayRemTest {

    ArrayRem arrayRem;

    int [] arr = {1, 2, 3, 4, 5, 6, 7};

    @BeforeEach
    void setUp() {
        arrayRem = new ArrayRem();
    }

    @Test
    void averageEven() {
        assertEquals(4, ArrayRem.averageEven(arr));

    }
}