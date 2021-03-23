package MethodsEx;

import java.util.Scanner;

public class AddAndSubtract05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int sum = sum(a,b);
        int subtract = subtract(sum,c);
        System.out.println(subtract);
    }
    static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
    static int subtract(int a, int b){
        int subtract = a-b;
        return subtract;
    }
}
