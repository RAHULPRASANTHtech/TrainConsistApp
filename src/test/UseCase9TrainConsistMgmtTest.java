import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase9TrainConsistMgmtTest {

    @Test
    void testGrouping() {
        List<Bogie> list = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24)
        );

        Map<String, List<Bogie>> result =
                UseCase9TrainConsistMgmt.groupBogies(list);

        assertTrue(result.containsKey("High"));
        assertTrue(result.containsKey("Medium"));
        assertTrue(result.containsKey("Low"));
    }

    @Test
    void testEmptyList() {
        List<Bogie> list = new ArrayList<>();

        Map<String, List<Bogie>> result =
                UseCase9TrainConsistMgmt.groupBogies(list);

        assertTrue(result.isEmpty());
    }
}