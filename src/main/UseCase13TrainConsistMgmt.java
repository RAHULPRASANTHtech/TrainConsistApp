import java.util.*;
import java.util.stream.Collectors;

/**
 * ============================================================
 * USE CASE 13 - Performance Comparison (Loops vs Streams)
 * ============================================================
 *
 * @author Rahul
 * @version 1.0
 *
 * Description:
 * Compares performance between loop-based filtering and
 * stream-based filtering using System.nanoTime().
 */

class Bogie {
    private String type;
    private String cargo;

    public Bogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }
}

public class UseCase13TrainConsistMgmt {

    public static void main(String[] args) {

        List<Bogie> bogies = generateBogies(100000);

        // 🔁 LOOP-BASED FILTERING
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getType().equals("Cylindrical") &&
                    b.getCargo().equals("Petroleum")) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // 🌊 STREAM-BASED FILTERING
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getType().equals("Cylindrical")
                        && b.getCargo().equals("Petroleum"))
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // 📊 OUTPUT
        System.out.println("===== PERFORMANCE COMPARISON =====");
        System.out.println("Loop Time   : " + loopTime + " ns");
        System.out.println("Stream Time : " + streamTime + " ns");
    }

    // Helper method to generate sample data
    private static List<Bogie> generateBogies(int count) {
        List<Bogie> list = new ArrayList<>();
        String[] types = {"Cylindrical", "Box", "Flat"};
        String[] cargos = {"Petroleum", "Coal", "Steel"};

        Random random = new Random();

        for (int i = 0; i < count; i++) {
            String type = types[random.nextInt(types.length)];
            String cargo = cargos[random.nextInt(cargos.length)];
            list.add(new Bogie(type, cargo));
        }

        return list;
    }
}