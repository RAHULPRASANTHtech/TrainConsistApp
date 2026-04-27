import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for UC14
 */
public class UseCase14TrainConsistMgmtTest {

    @Test
    public void testValidCapacity() throws InvalidCapacityException {
        PassengerBogie bogie = new PassengerBogie(30);
        assertEquals(30, bogie.getCapacity());
    }

    @Test(expected = InvalidCapacityException.class)
    public void testInvalidCapacity() throws InvalidCapacityException {
        new PassengerBogie(0);
    }
}