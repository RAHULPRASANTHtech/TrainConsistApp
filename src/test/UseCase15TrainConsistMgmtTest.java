import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for UC15
 */
public class UseCase15TrainConsistMgmtTest {

    @Test
    public void testSafeAssignment() {
        GoodsBogie bogie = new GoodsBogie("Cylindrical");
        bogie.assignCargo("Petroleum");

        assertEquals("Petroleum", bogie.getCargo());
    }

    @Test
    public void testUnsafeAssignment() {
        GoodsBogie bogie = new GoodsBogie("Rectangular");
        bogie.assignCargo("Petroleum");

        // Cargo should remain null due to failure
        assertNull(bogie.getCargo());
    }
}