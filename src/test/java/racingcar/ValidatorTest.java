package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import racingcar.utils.Validator;

public class ValidatorTest {

    @Test
    void validatePositiveIntegerTest() {
        assertThatThrownBy(
                () -> Validator.isPositiveInteger("0")
        ).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]");

        assertThatCode(
                () -> Validator.isPositiveInteger("1")
        ).doesNotThrowAnyException();
    }
}