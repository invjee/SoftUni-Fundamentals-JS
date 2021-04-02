package ExamPrepFin;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "(#|\\|)(?<name>[A-Za-z ]+)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d{1,5})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int caloriesSum = 0;
        List<String> products = new ArrayList<>();
        while (matcher.find()) {
            int cal = Integer.parseInt(matcher.group("calories"));
            if (cal >= 0 && cal <= 10000) {
                String output = String.format("Item: " + matcher.group("name") + ", Best before: " + matcher.group("date") + ", Nutrition: " + matcher.group("calories"));
                products.add(output);
                caloriesSum +=cal;
            }
        }
        int daysWithFood = caloriesSum/2000;
        System.out.println("You have food to last you for: "+ daysWithFood+" days!");
        for (String product : products) {
            System.out.println(product);
        }
    }
}
