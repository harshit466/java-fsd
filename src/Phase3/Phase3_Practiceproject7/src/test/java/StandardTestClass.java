import org.junit.jupiter.api.*;

public class StandardTestClass {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all tests");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before each test");
    }

    @Test
    public void testExample() {
        System.out.println("Example test");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After each test");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all tests");
    }
}
