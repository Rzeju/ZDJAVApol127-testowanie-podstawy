import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyFirstUnitTest { // klasa testowa

    //ASSERT EQUALS EXAMPLES

    @Test
        // adnotacja oznaczająca, że motdoa jest testem
    void shouldMultiplyTwoNumbers() { //sygnatura metody testowej
        //given //warunki początkowe
        final double firstNumber = 2;
        final double secondNumber = 3;

        //when //wykonanie testu
        final double multiplicationResult = firstNumber * secondNumber;

        //then // sprawdzenie testu i wynik
        assertEquals(6, multiplicationResult);
    }

    @Test
    void testingAssertEquals() {
        //given //warunki początkowe
        final String firstName = "Piotr";
        final String lastName = "Andrzejak";

        //when //wykonanie testu
        boolean multiplicationResult = firstName.equals(lastName);

        //then // sprawdzenie testu i wynik
        assertEquals(false, multiplicationResult);
    }

    @Test
    void nameTest() { //tetsuje łączenie Stringów
        final String x = "Ala";
        final String y = " ma ";
        final String z = "kota";

        final String result = x + y + z;

        assertEquals("Ala ma kota", result);
    }

    @Test
        // adnotacja oznaczająca, że metoda jest testem
    void shouldCalculateRestFromDivision() { // sygnatura metody testowej w przeciwienstwie do JUnit4 nie musi być publiczna
        // given // warunki początkowe
        final double firstNumber = 3;
        final double secondNumber = 2;

        // when // wykonanie testu
        final double moduloResult = firstNumber % secondNumber;

        //then // sprawdzenie wyniku testu
        assertEquals(1, moduloResult);
    }

    // <ASSERT EQUALS EXAMPLES -- END!>

    //AssertTrue EXAMPLES

    @Test
    void testingAssertTrue() {
        //given
        String someWord = "Hello";
        boolean result = false;

        //when
        if (someWord.equals("Hello")) {
            result = true;
        }

        //then
        assertTrue(result);
    }

    //Testing fail()
    @Test
    void failTest() {
        //given
        String someWord = "Hello";

        //when
        if (someWord.equals("Hello")) {
            assertEquals("Hello", someWord);
        } else {
            fail();
        }

        //then
        //assertTrue(result);

    }

    //MORE ASSERTIONS EXAMPLES
    @Test
    void bothArraysShouldBeEqual() { //sprawdzam czy podane tablice są jednakowe
        //given
        final int[] intsA = {1, 2, 3};
        final int[] intsB = {1, 2, 3};

        //then
        assertArrayEquals(intsA, intsB, "Elements in arrays are not equals");
    }

    @Test
    void twoListsShouldBeEqual() { //sprawdza czy podane listy są jednakowe
        //given
        List<Integer> intsA = Arrays.asList(1, 2, 3);
        List<Integer> intsB = List.of(1, 2, 3);

        //then
        assertIterableEquals(intsA, intsB);
    }

    @Test
    void bothListsShouldBeEqual() {
        //sprawdza czy lista spełnia wszystkie kryteria
        // zawarte w metodzie "assertAll'
        List<Integer> ints = Arrays.asList(1, 3, 2);

        assertAll(
                () -> assertEquals(3, ints.size()),
                () -> assertEquals(2, ints.get(2))
        );
    }
}
