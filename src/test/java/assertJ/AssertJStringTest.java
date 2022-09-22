package assertJ;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AssertJStringTest {

    @Test
    void someNegativeStringTest() {
        String myString = "Java Standard Edition 11";

        assertThat(myString)
                .doesNotContainAnyWhitespaces()
                .isEqualTo("Nope")
                .endsWith("k");
    }

    @Test
    void somePositiveStringTest() {
        String myString = "Java";

        assertThat(myString)
                .doesNotContainAnyWhitespaces()
                .isEqualTo("Java")
                .endsWith("a");
    }
}
