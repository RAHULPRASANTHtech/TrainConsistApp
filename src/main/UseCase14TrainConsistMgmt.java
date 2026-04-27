/**
 * ============================================================
 * USE CASE 14 - Handle Invalid Bogie Capacity
 * ============================================================
 */

public class UseCase14TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=== UC14: Capacity Validation ===\n");

        try {
            // ✅ Valid case
            PassengerBogie validBogie = new PassengerBogie(50);
            System.out.println("Valid bogie created with capacity: "
                    + validBogie.getCapacity());

            // ❌ Invalid case
            PassengerBogie invalidBogie = new PassengerBogie(0);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}