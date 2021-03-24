package TextProcessingEx;

import java.util.Scanner;

public class ValidUsernames01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usernames = scanner.nextLine().split(", ");
        for (String username : usernames) {
            if(checkContain(username)&&checkLength(username)){
                System.out.println(username);
            }
        }

    }
    static boolean checkLength(String word){

        if(word.length()>=3&&word.length()<=16){
            return true;
        }
        return false;
    }
    static boolean checkContain(String word){
        boolean isLetter = true;
        for (int i = 0; i <word.length() ; i++) {
            char currentChar = word.charAt(i);
            if(Character.isLetter(currentChar)||currentChar==45||currentChar==95||Character.isDigit(currentChar)){
                isLetter=true;
            }else{
                isLetter=false;
                break;
            }
        }
        return isLetter;
    }
}
