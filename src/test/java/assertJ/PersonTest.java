package assertJ;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {

    final static String FIRST_NAME = "Piotr";
    final static String LAST_NAME = "Andrzejak";

    @Test
    void shouldGetFullName() {

        final Person person = new Person(FIRST_NAME, LAST_NAME);

        assertThat(person.getFullName())
                .startsWith(FIRST_NAME)
                .endsWith(LAST_NAME)
                .contains(" ")
                .contains("tr And")
                .doesNotContain("Aaaaaaa");
    }
}
