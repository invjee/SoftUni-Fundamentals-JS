package DataTypesAndVariablesEx;

import java.util.Scanner;

public class BeerKegs08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String maxKeg = "";
        double maxVolume = 0;
        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = 3.14 *radius*radius * height;
            if (maxVolume < volume) {
                maxVolume=volume;
                maxKeg = model;
            }
        }
        System.out.printf("%s%n",maxKeg);
    }
}
