package TextProcessing;

import java.util.Scanner;

public class Substring03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToRemove = scanner.nextLine();
        String sequence = scanner.nextLine();
        String word = "";

        while(sequence.contains(wordToRemove)){
            sequence = removeWord(wordToRemove, sequence);

        }
        System.out.println(sequence);
    }
    static String removeWord(String word, String sequence){
        String newWord = "";
        int firstIndex= sequence.indexOf(word);
        int lastIndex = firstIndex+word.length();
        newWord= sequence.substring(0,firstIndex)+ sequence.substring(lastIndex);

        return newWord;
    }
}
