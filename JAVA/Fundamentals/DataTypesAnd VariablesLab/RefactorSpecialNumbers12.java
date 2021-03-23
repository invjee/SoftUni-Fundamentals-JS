package DataTypesAndVariables;

import java.util.Scanner;

public class RefactorSpecialNumbers12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        //

        for (int i = 1; i <= n; i++) {
            boolean toe = false;
            int sum = 0;
            int number = i;
           // number = i;
            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }
            toe = (sum == 5) || (sum == 7) || (sum == 11);
            if(toe){
                System.out.printf("%d -> True%n", i);
            }else{
                System.out.printf("%d -> False%n", i);
            }
            ;
            //sum = 0;
           // i = number;
        }

    }
}
