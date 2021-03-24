package TextProcessing;

import java.util.Scanner;

public class DigitsLettersAndOthers05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder others = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if(Character.isDigit(currentChar)){
                digits.append(currentChar);
            }else if(Character.isLetter(currentChar)) {
                letters.append(currentChar);
            }else{
                others.append(currentChar);
            }
        }
        System.out.println(digits.toString());
        System.out.println(letters.toString());
        System.out.println(others.toString());
    }
}
