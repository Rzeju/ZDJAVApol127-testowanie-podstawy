import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import somePackage.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator; // deklaracja zmiennej

    @BeforeEach
    void setUp() {
        calculator = new Calculator(); // inizjalizacja zmiennej
    }



    @Test
    void shouldAddTwoNumber() {
        final int valueA = 3;
        final int valueB = 5;

        final int result = calculator.add(valueA, valueB);

        assertEquals(8, result);
    }

    @Test
    void shouldMultiplyTwoNumber() {
        final int valueA = 3;
        final int valueB = 5;

        final int result = calculator.multiply(valueA, valueB);

        assertEquals(15, result);
    }


}
