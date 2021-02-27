package MethodsEx;

import java.util.Scanner;

public class MiddleCharacters06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(middleChar(word));;
    }
    static String middleChar(String word){
        StringBuilder middleIChars = new StringBuilder();
        if(word.length()%2==0){
           int firstIndex =word.length()/2-1;
            int secondIndex = word.length()/2;
            middleIChars.append(word.charAt(firstIndex));
            middleIChars.append(word.charAt(secondIndex));

        }else{
            int index = word.length()/2;
            middleIChars.append(word.charAt(index));
        }
      String middleChars = middleIChars.toString();
        return middleChars ;
    }


}
