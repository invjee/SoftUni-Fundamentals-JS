package MethodsEx;

import java.util.Scanner;

public class TopNumber10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=n; i++) {
            if(topInt(i)){
                System.out.println(i);
            }

        }
    }

    static boolean topInt(int n) {
        if(sumOfDigits(n)&&oneOddDigit(n)){
            return true;
        }else{
            return false;
        }


    }
    static boolean sumOfDigits(int n){
        int sumOfDig= 0;
        while(n>0){
            int currentDig= n%10;
            sumOfDig+=currentDig;
            n/=10;
        }
        if(sumOfDig%8==0){
            return true;

        }else{
            return false;
        }

    }
    static  boolean oneOddDigit(int n){
        while(n>0){
            int currentDig = n%10;
            if(currentDig%2==1){
                return true;

            }
            n/=10;
        }
        return false;

    }
}
