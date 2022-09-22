package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    void shouldReturnZeroForZeroElement() {
        assertEquals(0, Fibonacci.getValue(0));
        assertEquals(0, Fibonacci.rafactoredMethod(0));
    }

    @Test
    void shouldReturnOneForFirstElement() {
        assertEquals(1, Fibonacci.getValue(1));
        assertEquals(1, Fibonacci.rafactoredMethod(1));
    }

    @Test
    void shouldReturnValue() {
        assertEquals(8, Fibonacci.getValue(6));
        assertEquals(144, Fibonacci.getValue(12));
        assertEquals(987, Fibonacci.getValue(16));

        assertEquals(8, Fibonacci.rafactoredMethod(6));
        assertEquals(144, Fibonacci.rafactoredMethod(12));
        assertEquals(987, Fibonacci.rafactoredMethod(16));

    }
}
