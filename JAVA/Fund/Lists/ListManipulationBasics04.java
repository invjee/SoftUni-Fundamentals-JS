package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] tokens = line.split(" ");
            String command = tokens[0];
            if (command.equals("Add")) {
                int number = Integer.parseInt(tokens[1]);
                numbers.add(number);

            } else if (command.equals("Remove")) {
                int number = Integer.parseInt(tokens[1]);
                numbers.remove(Integer.valueOf(number));

            } else if (command.equals("RemoveAt")) {
                int index = Integer.parseInt(tokens[1]);
                numbers.remove(index);

            } else if (command.equals("Insert")) {
                int number = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);
                numbers.add(index, number);
            }
            line = scanner.nextLine();

        }
       //System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }

    private static List<Integer> addNumber(List<Integer> numbers, int number) {

        return numbers;
    }
}
