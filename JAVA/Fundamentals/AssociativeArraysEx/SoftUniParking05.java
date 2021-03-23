package AssociativeArraysEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        Map<String, String> carNumbers = new LinkedHashMap<>();
        for (int i = 1; i <= num; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            String name = tokens[1];


            if (command.equals("register")) {
                String number = tokens[2];
                if (carNumbers.containsKey(name)) {
                    System.out.println(String.format("ERROR: already registered with plate number %s", carNumbers.get(name)));
                } else {
                    carNumbers.put(name, number);
                    System.out.println(String.format("%s registered %s successfully", name, number));
                }

            } else if (command.equals("unregister")) {
                if (!carNumbers.containsKey(name)) {
                    System.out.println(String.format("ERROR: user %s not found", name));
                } else {
                    System.out.println(String.format("%s unregistered successfully", name));
                    carNumbers.remove(name);
                }
            }
        }
        for (Map.Entry<String, String> entry : carNumbers.entrySet()) {
            System.out.println(String.format("%s => %s", entry.getKey(), entry.getValue()));
        }
    }
}
