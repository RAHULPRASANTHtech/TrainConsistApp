import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class UseCase8TrainConsistMgmt {

    public static List<Bogie> filterBogies(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.capacity > threshold)
                .toList();
    }

    public static void main(String[] args) {

        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("General", 90)
        );

        List<Bogie> filtered = filterBogies(bogies, 60);

        filtered.forEach(b ->
                System.out.println(b.name + " -> " + b.capacity));
    }
}