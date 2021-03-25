package RegularExpressionsEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//@(?<planet>[A-Za-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attack>[AD])![^@!:>-]*->(?<soldiersCount>[0-9]+)
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@(?<name>[A-Za-z]+)[^@\\-!:>]*:(\\d+)[^@\\-!:>]*!(?<type>[AD])![^@\\-!:>]*->\\d+";
        Pattern pattern = Pattern.compile(regex);
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String encrypted = scanner.nextLine();
            int countStar = countLetters(encrypted);
            String decryptMessage = decrypting(encrypted, countStar);
           // System.out.println(decryptMessage);
            Matcher matcher = pattern.matcher(decryptMessage);
            if(matcher.find()){
                String name = matcher.group("name");
                String type = matcher.group("type");
                if(type.equals("A")){
                    attackedPlanets.add(name);
                }else{
                    destroyedPlanets.add(name);
                }
            }

        }
        Collections.sort(attackedPlanets);
        Collections.sort(destroyedPlanets);
        System.out.println("Attacked planets: "+ attackedPlanets.size());
        for (String attackedPlanet : attackedPlanets) {
            System.out.println("-> "+ attackedPlanet);
        }
        System.out.println("Destroyed planets: "+ destroyedPlanets.size());
        for (String destroyedPlanet : destroyedPlanets) {
            System.out.println("-> "+ destroyedPlanet);
        }
    }

    static int countLetters(String text) {
        String regex = "[SsTtAaRr]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    static String decrypting(String text, int count) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i <text.length() ; i++) {
            char currentChar = (char) (text.charAt(i)-count);
            build.append(currentChar);
        }
        return build.toString();

    }

}
