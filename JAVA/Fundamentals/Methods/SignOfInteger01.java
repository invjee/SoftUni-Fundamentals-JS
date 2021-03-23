package Methods;

import java.util.Scanner;

public class SignOfInteger01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        signOfInteger(Integer.parseInt(scanner.nextLine()));


    }
    static void signOfInteger(int n ){
        if(n>0){
            System.out.printf("The number %d is positive.", n);
        }else if(n<0){
            System.out.printf("The number %d is negative.", n);
        }else{
            System.out.printf("The number %d is zero.", n);
        }
    }
}