package ExamPrepFin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex ="([@#])([A-Za-z]{3,})\\1\\1([A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> mirrorWords = new ArrayList<>();

        int pairsCounter =0;

        while (matcher.find()){
            pairsCounter++;
            String firstWord = matcher.group(2);
            String secondWordReversed = reverseWord(matcher.group(3));
            if(firstWord.equals(secondWordReversed)){
                StringBuilder sb = new StringBuilder(firstWord);
                sb.append(" <=> "+matcher.group(3));
mirrorWords.add(sb.toString());
            }
        }


        if(pairsCounter==0){
            System.out.println("No word pairs found!");

        }else {
            System.out.println(pairsCounter + " word pairs found!");
        }
        if(mirrorWords.isEmpty()){
            System.out.println("No mirror words!");
        }else{
            System.out.println("The mirror words are:");
            // System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
            System.out.println(mirrorWords.toString().replaceAll("[\\[\\]]",""));
//            String words = String.join(", ", mirrorWords);
//            System.out.println(words);
        }

    }

    private static String reverseWord(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = word.length()-1; i >=0 ; i--) {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}
