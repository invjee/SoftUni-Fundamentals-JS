package ExamPrepMid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> collection = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!line.equals("Craft!")) {
            String[] tokens = line.split(" - ");
            String command = tokens[0];
            String item = tokens[1];
            if (command.equals("Collect")) {
                if (!collection.contains(item)) {
                    collection.add(item);
                }

            } else if (command.equals("Drop")) {
                if (collection.contains(item)) {
                    collection.remove(item);
                }

            } else if (command.equals("Combine Items")) {
                String[] items = item.split(":");
                String oldItem = items[0];
                String newItem = items[1];
                if (collection.contains(oldItem)) {

                    collection.add(collection.indexOf(oldItem)+1, newItem);
                }

            } else if (command.equals("Renew")) {
                if (collection.contains(item)) {
                    collection.remove(item);
                    collection.add(item);
                }

            }

            line = scanner.nextLine();
        }
        System.out.println(collection.toString().replaceAll("[\\[\\]]", ""));
    }
}
