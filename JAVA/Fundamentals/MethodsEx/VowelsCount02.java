package MethodsEx;

import java.util.Scanner;

public class VowelsCount02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String word = scanner.nextLine();
        printCountOfVowels(scanner.nextLine());
    }
    static void printCountOfVowels(String word){
        int count = 0;
        for (int i = 0; i <word.length() ; i++) {
            char code =word.charAt(i);
            if(code=='a'||code=='e'||code=='i'||code=='o'||code=='u'
                ||code=='A'||code=='E'||code=='I'||code=='O'||code=='U'){
                count++;
            }
        }
        System.out.println(count);
    }
}
