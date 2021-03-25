package RegularExpressionsEx;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s*,\\s*");



        Map<String, double[]> demonsBook = new TreeMap<>();

        for (int i = 0; i < input.length; i++) {
            String currentDemon = input[i];
            int health = health(currentDemon);
            double damage = damage(currentDemon);
            for (int j = 0; j <currentDemon.length() ; j++) {
                char current = currentDemon.charAt(j);
                if(current=='*'){
                    damage*=2;
                }else if(current=='/'&& damage!=0){
                    damage/=2;
                }
            }
            demonsBook.put(currentDemon, new double[2]);
            demonsBook.get(currentDemon)[0]= health;
            demonsBook.get(currentDemon)[1]= damage;


        }
        for (Map.Entry<String, double[]> stringEntry : demonsBook.entrySet()) {

            System.out.printf("%s - %.0f health, %.2f damage%n",stringEntry.getKey(), stringEntry.getValue()[0], stringEntry.getValue()[1]);
        }
        //•	"{demon name} - {health points} health, {damage points} damage"
    }

    private static double damage(String currentDemon) {
        String regexDamage = "[+-]?\\d+\\.?\\d*";
        Pattern pattern1 = Pattern.compile(regexDamage);
        double sum = 0.0;
        Matcher matcher = pattern1.matcher(currentDemon);
        while (matcher.find()){
            double current = Double.parseDouble(matcher.group());
            sum += current;
        }
        return  sum;
    }


    private static int health(String currentDemon) {
        String regexHealth = "[^\\d\\/+\\-\\*\\.]";
        Pattern pattern = Pattern.compile(regexHealth);
        int sum = 0;

            Matcher matcher = pattern.matcher(currentDemon);
            while(matcher.find()) {
                char current = matcher.group().charAt(0);
                sum += current;
            }
        return sum;
    }
}
