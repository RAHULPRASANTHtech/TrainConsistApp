import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;

/**
 * Test class for UC13
 */
public class UseCase13TrainConsistMgmtTest {

    @Test
    public void testFilteringConsistency() {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Cylindrical", "Petroleum"));
        bogies.add(new Bogie("Box", "Coal"));
        bogies.add(new Bogie("Cylindrical", "Steel"));

        // Loop result
        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getType().equals("Cylindrical") &&
                    b.getCargo().equals("Petroleum")) {
                loopResult.add(b);
            }
        }

        // Stream result
        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getType().equals("Cylindrical")
                        && b.getCargo().equals("Petroleum"))
                .toList();

        // Both should match
        assertEquals(loopResult.size(), streamResult.size());
    }
}