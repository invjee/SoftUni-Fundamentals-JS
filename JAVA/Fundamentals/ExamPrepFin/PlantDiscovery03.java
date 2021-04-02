package ExamPrepFin;

import java.sql.Array;
import java.util.*;

public class PlantDiscovery03 {
    static class Plant {
        String name;
        int rarity;
        List<Double> ratings;

        public Plant(String name, int rarity) {
            this.name = name;
            this.rarity = rarity;
            this.ratings = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void addRating(double rating) {
            this.ratings.add(rating);
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }

        public void resetRating(String resetPlantName) {
            this.ratings.clear();
        }


        public int getRarity() {
            return rarity;
        }

        public double getAverageRating() {
            double average = 0.0;
            if (this.ratings.isEmpty()) {
                return 0;
            }
            for (Double rating : this.ratings) {
                average += rating;
            }
            average = average / this.ratings.size();
            return average;
        }
    }

    public static void main(String[] args) {
        Map<String, Plant> plantsByName = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] plantAndRarity = scanner.nextLine().split("<->");
            Plant p = new Plant(plantAndRarity[0], Integer.parseInt(plantAndRarity[1]));
            plantsByName.put(p.getName(), p);
        }

        String command = scanner.nextLine();

        while (!command.equals("Exhibition")) {
            String[] commandAndParameters = command.split(": ");
            switch (commandAndParameters[0]) {
                case "Rate":
                    String[] rateParameters = commandAndParameters[1].split(" - ");
                    String plantName = rateParameters[0];
                    double plantRating = Double.parseDouble(rateParameters[1]);
                    Plant ratePlant = plantsByName.get(plantName);
                    if (ratePlant != null) {
                        plantsByName.get(plantName).addRating(plantRating);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Update":
                    String[] updateParameters = commandAndParameters[1].split(" - ");
                    String updatePlantName = updateParameters[0];
                    int updateRarity = Integer.parseInt(updateParameters[1]);
                    Plant updatePlant = plantsByName.get(updatePlantName);
                    if (updatePlant != null) {
                        plantsByName.get(updatePlantName).setRarity(updateRarity);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Reset":
                    String resetPlantName = commandAndParameters[1];
                    Plant resetPlant = plantsByName.get(resetPlantName);
                    if (resetPlant != null) {
                        plantsByName.get(resetPlantName).resetRating(resetPlantName);
                    } else {
                        System.out.println("error");
                    }
                    break;
                default:
                    System.out.println("error");
            }

            command = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        plantsByName.values().stream()
                .sorted((a, b) -> {
                    if (a.getRarity() != b.getRarity()) {
                        return Integer.compare(b.getRarity(), a.getRarity());
                    } else {
                        return Double.compare(b.getAverageRating(), a.getAverageRating());
                    }
                })
                .map(e -> "- " + e.getName() + "; Rarity: " + e.getRarity() + "; Rating: " + String.format("%.2f", e.getAverageRating()))
                .forEach(s -> System.out.println(s));
    }
}
