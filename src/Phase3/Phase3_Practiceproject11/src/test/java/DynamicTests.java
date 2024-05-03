import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class DynamicTests {

    @TestFactory
    public Stream<DynamicTest> testDynamicTests() {
        return Stream.of("apple", "banana", "cherry")
                .map(fruit ->
                        dynamicTest("Test for fruit " + fruit, () -> {
                            assertEquals(6, fruit.length());
                            
                        })
                );
    }
}
