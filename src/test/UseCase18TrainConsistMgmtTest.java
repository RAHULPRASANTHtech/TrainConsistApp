import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for UC18
 */
public class UseCase18TrainConsistMgmtTest {

    @Test
    public void testSearchFound() {

        String[] ids = {"A1", "B2", "C3"};
        String key = "B2";

        boolean found = false;

        for (String id : ids) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        assertTrue(found);
    }

    @Test
    public void testSearchNotFound() {

        String[] ids = {"A1", "B2", "C3"};
        String key = "Z9";

        boolean found = false;

        for (String id : ids) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        assertFalse(found);
    }
}