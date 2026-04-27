import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for UC16
 */
public class UseCase16TrainConsistMgmtTest {

    @Test
    public void testSorting() {

        int[] input = {5, 3, 8, 1};

        // Bubble Sort logic
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }

        int[] expected = {1, 3, 5, 8};
        assertArrayEquals(expected, input);
    }
}