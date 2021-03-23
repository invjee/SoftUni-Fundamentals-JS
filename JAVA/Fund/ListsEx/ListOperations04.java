package ListsEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] tokens = line.split("\\s+");
            if (tokens[0].equals("Add")) {
                int number = Integer.parseInt(tokens[1]);
                numbers.add(number);

            } else if (tokens[0].equals("Insert")) {
                int number = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);
                if (index >= 0 && index < numbers.size()) {
                    numbers.add(index, number);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (tokens[0].equals("Remove")) {
                int index = Integer.parseInt(tokens[1]);
                if (index >= 0 && index < numbers.size()) {

                    numbers.remove(index);
                } else {
                    System.out.println("Invalid index");
                }


            } else if (tokens[0].equals("Shift")) {
                String word = tokens[1];
                int count = Integer.parseInt(tokens[2]);
                if (word.equals("left")) {
                    shiftLeft(numbers, count);
                }else if(word.equals("right")){
                    shiftRight(numbers, count);
                }
            }

            line = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }

    private static List<Integer> shiftLeft(List<Integer> numbers, int count) {
        while (count > 0) {
            numbers.add(numbers.get(0));
            numbers.remove(0);

            count--;
        }

        return numbers;
    }

    private static List<Integer> shiftRight(List<Integer> numbers, int count) {
        while (count > 0) {
            numbers.add(0,numbers.get(numbers.size()-1));
            numbers.remove(numbers.size()-1);

            count--;
        }

        return numbers;
    }
}
