package DataTypesAndVariables;

import java.util.Scanner;

public class PoundToDollars02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double pounds = Double.parseDouble(scanner.nextLine());
        double poundsRate = 1.31;
        double dollars = poundsRate*pounds;
        System.out.printf("%.3f", dollars);
    }
}
