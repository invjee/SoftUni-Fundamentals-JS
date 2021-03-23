package MethodsEx;

import java.util.Scanner;

public class PalindromIntegers09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (!line.equals("END")) {
           // int number = Integer.parseInt(line);
            System.out.println(isPalindrom(line));

            line = scanner.nextLine();
        }
    }

    static boolean isPalindrom(String number) {
        boolean isPalindrom = true;
        for (int i = 0; i < number.length()/2; i++) {
            if(number.charAt(i)!=number.charAt(number.length()-1-i)){
                isPalindrom = false;
                break;
            }
        }
return isPalindrom;
    }


}
