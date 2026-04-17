import java.util.*;
import java.util.regex.*;
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}
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
        // ================= UC6 START =================

        System.out.println("\n====================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("====================================\n");

// Create HashMap
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

// Insert values
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo", 120);
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);

// Display
        System.out.println("Bogie Capacity Details:");

// Iterate using entrySet()
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

// Completion message
        System.out.println("\nUC6 bogie-capacity mapping completed...");

// ================= UC6 END =================
        // ================= UC7 START =================

        System.out.println("\n====================================");
        System.out.println(" UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("====================================\n");

// Create list of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

// Before sorting
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

// Sort using Comparator (ascending)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

// After sorting
        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

// Completion message
        System.out.println("\nUC7 sorting completed...");

// ================= UC7 END =================

        System.out.println("\nSystem ready for operations...");

    }
}
// ================= UC8 START =================

System.out.println("\n====================================");
System.out.println(" UC8 - Filter Passenger Bogies Using Streams");
System.out.println("====================================\n");

System.out.println("All Bogies:");
for (Bogie b : bogies) {
    System.out.println(b.name + " -> " + b.capacity);
}

List<Bogie> filtered = bogies.stream()
        .filter(b -> b.capacity > 60)
        .toList();

System.out.println("\nFiltered Bogies (Capacity > 60):");
for (Bogie b : filtered) {
    System.out.println(b.name + " -> " + b.capacity);
}

System.out.println("\nUC8 filtering completed...");

// ================= UC8 END =================

// ================= UC9 START =================

System.out.println("\n====================================");
System.out.println(" UC9 - Group Bogies using Streams");
System.out.println("====================================\n");

// Reuse bogies list from UC7

// Group by category (example: based on capacity type)
Map<String, List<Bogie>> grouped = bogies.stream()
        .collect(Collectors.groupingBy(b -> {
            if (b.capacity >= 70) return "High Capacity";
            else if (b.capacity >= 50) return "Medium Capacity";
            else return "Low Capacity";
        }));

// Display grouped result
for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {
    System.out.println(entry.getKey() + ":");
    for (Bogie b : entry.getValue()) {
        System.out.println("  " + b.name + " -> " + b.capacity);
    }
    System.out.println();
}

System.out.println("UC9 grouping completed...");

// ================= UC9 END =================
// ================= UC10 START =================

System.out.println("\n====================================");
System.out.println(" UC10 - Total Capacity using Stream Reduction");
System.out.println("====================================\n");

// Reuse bogies list

// Calculate total capacity
int totalCapacity = bogies.stream()
        .map(b -> b.capacity)
        .reduce(0, Integer::sum);

// Display result
System.out.println("Total Seating Capacity: " + totalCapacity);

System.out.println("\nUC10 aggregation completed...");

// ================= UC10 END =================
// ================= UC11 START =================

System.out.println("\n====================================");
System.out.println(" UC11 - Validate Train ID & Cargo Code (Regex)");
System.out.println("====================================\n");

// Sample inputs (you can later take from user)
String trainId = "TRN-1234";
String cargoCode = "PET-AB";

// Regex patterns
String trainPattern = "TRN-\\d{4}";
String cargoPattern = "PET-[A-Z]{2}";

// Compile patterns
Pattern trainRegex = Pattern.compile(trainPattern);
Pattern cargoRegex = Pattern.compile(cargoPattern);

// Match inputs
Matcher trainMatcher = trainRegex.matcher(trainId);
Matcher cargoMatcher = cargoRegex.matcher(cargoCode);

// Validate
boolean isTrainValid = trainMatcher.matches();
boolean isCargoValid = cargoMatcher.matches();

// Output
System.out.println("Train ID (" + trainId + ") Valid? : " + isTrainValid);
System.out.println("Cargo Code (" + cargoCode + ") Valid? : " + isCargoValid);

System.out.println("\nUC11 validation completed...");

// ================= UC11 END =================