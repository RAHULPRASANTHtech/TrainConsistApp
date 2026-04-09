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
        // ================= UC4 START =================

        System.out.println("\n====================================");
        System.out.println("   UC4 - Maintain Ordered Bogie Consist");
        System.out.println("====================================\n");

// Create LinkedList
        LinkedList<String> consist = new LinkedList<>();

// Add bogies
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

// Initial state
        System.out.println("Initial Train Consist:");
        System.out.println(consist);

// Insert Pantry Car at position 2
        consist.add(2, "Pantry Car");

        System.out.println("\nAfter Inserting \"Pantry Car\" at position 2:");
        System.out.println(consist);

// Remove first and last
        consist.removeFirst();
        consist.removeLast();

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(consist);

// Completion message
        System.out.println("\nUC4 ordered consist operations completed...");

// ================= UC4 END =================
        // ================= UC5 START =================

        System.out.println("\n====================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies");
        System.out.println("====================================\n");

// Create LinkedHashSet
        LinkedHashSet<String> formation = new LinkedHashSet<>();

// Add bogies
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

// Try adding duplicate
        formation.add("Sleeper"); // duplicate (ignored)

// Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(formation);

// Note
        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

// Completion message
        System.out.println("\nUC5 formation setup completed...");

// ================= UC5 END =================

        System.out.println("\nSystem ready for operations...");

    }
}