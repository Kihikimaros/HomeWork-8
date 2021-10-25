package lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static lesson4.Functions.isNumberEven;

public class AssumptionsExamplesTest {
    @Test
    void trueAssumption() {
        //Assumptions.assumeTrue(1 == 2);
        Assertions.assertFalse(true);
        Assertions.assertTrue(false);
    }

    @Test
    void softAssertionsTest() {
        Assertions.assertAll(
                () -> Assertions.assertTrue(isNumberEven(3)),
                () -> Assertions.assertTrue(false)
        );
    }
}
