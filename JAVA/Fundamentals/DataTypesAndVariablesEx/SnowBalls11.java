package DataTypesAndVariablesEx;

import java.util.Scanner;

public class SnowBalls11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double maxValue = Double.MIN_VALUE;
        int maxTime = Integer.MIN_VALUE;
        int maxSnow = Integer.MIN_VALUE;
        int maxQuality = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());
            double ballValue = Math.pow((snow/time),quality);
            //System.out.println(ballValue);
            if(maxValue<ballValue){
                maxValue=ballValue;
                maxTime =time;
                maxSnow = snow;
                maxQuality = quality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", maxSnow, maxTime, maxValue, maxQuality);

    }
}
