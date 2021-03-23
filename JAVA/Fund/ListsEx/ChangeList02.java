package ListsEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!line.equals("end")) {
            String[] tokens = line.split("\\s+");
            if (tokens[0].equals("Delete")) {
                int number = Integer.parseInt(tokens[1]);
                deleteEl(numbers, number);

            } else if (tokens[0].equals("Insert")) {
                int number = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);
                insertEl(numbers, number, index);

            }
            line= scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }

    private static List<Integer> insertEl(List<Integer> numbers, int number, int index) {
        numbers.add(index, number);
        return numbers;
    }

    private static List<Integer> deleteEl(List<Integer> numbers, int number) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == number) {
                numbers.remove(i);
                i--;

            }
        }
        return numbers;
    }
}
