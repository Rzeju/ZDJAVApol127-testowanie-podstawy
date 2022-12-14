import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeAndAfterEachExampleTest {

    static int counter = 0; //przy usunieciu static licznik wskazuje zawsze 1

    @BeforeEach
    void setUp() {
        System.out.println("Ten komunikat wyświetli się przed wykonaniem każdej z metod testujących");
        counter++; // counter = counter + 1; inkrementacja zmiennej counter
    }

    @AfterEach
    void tearDown() {
        System.out.println("Ten komunikat wyświetli się po wykonaniu każdej z metod testujących");
        System.out.println("Wykonało się tyle testów -> " + counter);
    }

    @Test
    void firstTest() {
        System.out.println("Wykonuję test pierwszy...");
    }

    @Test
    void secondTest() {
        System.out.println("Wykonuję test drugi...");
    }

    @Test
    void thirdTest() {
        System.out.println("Wykonuje test trzeci...");
    }

    @Test
    void fourthTest() {
        System.out.println("Wykonuje test czwarty...");
    }

}
