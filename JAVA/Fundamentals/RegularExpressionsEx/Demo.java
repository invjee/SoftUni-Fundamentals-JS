package RegularExpressionsEx;


    import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
public class Demo {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List<String> data = Arrays.stream(scanner.nextLine().split("\\s*,+\\s*")).collect(Collectors.toList());
            Collections.sort(data);
            for (String information : data) {
                int health = findingHealth(information);
                double damage = calculatindDamage(information);
                System.out.printf("%s - %d health, %.2f damage%n",information,health,damage);
            }

        }

        private static double calculatindDamage(String information) {
            double sumOfDamage = 0.0;
            //"[+-]?\\d+\\.?\\d*"
          //  [-]?[0-9][.]?\\d?
            String regexDamage = "[+-]?[0-9]+[.]?\\d*";
            Pattern patternDamage = Pattern.compile(regexDamage);
            Matcher matcherDamage = patternDamage.matcher(information);
            while(matcherDamage.find()){
                sumOfDamage+=Double.parseDouble(matcherDamage.group());
            }
            sumOfDamage = checkingLastTwoDigits(information,sumOfDamage);
            return sumOfDamage;
        }

        private static double checkingLastTwoDigits(String information, double damage) {
            String regex = "[*\\/]";
            Pattern patternSymbol = Pattern.compile(regex);
            Matcher matcherSymbol = patternSymbol.matcher(information);
            while(matcherSymbol.find()){
                if(matcherSymbol.group().equals("*")){
                    damage*=2;
                }else{
                    damage/=2;
                }
            }
            return damage;
        }

        private static int findingHealth(String information) {
            int sumOfHealth = 0;
            StringBuilder healthName = new StringBuilder();
            //[^\\d\\/+\\-\\*\\.]
            String regexName = "[^\\d\\/+\\-\\*\\.]";
            Pattern patternName = Pattern.compile(regexName);
            Matcher matcherName = patternName.matcher(information);
            while (matcherName.find()) {
                healthName.append(matcherName.group());
            }
            String healthPower = healthName.toString();
            for (int i = 0; i < healthPower.length(); i++) {
                char ch = healthName.charAt(i);
                if((ch<=41 || ch>=58 || ch == 44)){
                    sumOfHealth += (int) healthPower.charAt(i);
                }
            }
            return sumOfHealth;
        }


    }

