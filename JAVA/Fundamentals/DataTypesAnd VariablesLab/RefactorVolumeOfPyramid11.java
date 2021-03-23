package DataTypesAndVariables;

import java.util.Scanner;

public class RefactorVolumeOfPyramid11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // double dul, sh, V = 0;
        System.out.print("Length: ");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        double h = Double.parseDouble(scanner.nextLine());
       double  v = (length * width * h) / 3;
        System.out.printf("Pyramid Volume: %.2f", v);


    }
}
