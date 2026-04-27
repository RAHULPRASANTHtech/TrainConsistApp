import java.util.Arrays;

/**
 * ============================================================
 * USE CASE 17 - Sort Bogie Names Using Arrays.sort()
 * ============================================================
 *
 * @author Rahul
 * @version 1.0
 */

public class UseCase17TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=== UC17: Sort Bogie Names ===\n");

        // Bogie type names
        String[] bogieNames = {
                "Sleeper",
                "AC",
                "General",
                "FirstClass",
                "SecondSitting"
        };

        System.out.println("Before Sorting: " + Arrays.toString(bogieNames));

        // ✅ Built-in sorting
        Arrays.sort(bogieNames);

        System.out.println("After Sorting:  " + Arrays.toString(bogieNames));
    }
}