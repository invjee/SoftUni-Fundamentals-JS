package ObjectsAndClassesEx;

import java.util.*;

public class AdvertisementMessage01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> phrases = Arrays.asList("Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product.");
        List<String> events = Arrays.asList("Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!");
        List<String> authors = Arrays.asList("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva");
        List<String> cities = Arrays.asList("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse");

        int n = Integer.parseInt(scanner.nextLine());
        Random random =  new Random();
        for (int i = 0; i < n; i++) {
            int randomNumPhrases = random.nextInt(phrases.size());
            int randomNumEvents = random.nextInt(events.size());
            int randomNumAuthors = random.nextInt(authors.size());
            int randomNumCities = random.nextInt(cities.size());
            System.out.printf("%s %s %s - %s%n", phrases.get(randomNumPhrases), events.get(randomNumEvents), authors.get(randomNumAuthors), cities.get(randomNumCities));
        }
    }
}
