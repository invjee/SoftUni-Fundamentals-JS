package TextProcessing;

import java.util.Scanner;

public class TextFilter04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (int i = 0;i<words.length; i++ ) {
            String forbiddenWord = words[i];

            if(text.contains(forbiddenWord)){
                String wordOfStars = starTheWord(forbiddenWord);
                text= text.replace(forbiddenWord, wordOfStars);
            }
        }
        System.out.println(text);
    }
    static String starTheWord(String word){
        String newWord="";
        for (int i = 0; i < word.length(); i++) {
            newWord+="*";
        }
        return newWord;

    }
}
