package gradle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    @DisplayName("Add 1 and 2, result should be 3")
    void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);

        assertEquals(3, result);
    }

    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(4, 2);

        assertEquals(2, result);
    }

    @Test
    void testMultiply() {
        fail();
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(3, 2);

        assertEquals(1, result);
    }
}
