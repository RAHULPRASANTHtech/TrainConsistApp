import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * USE CASE 20 - Exception Handling During Search Operations
 * ============================================================
 *
 * Demonstrates fail-fast validation using IllegalStateException
 *
 * @author Rahul
 * @version 1.0
 */
public class UseCase20TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=== UC20: Safe Search Operation ===\n");

        List<String> bogieIds = new ArrayList<>();

        // 🔍 Attempt search
        try {
            searchBogie(bogieIds, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }

    // Search method with validation
    public static void searchBogie(List<String> bogies, String key) {

        // 🔥 Fail-fast validation
        if (bogies.isEmpty()) {
            throw new IllegalStateException(
                    "Cannot perform search: No bogies available in the train."
            );
        }

        // (If not empty → perform search)
        boolean found = false;

        for (String id : bogies) {
            if (id.equals(key)) {
                found = true;
                System.out.println("Bogie found: " + id);
                break;
            }
        }

        if (!found) {
            System.out.println("Bogie not found.");
        }
    }
}