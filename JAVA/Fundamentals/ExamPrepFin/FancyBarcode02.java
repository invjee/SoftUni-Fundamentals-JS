package ExamPrepFin;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcode02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@#+(?<product>[A-Z][A-Za-z\\d]{4,}[A-Z])@#+";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < n; i++) {
            String current = scanner.nextLine();
            Matcher matcher = pattern.matcher(current);

            boolean isDigits = false;
            if (matcher.find()) {
                String product = matcher.group("product");
                String group = groupFind(product);
                System.out.println("Product group: "+ group);
            }else{
                System.out.println("Invalid barcode");
            }
        }
    }
    static String groupFind(String product){
        boolean noDigits = true;
        StringBuilder build = new StringBuilder();
        for (int j = 0; j < product.length(); j++) {
            char currentChar = product.charAt(j);
            if (Character.isDigit(currentChar)) {
                build.append(currentChar);
                noDigits=false;
            }
        }
        if(noDigits==true){
            return "00";
        }
        return  build.toString();
    }
}
