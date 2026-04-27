import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Test class for UC19
 */
public class UseCase19TrainConsistMgmtTest {

    @Test
    public void testSearchFound() {

        String[] ids = {"C3", "A1", "B2"};
        Arrays.sort(ids); // must sort before binary search

        String key = "B2";

        int low = 0, high = ids.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = ids[mid].compareTo(key);

            if (cmp == 0) {
                found = true;
                break;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        assertTrue(found);
    }

    @Test
    public void testSearchNotFound() {

        String[] ids = {"A1", "B2", "C3"};
        Arrays.sort(ids);

        String key = "Z9";

        int low = 0, high = ids.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = ids[mid].compareTo(key);

            if (cmp == 0) {
                found = true;
                break;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        assertFalse(found);
    }
}