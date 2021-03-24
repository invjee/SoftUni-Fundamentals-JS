package TextProcessing;

import java.util.Scanner;

public class RepeatStrings02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split("\\s+");
StringBuilder word = new StringBuilder();
        for (int i = 0; i < line.length; i++) {
            String currentWord= line[i];
            word.append(repeat(currentWord));
        }
        System.out.println(word.toString());
    }

    private static String repeat(String currentWord) {
        String repeatedWord = "";
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < currentWord.length(); i++) {
            build.append(currentWord);
        }

        return build.toString();
    }
}
