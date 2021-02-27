package MethodsEx;

import java.util.Scanner;

public class SmallestOfThreeNum01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b  = Integer.parseInt(scanner.nextLine());
        int c =Integer.parseInt(scanner.nextLine());
        smallestNum(a,b,c);

    }

    static void smallestNum(int a, int b, int c) {
        if (a <= b && a <= c) {
            System.out.println(a);
        }else if(b<=a&&b<=c){
            System.out.println(b);
        }else if(c<=a&&c<=b){
            System.out.println(c);
        }
    }
}
