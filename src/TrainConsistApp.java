import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Initialize empty train consist
        List<String> trainConsist = new ArrayList<>();

        // Display header
        System.out.println("====================================");
        System.out.println("     === Train Consist Management App ===");
        System.out.println("====================================\n");

        // Initialization message
        System.out.println("Train initialized successfully...");

        // Display bogie count
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // Display current consist
        System.out.println("Current Train Consist : " + trainConsist);

        // Final message
        System.out.println("\nSystem ready for operations...");
    }
}