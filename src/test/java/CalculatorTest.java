import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    void shouldAddTwoNumber() {
        final int valueA = 3;
        final int valueB = 5;

        Calculator calculator = new Calculator();

        final int result = calculator.add(valueA, valueB);

        assertEquals(8, result);
    }


}
