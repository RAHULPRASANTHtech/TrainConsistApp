import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase8TrainConsistMgmtTest {

    @Test
    void testFilterGreaterThan60() {
        List<Bogie> list = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56)
        );

        List<Bogie> result =
                UseCase8TrainConsistMgmt.filterBogies(list, 60);

        assertEquals(1, result.size());
        assertEquals("Sleeper", result.get(0).name);
    }

    @Test
    void testNoMatch() {
        List<Bogie> list = List.of(
                new Bogie("AC Chair", 50)
        );

        List<Bogie> result =
                UseCase8TrainConsistMgmt.filterBogies(list, 60);

        assertTrue(result.isEmpty());
    }

    @Test
    void testAllMatch() {
        List<Bogie> list = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("General", 90)
        );

        List<Bogie> result =
                UseCase8TrainConsistMgmt.filterBogies(list, 60);

        assertEquals(2, result.size());
    }
}