import java.util.Arrays;

/**
 * ============================================================
 * USE CASE 19 - Binary Search for Bogie ID
 * ============================================================
 *
 * @author Rahul
 * @version 1.0
 */

public class UseCase19TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=== UC19: Binary Search for Bogie ID ===\n");

        // Sorted bogie IDs (IMPORTANT precondition)
        String[] bogieIds = {
                "BG101", "BG205", "BG309", "BG410", "BG512"
        };

        // (Optional safety) ensure sorted
        Arrays.sort(bogieIds);

        String searchKey = "BG309";

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        // 🔍 Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = bogieIds[mid].compareTo(searchKey);

            if (comparison == 0) {
                System.out.println("Bogie ID found at index: " + mid);
                found = true;
                break;
            } else if (comparison < 0) {
                low = mid + 1;   // search right half
            } else {
                high = mid - 1;  // search left half
            }
        }

        if (!found) {
            System.out.println("Bogie ID not found.");
        }
    }
}