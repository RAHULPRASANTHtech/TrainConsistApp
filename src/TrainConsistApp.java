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

        System.out.println("\nSystem ready for operations...");
    }
}