package BasicSyntaxConditionalStatementsAndLoopsEx;

import java.util.Scanner;

public class ReverseString02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringBuilder wordReversed = new StringBuilder();
        for(int i = word.length()-1; i>=0; i--){
            char letter = word.charAt(i);
            wordReversed.append(letter);
        }
        String newWord = wordReversed.toString();
        System.out.println(newWord);
    }
}
