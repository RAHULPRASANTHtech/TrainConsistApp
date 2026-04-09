import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Initialize train consist
        List<String> trainConsist = new ArrayList<>();

        System.out.println("====================================");
        System.out.println("     === Train Consist Management App ===");
        System.out.println("====================================\n");

        // UC1
        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist);

        // ================= UC2 START =================

        System.out.println("\n--- Adding Passenger Bogies ---");

        // Add bogies
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        // Display after insertion
        System.out.println("After Adding Bogies : " + trainConsist);

        // Remove one bogie
        System.out.println("\n--- Removing Bogie (AC Chair) ---");
        trainConsist.remove("AC Chair");

        System.out.println("After Removal : " + trainConsist);

        // Check existence
        System.out.println("\n--- Checking Existence ---");
        boolean exists = trainConsist.contains("Sleeper");

        System.out.println("Does Sleeper exist? : " + exists);

        // Final state
        System.out.println("\nFinal Train Consist : " + trainConsist);

        // ================= UC2 END =================
// ================= UC3 START =================

        System.out.println("\n====================================");
        System.out.println("        UC3 - Track Unique Bogie IDs");
        System.out.println("====================================\n");

// Create HashSet
        Set<String> bogieIds = new HashSet<>();

// Add bogie IDs (including duplicates)
        bogieIds.add("B104");
        bogieIds.add("B103");
        bogieIds.add("B102");
        bogieIds.add("B101");
        bogieIds.add("B104"); // duplicate
        bogieIds.add("B103"); // duplicate

// Display result
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogieIds);

// Note
        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

// Completion message
        System.out.println("\nUC3 uniqueness validation completed...");

// ================= UC3 END =================
        System.out.println("\nSystem ready for operations...");
    }
}