package RegularExpressionsEx;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split(", ");

        String line = scanner.nextLine();
        Map<String, Integer> race = new LinkedHashMap<>();
        for (String name : names) {
            race.put(name, 0);
        }
        Pattern pattern = Pattern.compile("[A-Za-z]");
        Pattern pattern1 = Pattern.compile("\\d");
        while (!line.equals("end of race")) {
            StringBuilder name = new StringBuilder();

            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                name.append(matcher.group());
            }

            Matcher matcher1 = pattern1.matcher(line);
            int sum = 0;
            while (matcher1.find()) {
                sum += Integer.parseInt(matcher1.group());
            }
            if (race.containsKey(name.toString())) {
                int newSum = race.get(name.toString())+sum;
                race.put(name.toString(), newSum);
            }
            line = scanner.nextLine();
        }

        List<String> places = new ArrayList<>();
        places.add("1st place: ");
        places.add("2nd place: ");
        places.add("3rd place: ");


        race.entrySet()
                .stream()
                .sorted((a, b) -> {
                    return b.getValue().compareTo(a.getValue());
                })
                .limit(3)
                .forEach(e->{
                    System.out.println(places.remove(0)+e.getKey());
                });



    }
}
