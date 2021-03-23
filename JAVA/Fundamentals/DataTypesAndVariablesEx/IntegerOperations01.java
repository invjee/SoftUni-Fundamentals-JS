package DataTypesAndVariablesEx;

import java.util.Scanner;

public class IntegerOperations01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Add first to the second, divide (integer) the sum by the third number and multiply the result by the fourth number. Print the result.
int a = Integer.parseInt(scanner.nextLine());
int b = Integer.parseInt(scanner.nextLine());
int c = Integer.parseInt(scanner.nextLine());
int d = Integer.parseInt(scanner.nextLine());
int sum = (a+b)/c*d;
        System.out.println(sum);
    }
}
