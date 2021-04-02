package AssociativeArraysMore;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SnowWhite04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        Map<String, Map<String, Integer>> dwarfs = new LinkedHashMap<>();
        while (!line.equals("Once upon a time")) {
            String[] tokens = line.split(" <:> ");
            String name = tokens[0];
            String color = tokens[1];
            int physics = Integer.parseInt(tokens[2]);

            if (!dwarfs.containsKey(color)) {
                dwarfs.put(color, new LinkedHashMap<>());
                dwarfs.get(color).put(name, physics);
            } else {
                if (dwarfs.get(color).containsKey(name)) {
                    int currentPhysics = dwarfs.get(color).get(name);
                    if (currentPhysics > physics) {
                        dwarfs.get(color).put(name, currentPhysics);
                    }
                } else {
                    dwarfs.get(color).put(name, physics);
                }
            }

            line = scanner.nextLine();
        }
        Map<String, Integer> newDwarfs = new LinkedHashMap<>();
        for (Map.Entry<String, Map<String, Integer>> dwarfValues : dwarfs.entrySet()) {
            for (Map.Entry<String, Integer> value : dwarfValues.getValue().entrySet()) {
                String joinDwarfColor = dwarfValues.getKey() + " " + value.getKey();
                newDwarfs.put(joinDwarfColor, value.getValue());
            }
        }
        Map<String, Integer> colorCountSet = new LinkedHashMap<>();
        for (Map.Entry<String, Map<String, Integer>> colorCount : dwarfs.entrySet()) {
            for (Map.Entry<String, Integer> value : colorCount.getValue().entrySet()) {
                String joinDwarfColor = colorCount.getKey() + " " + value.getKey();
                int counter = 0;
                newDwarfs.put(joinDwarfColor, value.getValue());
            }
        }


        newDwarfs.entrySet().stream()
                .sorted((a, b) -> {
                    int result = b.getValue().compareTo(a.getValue());
                    if (result == 0) {
                        String firstKey = a.getKey().split(" ")[0];
                        String secondKey = b.getKey().split(" ")[0];
                        int first = dwarfs.get(firstKey).size();
                        int second = dwarfs.get(secondKey).size();
                        result = Integer.compare(second, first);
                    }
                    return result;
                }).forEach(e -> System.out.println("("+e.getKey().split(" ")[0]+") "+e.getKey().split(" ")[1]+" <-> "+e.getValue()));
    }


}

