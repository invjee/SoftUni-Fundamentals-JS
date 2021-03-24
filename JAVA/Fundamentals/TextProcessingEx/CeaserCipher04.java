package TextProcessingEx;

import java.util.Scanner;

public class CeaserCipher04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        StringBuilder build = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            build.append((char)(text.charAt(i)+3));
        }
        System.out.println(build.toString());
    }
}
