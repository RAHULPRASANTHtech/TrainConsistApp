/**
 * ============================================================
 * USE CASE 18 - Linear Search for Bogie ID
 * ============================================================
 *
 * @author Rahul
 * @version 1.0
 */

public class UseCase18TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=== UC18: Linear Search for Bogie ID ===\n");

        // Array of bogie IDs
        String[] bogieIds = {
                "BG101", "BG205", "BG309", "BG410", "BG512"
        };

        // Search key
        String searchKey = "BG309";

        boolean found = false;

        // 🔍 Linear Search
        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(searchKey)) {
                found = true;
                System.out.println("Bogie ID found at position: " + i);
                break; // 🔥 early termination
            }
        }

        if (!found) {
            System.out.println("Bogie ID not found.");
        }
    }
}