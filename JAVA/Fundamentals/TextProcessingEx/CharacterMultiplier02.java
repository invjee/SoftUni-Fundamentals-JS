package TextProcessingEx;

import java.util.Scanner;

public class CharacterMultiplier02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tokens = scanner.nextLine();
        String first = tokens.split(" ")[0];
        String second = tokens.split(" ")[1];

        int sum = 0;

        if (first.length() < second.length()) {

            for (int i = 0; i < first.length(); i++) {
                sum += first.charAt(i) * second.charAt(i);
            }
            for (int i = first.length(); i < second.length(); i++) {
                sum += second.charAt(i);
            }

        } else if (second.length() < first.length()) {
            for (int i = 0; i < second.length(); i++) {
                sum += first.charAt(i) * second.charAt(i);
            }
            for (int i = second.length(); i < first.length(); i++) {
                sum += first.charAt(i);
            }
        } else {
            for (int i = 0; i < second.length(); i++) {
                sum += first.charAt(i) * second.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
