package TextProcessingEx;

import java.util.Scanner;

public class ReplaceRepeatingChars06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();;
        StringBuilder build = new StringBuilder();
        build.append(text.charAt(0));
        for (int i = 1; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if(currentChar!=text.charAt(i-1)){
                build.append(currentChar);
            }
        }
        System.out.println(build.toString());
    }
}
