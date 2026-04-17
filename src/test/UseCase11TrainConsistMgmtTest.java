import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase11TrainConsistMgmtTest {

    @Test
    void testValidTrainId() {
        assertTrue(UseCase11TrainConsistMgmt.validateTrainId("TRN-1234"));
    }

    @Test
    void testInvalidTrainId() {
        assertFalse(UseCase11TrainConsistMgmt.validateTrainId("TRN-12A4"));
    }

    @Test
    void testValidCargo() {
        assertTrue(UseCase11TrainConsistMgmt.validateCargoCode("PET-AB"));
    }

    @Test
    void testInvalidCargo() {
        assertFalse(UseCase11TrainConsistMgmt.validateCargoCode("PET-123"));
    }
}