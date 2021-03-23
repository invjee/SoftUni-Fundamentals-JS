package AssociativeArrays;

import java.util.*;

public class WordSynonyms02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> synonymDictionary = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            if (!synonymDictionary.containsKey(word)) {

                synonymDictionary.put(word, new ArrayList<>());
            }
            synonymDictionary.get(word).add(synonym);
        }

        for (Map.Entry<String, List<String>> entry : synonymDictionary.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }

    }

}
