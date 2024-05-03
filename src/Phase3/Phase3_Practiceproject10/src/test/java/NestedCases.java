import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NestedCases {

    @Nested
    @DisplayName("Addition tests")
    class AdditionTests {
        @Test
        @DisplayName("Adding two positive numbers")
        void testAddition() {
            Calculator calculator = new Calculator();
            assertEquals(4, calculator.add(2, 2));
        }
    }

    @Nested
    @DisplayName("Subtraction tests")
    class SubtractionTests {
        @Test
        @DisplayName("Subtracting two positive numbers")
        void testSubtraction() {
            Calculator calculator = new Calculator();
            assertEquals(0, calculator.subtract(2, 2));
        }
    }
}
