package BasicSyntaxConditionalStatementsAndLoopsEx;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        String println = "";
        for (int i = first; i <= second; i++) {
            println += i + " ";
           //System.out.println(i);
            sum += i;

        }
        System.out.println(println);
        System.out.printf("Sum: %d", sum);
    }
}
