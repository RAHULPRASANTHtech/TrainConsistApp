import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Test class for UC17
 */
public class UseCase17TrainConsistMgmtTest {

    @Test
    public void testSorting() {

        String[] input = {"BogieC", "BogieA", "BogieB"};

        Arrays.sort(input);

        String[] expected = {"BogieA", "BogieB", "BogieC"};

        assertArrayEquals(expected, input);
    }
}