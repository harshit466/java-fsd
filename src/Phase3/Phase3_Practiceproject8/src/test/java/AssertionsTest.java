import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    public void testAssertEquals() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testAssertTrue() {
        assertTrue(1 == 1);
    }

    @Test
    public void testAssertFalse() {
        assertFalse(1 == 2);
    }

    @Test
    public void testAssertNotNull() {
        assertNotNull(new Object());
    }

    @Test
    public void testAssertNull() {
        assertNull(null);
    }

    @Test
    public void testAssertArrayEquals() {
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});
    }
}
