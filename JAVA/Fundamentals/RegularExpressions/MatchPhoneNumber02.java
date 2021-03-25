package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\+359([\\.\\- ])2\\1[0-9]{3}\\1[0-9]{4}\\b");
        Matcher matcher = pattern.matcher(scanner.nextLine());
        List<String> numbers = new ArrayList<>();

        while (matcher.find()){
            numbers.add(matcher.group());
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\]]", ""));
    }
}
