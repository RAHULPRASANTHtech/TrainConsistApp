/**
 * ============================================================
 * USE CASE 15 - Safe Cargo Assignment
 * ============================================================
 */

public class UseCase15TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=== UC15: Safe Cargo Assignment ===\n");

        // Safe case
        GoodsBogie bogie1 = new GoodsBogie("Cylindrical");
        bogie1.assignCargo("Petroleum");

        // Unsafe case
        GoodsBogie bogie2 = new GoodsBogie("Rectangular");
        bogie2.assignCargo("Petroleum");

        System.out.println("Program continues safely...");
    }
}