import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class DisplayNameAndDisabledTest {

    @Test
    @DisplayName("Moja nazwa testu!")
    void someTestingMethod() {

    }

    @Test
    @Disabled
    void someOldTest() {
        fail();
    }
}
