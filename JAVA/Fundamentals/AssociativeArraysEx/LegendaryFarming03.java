package AssociativeArraysEx;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> legendaryItems = new LinkedHashMap<>();
        Map<String, Integer> junk = new LinkedHashMap<>();
        legendaryItems.put("shards", 0);
        legendaryItems.put("fragments", 0);
        legendaryItems.put("motes", 0);

        boolean isObtained = false;

        while (!isObtained) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int i = 0; i < line.length; i += 2) {
                int num = Integer.parseInt(line[i]);
                String word = line[i + 1];
                word = word.toLowerCase();
                if (legendaryItems.containsKey(word)) {
                    legendaryItems.put(word, legendaryItems.get(word) + num);
                    isObtained = isObtained(legendaryItems, word);
                    if (isObtained) {
                        break;
                    }
                } else {
                    junk.putIfAbsent(word, 0);
                    junk.put(word, junk.get(word) + num);
                }
            }
        }
        legendaryItems.entrySet()
                .stream()
                .sorted((a, b) -> {
                    int result = b.getValue().compareTo(a.getValue());
                    if (result == 0) {
                        result = a.getKey().compareTo(b.getKey());
                    }
                    return result;
                })
                .forEach(e -> System.out.println(String.format("%s: %d", e.getKey(), e.getValue())));
        junk.entrySet()
                .stream()
                .sorted((a,b)->a.getKey().compareTo(b.getKey()))
                .forEach(e-> System.out.println(String.format("%s: %d", e.getKey(), e.getValue())));

    }


    private static boolean isObtained(Map<String, Integer> legendaryItems, String word) {
        if (legendaryItems.get(word) >= 250) {
            int newQuantity = legendaryItems.get(word) - 250;
            legendaryItems.put(word, newQuantity);
            switch (word) {
                case "shards":
                    System.out.println("Shadowmourne obtained!");
                    break;
                case "fragments":
                    System.out.println("Valanyr obtained!");
                    break;
                case "motes":
                    System.out.println("Dragonwrath obtained!");
                    break;
            }
            return true;
        }
        return false;
    }
}
