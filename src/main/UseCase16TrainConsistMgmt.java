/**
 * ============================================================
 * USE CASE 16 - Sort Passenger Bogies by Capacity (Bubble Sort)
 * ============================================================
 *
 * @author Rahul
 * @version 1.0
 */

public class UseCase16TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=== UC16: Bubble Sort on Bogie Capacities ===\n");

        // Sample capacities
        int[] capacities = {50, 20, 80, 40, 10, 60};

        System.out.print("Before Sorting: ");
        printArray(capacities);

        // 🔁 Bubble Sort
        for (int i = 0; i < capacities.length - 1; i++) {

            for (int j = 0; j < capacities.length - i - 1; j++) {

                if (capacities[j] > capacities[j + 1]) {

                    // 🔄 Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.print("After Sorting:  ");
        printArray(capacities);
    }

    // Helper method to print array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}