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

public class UseCase9TrainConsistMgmt {

    public static Map<String, List<Bogie>> groupBogies(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(b -> {
                    if (b.capacity >= 70) return "High";
                    else if (b.capacity >= 50) return "Medium";
                    else return "Low";
                }));
    }

    public static void main(String[] args) {
        List<Bogie> list = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("General", 90)
        );

        Map<String, List<Bogie>> grouped = groupBogies(list);

        grouped.forEach((k, v) -> {
            System.out.println(k + ":");
            v.forEach(b -> System.out.println(" " + b.name));
        });
    }
}