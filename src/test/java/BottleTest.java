import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BottleTest {

    Bottle bottle = new Bottle();

    @Test
    void testSoma() {
        assertEquals("A", bottle.Song());
    }

}