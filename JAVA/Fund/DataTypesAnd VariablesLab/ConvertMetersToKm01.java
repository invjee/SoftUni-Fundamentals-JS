package DataTypesAndVariables;

import java.util.Scanner;

public class ConvertMetersToKm01{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters = Double.parseDouble(scanner.nextLine());
        double km = meters*0.001;
        System.out.printf("%.2f", km);
    }
}
