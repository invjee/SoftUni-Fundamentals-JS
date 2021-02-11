package DataTypesAndVariablesEx;

import java.util.Scanner;

public class SpiceMustFlow09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int currentSpice = 0;
        int daysCounter = 0;
        while (startingYield >= 100) {
            daysCounter++;
            currentSpice += startingYield;
            currentSpice-=26;
            startingYield -= 10;
        }

            currentSpice -=26;
        if(currentSpice<0){
            currentSpice =0;
        }

        System.out.println(daysCounter);
        System.out.println(currentSpice);

    }
}
