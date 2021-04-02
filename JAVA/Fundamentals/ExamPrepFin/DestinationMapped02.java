package ExamPrepFin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapped02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "([\\/=])([A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher  matcher = pattern.matcher(text);
        List<String> destinations = new ArrayList<>();
        int sumPoints= 0;

        while (matcher.find()){
            destinations.add(matcher.group(2));
           sumPoints+= matcher.group(2).length();
        }
        System.out.println("Destinations: "+ destinations.toString().replaceAll("[\\[\\]]", ""));
        System.out.println("Travel Points: "+ sumPoints);

    }

}
