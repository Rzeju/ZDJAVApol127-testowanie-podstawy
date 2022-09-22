import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BeforeAndAfterAllExampleTest {

    static int  counter = 0;

    @BeforeAll
    static void setUpTestCase() {
        System.out.println("Ten komunikat wyświetli się raz przed wykonaniem wszystkich metod testujących");
        counter++;
    }

    @AfterAll
    static void tearDownTestCase() {
        System.out.println("Ten komunikat wyświetli się raz po wykonaniu wszystkich metod testujących");
        System.out.println("Licznik wynosi -> " + counter);

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
