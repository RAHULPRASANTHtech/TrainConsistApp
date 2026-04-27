import java.util.Arrays;
import java.util.List;

/**
 * ============================================================
 * Use Case 12 - Safety Compliance Check for Goods Bogies
 * ============================================================
 *
 * @version 12.0
 */
public class UseCase12TrainConsistMgmt {

    // Inner class to represent a Goods Bogie
    static class GoodsBogie {
        String type;
        String cargo;

        public GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC12: Safety Compliance Check ===\n");

        // Create list of goods bogies
        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Box", "Coal"),
                new GoodsBogie("Flat", "Steel"),
                new GoodsBogie("Cylindrical", "Petroleum")
        );

        // Stream + allMatch + lambda
        boolean isSafe = bogies.stream().allMatch(bogie ->
                !(bogie.type.equalsIgnoreCase("Cylindrical")) ||
                        bogie.cargo.equalsIgnoreCase("Petroleum")
        );

        // Output result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }
    }
}