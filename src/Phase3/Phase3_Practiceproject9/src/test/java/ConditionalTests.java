import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConditionalTests {

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void testOnlyOnWindows() {
        assertTrue(true);
    }

    @Test
    @EnabledOnOs(OS.MAC)
    public void testOnlyOnMac() {
        assertTrue(true);
    }

    @Test
    @EnabledOnOs({OS.LINUX, OS.MAC})
    public void testOnLinuxOrMac() {
        assertTrue(true);
    }
}
