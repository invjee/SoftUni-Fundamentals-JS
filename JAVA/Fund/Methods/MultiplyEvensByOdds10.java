package Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(multiplyOddAndEvenSum(number));
    }
    static int multiplyOddAndEvenSum(int number) {

        int evenSum = sumOfEvenDigits(number);
        int oddSum = suOfOddDigits(number);
        return evenSum*oddSum;
    }

    private static int suOfOddDigits(int num) {
        int sum= 0;
        num = Math.abs(num);
        while(num>0){
            int digit = num%10;
            if(digit%2==1){
                sum+=digit;
            }
            num/=10;
        }

        return sum;
    }

    private static int sumOfEvenDigits(int num) {
        int sum= 0;
        num = Math.abs(num);
        while(num>0){
            int digit = num%10;
            if(digit%2==0){
                sum+=digit;
            }
            num/=10;
        }

        return sum;
    }
}
