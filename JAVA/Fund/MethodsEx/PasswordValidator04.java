package MethodsEx;

import java.util.Scanner;

public class PasswordValidator04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if(passLength(password)==true&&passLettersAndDig(password)==true&&passTwoDigits(password)==true){
            System.out.println("Password is valid");
        }
        if(passLength(password)==false){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if(passLettersAndDig(password)==false){
            System.out.println("Password must consist only of letters and digits");
        }
        if(passTwoDigits(password)==false){
            System.out.println("Password must have at least 2 digits");
        }

    }

    static boolean passLength(String pass) {
        if (pass.length() >= 6 && pass.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }
    static boolean passLettersAndDig(String pass){

        for (int i = 0; i <pass.length() ; i++) {
            char current = pass.charAt(i);
            boolean isSmallLetter =current>=97&&current<=122;
            boolean isUpperLetter =current>=65&&current<=90;
            boolean isDigit =current>=48&&current<=57;
            if(!isUpperLetter&&!isSmallLetter&&!isDigit){
                return false;
            }
        }
        return  true;
    }
    static boolean passTwoDigits(String pass){
        //boolean isValid = false;
        int digitCounter =0;
        for (int i = 0; i < pass.length(); i++) {
            char current = pass.charAt(i);
            if(current>=48&&current<=57){
                digitCounter++;
            }
        }
        if(digitCounter>=2){
            return true;
        }else{
            return false;
        }
    }
}
