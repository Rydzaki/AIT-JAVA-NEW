package homeWork.metods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorMetodsTest {

    CalculatorMetods calculatorMetods;


    @BeforeEach
    void setUp() {
    }

    @Test
        void add() {
            int a = 2;
            int b = 2;
            assertEquals(4, CalculatorMetods.add(a, b));
    }

    @Test
    void sub() {
        int a = 2;
        int b = 2;
        assertEquals(0, CalculatorMetods.sub(a, b));
    }

    @Test
    void multi() {
        int a = 2;
        int b = 2;
        assertEquals(4, CalculatorMetods.multi(a, b));
    }

    @Test
    void div() {
        int a = 2;
        int b = 0;
        assertEquals(1, CalculatorMetods.div(a, b));
    }

    @Test
    void rem() {
        int a = 2;
        int b = 2;
        assertEquals(0, CalculatorMetods.rem(a, b));
    }
}