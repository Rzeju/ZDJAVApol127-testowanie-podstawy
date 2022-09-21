import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyFirstUnitTest { // klasa testowa

    @Test // adnotacja oznaczająca, że motdoa jest testem
    void shouldMultiplyTwoNumbers() { //sygnatura metody testowej
        //given //warunki początkowe
        final double firstNumber = 2;
        final double secondNumber = 3;

        //when //wykonanie testu
        final double multiplicationResult = firstNumber * secondNumber;

        //then // sprawdzenie testu i wynik
        assertEquals(6, multiplicationResult);
    }
}
