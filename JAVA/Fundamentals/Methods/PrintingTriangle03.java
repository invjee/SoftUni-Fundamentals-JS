package Methods;

import java.util.Scanner;

public class PrintingTriangle03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLength = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= maxLength; i++) {
            printLine(i);
        }

        for (int i = maxLength - 1; i >= 1; i--) {
            printLine(i);
        }

    }

    private static void printLine(int maxNumber) {
        for (int i = 1; i <= maxNumber; i++) {
            System.out.print(i);
            if (i < maxNumber) {
                System.out.print(" ");
            }

        }
        System.out.println();


    }

}

