package MethodsEx;

import java.util.Scanner;

public class CharactersInRange03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char one =scanner.nextLine().charAt(0);
        char two = scanner.nextLine().charAt(0);
        printBtwChars(one, two);
    }
    static void printBtwChars(char x, char y){
        if(x<=y){
            for (int i = x+1; i < y; i++) {
                char current = (char)i;
                System.out.print(current+" ");

            }
        }else{
            for (int i = y+1; i < x; i++) {
                char current = (char)i;
                System.out.print(current+" ");

            }
        }

    }
}
