package assertJ;

import org.junit.jupiter.api.Test;

import java.util.List;


import static org.assertj.core.api.Assertions.assertThat;


public class AssertJListExample {

    @Test
    public void shouldReverseOrderAndCopyList() {
        final List<String> testedList = List.of("raz", "dwa", "trzy");

        List<String> reversed = ListUtil.getReveredList(testedList);

        assertThat(reversed)
                .isNotEmpty()
                .isNotSameAs(testedList)
                .containsExactly("trzy", "dwa", "raz")
                .contains("raz");
    }
}
