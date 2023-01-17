package gradle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

    /**
     * https://www.baeldung.com/parameterized-tests-junit-5
     */

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

    // @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
    // @ValueSource(strings = {" ", "\t", "\n"})
    @ParameterizedTest
    @CsvSource({ "-1,5,-5", "4,5,20", "0,1,0" })
    void testMultiply(int a, int b, int expected) {
        Calculator calculator = new Calculator();

        int actualValue = calculator.multiply(a, b);
        assertEquals(actualValue, expected);
    }

    @Test
    void testSubtract() {
        fail();
    }
}
