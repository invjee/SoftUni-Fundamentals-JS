package ExamMid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class some02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> friends = Arrays.stream(scanner.nextLine().split(",\\s+")).collect(Collectors.toList());
        int countBlacklisted = 0;
        int countLost = 0;
        String line = scanner.nextLine();
        while (!line.equals("Report")) {
            String[] tokens = line.split("\\s+");
            String command = tokens[0];
            if (command.equals("Blacklist")) {
                String name = tokens[1];
                if (friends.contains(name)) {
                    int index = friends.indexOf(name);
                    friends.set(index, "Blacklisted");
                    System.out.println(name + " was blacklisted.");
                    countBlacklisted++;
                } else {
                    System.out.println(name + " was not found.");
                }

            } else if (command.equals("Error")) {
                int index = Integer.parseInt(tokens[1]);
                String nameOnIndex = friends.get(index);
                if ((!nameOnIndex.equals("Lost")) && (!nameOnIndex.equals("Blacklisted"))) {
                    friends.set(index, "Lost");
                    countLost++;
                    System.out.println(nameOnIndex + " was lost due to an error.");

                }


            } else if (command.equals("Change")) {
                int index = Integer.parseInt(tokens[1]);
                String newName = tokens[2];
                if (index >= 0 && index < friends.size()) {
                    String currentName = friends.get(index);
                    friends.set(index, newName);
                    System.out.printf("%s changed his username to %s.%n", currentName, newName);
                }


            }

            line = scanner.nextLine();
        }
        System.out.println("Blacklisted names: "+ countBlacklisted);
        System.out.println("Lost names: "+countLost);
        System.out.println(friends.toString().replaceAll("[\\[\\],]", ""));
    }
}
