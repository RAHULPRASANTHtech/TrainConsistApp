import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase10TrainConsistMgmtTest {

    @Test
    void testTotalCapacity() {
        List<Bogie> list = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56)
        );

        int result =
                UseCase10TrainConsistMgmt.getTotalCapacity(list);

        assertEquals(128, result);
    }

    @Test
    void testEmptyList() {
        List<Bogie> list = new ArrayList<>();

        int result =
                UseCase10TrainConsistMgmt.getTotalCapacity(list);

        assertEquals(0, result);
    }

    @Test
    void testSingleBogie() {
        List<Bogie> list = List.of(
                new Bogie("Sleeper", 72)
        );

        int result =
                UseCase10TrainConsistMgmt.getTotalCapacity(list);

        assertEquals(72, result);
    }
}