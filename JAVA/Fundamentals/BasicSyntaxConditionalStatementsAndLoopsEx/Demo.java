package BasicSyntaxConditionalStatementsAndLoopsEx;

import java.util.Scanner;


import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int medium = 0;

        if (n1 > max) {
            max = n1;
        }
        if (n2 > n1) {
            max = n2;
        }
        if (n3 > n2) {
            max = n3;
        }
        if (n1 < min) {
            min = n1;
        }
        if (n2 < n1) {
            min = n2;
        }
        if (n3 < n2) {
            min = n3;
        }
        if (n1 != max && n1 != min){
            medium = n1;
        }
        if (n2 != max && n2 != min){
            medium = n2;
        }
        if (n3 !=max && n3 != min){
            medium = n3;
        }
        System.out.println(max);
        System.out.println(medium);
        System.out.println(min);

    }
}