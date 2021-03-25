package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\b(?<Day>\\d{2})([\\-\\.\\/])(?<Month>[A-Z][a-z]{2})\\2(?<Year>\\d{4})\\b");
        Matcher matcher = pattern.matcher(scanner.nextLine());

        while (matcher.find()){
            System.out.println("Day: "+ matcher.group("Day")+", Month: "+ matcher.group("Month")+ ", Year: "+ matcher.group("Year"));
        }

          }
}
