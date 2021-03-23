package BasicSyntaxConditionalStatementsAndLoopsEx;

import java.util.Scanner;

public class TrinagleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String println = "";

            for(int j = 1; j<=i; j++){
                println += i+" ";

            }
            System.out.println(println);
            
        }
    }
}
