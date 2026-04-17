import java.util.regex.*;

public class UseCase11TrainConsistMgmt {

    public static boolean validateTrainId(String id) {
        return Pattern.compile("TRN-\\d{4}").matcher(id).matches();
    }

    public static boolean validateCargoCode(String code) {
        return Pattern.compile("PET-[A-Z]{2}").matcher(code).matches();
    }

    public static void main(String[] args) {

        String trainId = "TRN-1234";
        String cargo = "PET-AB";

        System.out.println("Train Valid: " + validateTrainId(trainId));
        System.out.println("Cargo Valid: " + validateCargoCode(cargo));
    }
}