package RegularExpressionsEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String regex = "%(?<name>[A-Z][a-z]+)%([^\\|\\$\\%\\.]+)?\\<(?<product>\\w+)\\>([^\\|\\$\\%\\.]+)?\\|(?<count>\\d+)\\|([^\\|\\$\\%\\.\\d]+)?(?<price>\\d+(\\.\\d+)?)\\$";
        Pattern pattern = Pattern.compile(regex);
        Map<String[], Integer[]> order = new LinkedHashMap<>();

        double income = 0.0;

        while (!line.equals("end of shift")){
            Matcher matcher = pattern.matcher(line);
            if(matcher.find()){
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double totalPrice = count*1.0*price;
                System.out.println(String.format("%s: %s - %.2f", name, product, totalPrice));
                income+= totalPrice;
            }
            line=scanner.nextLine();
        }
        System.out.println(String.format("Total income: %.2f", income));
    }
}
