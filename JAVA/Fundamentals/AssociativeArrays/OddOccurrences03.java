package AssociativeArrays;

import java.util.*;

public class OddOccurrences03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        Map<String, Integer> words = new LinkedHashMap<>();

        for (int i = 0; i <line.length ; i++) {
            String currentWord = line[i];
            currentWord=currentWord.toLowerCase();
            if(!words.containsKey(currentWord)){
                words.put(currentWord, 0);
            }
            words.put(currentWord, words.get(currentWord)+1);
        }
       List<String> oddWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if(entry.getValue()%2==1) {
                oddWords.add(entry.getKey());
            }
        }
        System.out.println(oddWords.toString().replaceAll("[\\[\\]]", ""));


    }
}
