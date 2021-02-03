package BasicSyntaxConditionalStatementsAndLoopsEx;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        double sumCoins = 0;
        while (!command.equals("Start")) {
            double currentCoin = Double.parseDouble(command);
            if (currentCoin == 2 || currentCoin == 1 || currentCoin == 0.5 || currentCoin == 0.2 || currentCoin == 0.1) {
                sumCoins += currentCoin;
            } else {
                System.out.printf("Cannot accept %.2f%n", currentCoin);

            }
            command = scanner.nextLine();
        }
        command = scanner.nextLine();
        double price = 0;
        while (!command.equals("End")) {

            if (command.equals("Nuts")) {
                price = 2.0;
                if (sumCoins >= price) {
                    sumCoins -= price;
                    System.out.println("Purchased " + command);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (command.equals("Water")) {
                price = 0.7;
                if (sumCoins >= price) {
                    sumCoins -= price;
                    System.out.println("Purchased " + command);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (command.equals("Crisps")) {
                price = 1.5;
                if (sumCoins >= price) {
                    sumCoins -= price;
                    System.out.println("Purchased " + command);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (command.equals("Soda")) {
                price = 0.8;
                if (sumCoins >= price) {
                    sumCoins -= price;
                    System.out.println("Purchased " + command);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (command.equals("Coke")) {
                price = 1.0;
                if (sumCoins >= price) {
                    sumCoins -= price;
                    System.out.println("Purchased " + command);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else {
                System.out.println("Invalid product");
            }

            command = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sumCoins);
    }
}
//0.1, 0.2, 0.5, 1, and 2
//"Nuts", "Water", "Crisps", "Soda", "Coke"
//2.0,    0.7,     1.5,      0.8,     1.0
