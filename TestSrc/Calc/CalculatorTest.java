package Calc;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CalculatorTest {
    private static Calculator calc;

    @BeforeAll
    static void beforeAll() {
        calc = new Calculator();
    }

    @Test
    void calculator() {
        Calculator calc2 = new Calculator();
        assertNotNull(calc2);
    }

    @Test
    void testMultiplication() {
        assertNotNull(calc);

        Double result = calc.calculate("5 3 2 * + 1 -");
        assertEquals(10.0, result);
    }

    @Test
    void testNegativeNumber() {
        assertNotNull(calc);

        Double result = calc.calculate("-5 4 5 4 + - -");
        assertEquals(0, result);
    }

    @Test
    void testDivision() {
        assertNotNull(calc);
        Double result = calc.calculate("10 6 2 / + 1 *");
        assertEquals(13.0, result);
    }

    @Test
    void testAdditionSubstraction() {
        assertNotNull(calc);
        Double result = calc.calculate("10 6 2 / + 1 *");
        assertEquals(13.0, result);
    }
}