package ExamPrepFin;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "(::|\\*\\*)(?<emoji>[A-Z][a-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        long threshold = 1;
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (Character.isDigit(current)) {
                long currentLong = Long.parseLong(String.valueOf(current));
                threshold *= currentLong;
            }
        }
        int emojisCount = 0;
        Map<String, Integer> emojis = new LinkedHashMap();
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            emojisCount++;
            int currentEmojiCoolness = findCoolness(matcher.group("emoji"));

            emojis.put(matcher.group(), currentEmojiCoolness);

        }
        System.out.println("Cool threshold: " + threshold);
        System.out.println(emojis.size() + " emojis found in the text. The cool ones are:");
        if (emojis.size() > 0) {
            for (Map.Entry<String, Integer> entry : emojis.entrySet()) {
                if(entry.getValue()>threshold){
                    System.out.println(entry.getKey());
                }
            }
        }

    }

    static int findCoolness(String emoji) {
        int sum = 0;
        for (int i = 0; i < emoji.length(); i++) {
            char current = emoji.charAt(i);
            sum += current;
        }
        return sum;
    }


}
