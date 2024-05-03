import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RepeatedTests {

    @RepeatedTest(5)
    @DisplayName("Repeated addition test")
    void testRepeatedAddition() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.add(1, 1) == 2);
    }
}
