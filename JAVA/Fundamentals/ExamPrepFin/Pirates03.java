package ExamPrepFin;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<String, Integer[]> cities = new LinkedHashMap<>();

        while (!line.equals("Sail")) {
            String[] tokens = line.split("\\|\\|");

            String name = tokens[0].trim();
            int population = Integer.parseInt(tokens[1].trim());
            int gold = Integer.parseInt(tokens[2].trim());

            if (!cities.containsKey(name)) {
                cities.put(name, new Integer[2]);
                cities.get(name)[0] = population;
                cities.get(name)[1] = gold;
            } else {

                cities.get(name)[0] += population;
                cities.get(name)[1] += gold;
            }

            line = scanner.nextLine();
        }
        System.out.println();
        line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] tokens = line.split("=>");
            String command = tokens[0].trim();
            String town = tokens[1].trim();
            if (command.equals("Plunder")) {
                int people = Integer.parseInt(tokens[2].trim());
                int gold = Integer.parseInt(tokens[3].trim());
                plunder(cities, town, people, gold);


            } else if (command.equals("Prosper")) {
                int gold = Integer.parseInt(tokens[2].trim());
                prosper(cities, town, gold);

            }
            line = scanner.nextLine();
        }
        if(cities.size()>0) {
            System.out.println("Ahoy, Captain! There are " + cities.size() + " wealthy settlements to go to:");
            cities.entrySet().stream()
                    .sorted((a,b)->{
                        int result = b.getValue()[1].compareTo(a.getValue()[1]);
                        if (result==0){
                           result= a.getKey().compareTo(b.getKey());
                        }
                        return result;
                    })
                    .forEach(e->{
                        System.out.println(String.format("%s -> Population: %d citizens, Gold: %d kg", e.getKey(), e.getValue()[0], e.getValue()[1]));
                    });
        }else{
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }

    }

    static Map<String, Integer[]> plunder(Map<String, Integer[]> cities, String town, int people, int gold) {
        cities.get(town)[0] -= people;
        cities.get(town)[1] -= gold;
        System.out.println(String.format("%s plundered! %d gold stolen, %d citizens killed.", town, gold, people));
        if (cities.get(town)[0] == 0 || cities.get(town)[1] == 0) {
            cities.remove(town);
            System.out.println(town + " has been wiped off the map!");
        }

        return cities;
    }
    static Map<String, Integer[]> prosper(Map<String, Integer[]> cities, String town, int gold){
        if(gold<0){
            System.out.println("Gold added cannot be a negative number!");
            return cities;
        }
        cities.get(town)[1]+=gold;
        System.out.println(String.format("%d gold added to the city treasury. %s now has %d gold.", gold, town, cities.get(town)[1]));

        return cities;
    }
}
