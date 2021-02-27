package MethodsEx;

import java.util.Scanner;

public class FactorialDivision08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        double resultFactA = factorial(a);
        double resultFactB = factorial(b);
        double division = resultFactA / resultFactB;
        System.out.printf("%.2f", division);
    }

    private static double factorial(double x) {
        double factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial = factorial*i;
        }
        return factorial;
    }
}
