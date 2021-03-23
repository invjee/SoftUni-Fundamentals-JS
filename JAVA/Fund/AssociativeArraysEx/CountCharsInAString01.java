package AssociativeArraysEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<Character, Integer> lettersCount = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if(currentSymbol==' '){
                continue;
            }
            if(!lettersCount.containsKey(currentSymbol)){
                lettersCount.put(currentSymbol, 0);
            }
            lettersCount.put(currentSymbol, lettersCount.get(currentSymbol)+1);
        }
        for (Map.Entry<Character, Integer> entry : lettersCount.entrySet()) {
            System.out.println(entry.getKey()+ " -> "+ entry.getValue());
        }

    }
}
