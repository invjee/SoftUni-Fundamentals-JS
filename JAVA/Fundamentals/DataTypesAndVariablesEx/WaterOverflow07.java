package DataTypesAndVariablesEx;

import java.util.Scanner;

public class WaterOverflow07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int waterTankVolume = 255;
        for (int i = 0; i < n; i++) {
            int litters = Integer.parseInt(scanner.nextLine());
            if(waterTankVolume<litters){
                System.out.println("Insufficient capacity!");
            }else{
                waterTankVolume -=litters;
            }

        }
        System.out.println(255-waterTankVolume);
    }
}
