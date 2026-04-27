import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Test class for UC20
 */
public class UseCase20TrainConsistMgmtTest {

    @Test(expected = IllegalStateException.class)
    public void testEmptyListThrowsException() {

        List<String> bogies = new ArrayList<>();

        UseCase20TrainConsistMgmt.searchBogie(bogies, "BG101");
    }

    @Test
    public void testValidSearch() {

        List<String> bogies = new ArrayList<>();
        bogies.add("BG101");
        bogies.add("BG202");

        // Should NOT throw exception
        UseCase20TrainConsistMgmt.searchBogie(bogies, "BG101");

        assertTrue(bogies.contains("BG101"));
    }
}