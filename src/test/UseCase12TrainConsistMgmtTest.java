import java.util.Arrays;
import java.util.List;

/**
 * ============================================================
 * Test - Use Case 12
 * ============================================================
 */
public class UseCase12TrainConsistMgmtTest {

    static class GoodsBogie {
        String type;
        String cargo;

        public GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Running UC12 Tests ===\n");

        // Test Case 1: Valid Data
        List<GoodsBogie> validBogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Box", "Coal")
        );

        boolean result1 = validBogies.stream().allMatch(b ->
                !(b.type.equalsIgnoreCase("Cylindrical")) ||
                        b.cargo.equalsIgnoreCase("Petroleum")
        );

        System.out.println("Test Case 1 (Expected: true): " + result1);

        // Test Case 2: Invalid Data
        List<GoodsBogie> invalidBogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Water"),
                new GoodsBogie("Box", "Coal")
        );

        boolean result2 = invalidBogies.stream().allMatch(b ->
                !(b.type.equalsIgnoreCase("Cylindrical")) ||
                        b.cargo.equalsIgnoreCase("Petroleum")
        );

        System.out.println("Test Case 2 (Expected: false): " + result2);
    }
}