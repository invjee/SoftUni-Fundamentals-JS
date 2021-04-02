package TextProcessingMoreEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPersonInfo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            Pattern patternName = Pattern.compile("@(?<name>[A-Za-z]+)\\|");
            Pattern patternAge = Pattern.compile("#(?<age>\\d+)\\*");

            Matcher matcherName = patternName.matcher(line);
            Matcher matcherAge = patternAge.matcher(line);
            String name = "";
                    String age = "";
            while (matcherName.find()){
                name= matcherName.group("name");
            }
            while (matcherAge.find()){
                age= matcherAge.group("age");
            }
            System.out.println(name +" is "+age+" years old.");
        }
    }
}
