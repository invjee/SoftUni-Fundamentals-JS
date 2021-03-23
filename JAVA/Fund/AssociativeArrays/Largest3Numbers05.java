package AssociativeArrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Largest3Numbers05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
             Arrays.stream(numbers)
                .map(Integer::parseInt)
                .sorted((n1, n2)->n2.compareTo(n1))
                .limit(3)
                .forEach(e-> System.out.print(e+" "));
    }
}
