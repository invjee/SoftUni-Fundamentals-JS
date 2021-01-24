package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = 0;
        for(int i = 1; i<=100; i+=2){
            counter++;
            sum += i;
            System.out.println(i);
            if(counter>=n){
                break;
            }

        }
        System.out.println("Sum: "+ sum);

//        for (int i = 1; i <=n ; i++) {
//            int odd = i*2-1;
//            sum +=odd;
//            System.out.println(odd);
//
//        }






    }
}
