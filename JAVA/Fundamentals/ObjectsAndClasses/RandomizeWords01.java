package ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");

        Random random = new Random();
        for (int i = 0; i < words.length; i++) {
            int randomNum = random.nextInt(words.length);
            String temp = words[i];
            words[i] = words[randomNum];
            words[randomNum] = temp;
        }
        for (String word : words) {
            System.out.println(word);
        }
    }
}
