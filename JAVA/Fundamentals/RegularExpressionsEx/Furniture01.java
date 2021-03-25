package RegularExpressionsEx;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile(">>(?<name>[A-Za-z]+)<<(?<price>[\\d]+\\.?\\d+)!(?<quantity>\\d+)");

List<String> list = new ArrayList<>();
double sum = 0.0;
       // Map<String, double[]> furniture = new LinkedHashMap<>();
        while (!line.equals("Purchase")) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                String groupName = matcher.group("name");
                sum += Double.parseDouble(matcher.group("price"))*Double.parseDouble(matcher.group("quantity"));
               list.add(groupName);
//                furniture.put(groupName, new double[2]);
//                furniture.get(groupName)[0] = Double.parseDouble(matcher.group("price"));
//                furniture.get(groupName)[1] = Double.parseDouble(matcher.group("quantity"));
            }


            line = scanner.nextLine();
        }
       // System.out.println(sum);
        System.out.println("Bought furniture: ");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(String.format("Total money spend: %.2f", sum));
    }
}
