package TextProcessingEx;

import java.util.Scanner;

public class LettersChangeNumbers08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");

        double sum = 0.0;


        for (String word : words) {
            double currentResult = 0.0;
            char firstLetter = word.charAt(0);
            char lastLetter = word.charAt(word.length() - 1);
            int number = Integer.parseInt(word.substring(1, word.length() - 1));

            if (Character.toUpperCase(firstLetter) == firstLetter) {
                int letterPosition = firstLetter - 64;
                currentResult = number*1.0 / letterPosition;
               // System.out.println(currentResult);
            } else {
                currentResult = number*1.0 * (firstLetter - 96);
            }
            if (Character.toUpperCase(lastLetter) == lastLetter) {
                currentResult -= (lastLetter - 64);
            } else {
                currentResult += (lastLetter - 96);
            }

            sum += currentResult;
        }
        System.out.println(String.format("%.2f", sum));
    }

}
