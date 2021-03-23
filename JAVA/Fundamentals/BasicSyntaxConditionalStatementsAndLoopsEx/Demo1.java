import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cash = Double.parseDouble(scanner.nextLine());
        double moneyInBeginning = cash;

        String input = scanner.nextLine();
        boolean outOfmoney = false;

        while (!input.equals("Game Time")) {
            String gameName = input;
            if (gameName.equals("OutFall 4")) {
                cash -= 39.99;
                if (cash < 0) {
                    cash += 39.99;
                    System.out.println("Too Expensive");

                } else {
                    System.out.printf("Bought %s%n", input);
                }
            } else if (gameName.equals("CS: OG")) {
                cash -= 15.99;
                if (cash < 0) {
                    cash += 15.99;
                    System.out.println("Too Expensive");

                } else {
                    System.out.printf("Bought %s%n", input);
                }
            } else if (gameName.equals("Zplinter Zell")) {
                cash -= 19.99;
                if (cash < 0) {
                    cash += 19.99;
                    System.out.println("Too Expensive");

                } else {
                    System.out.printf("Bought %s%n", input);
                }
            } else if (gameName.equals("Honored 2")) {
                cash -= 59.99;
                if (cash < 0) {
                    cash += 59.99;
                    System.out.println("Too Expensive");

                } else {
                    System.out.printf("Bought %s%n", input);
                }
            } else if (gameName.equals("RoverWatch")) {
                cash -= 29.99;
                if (cash < 0) {
                    cash += 29.99;
                    System.out.println("Too Expensive");

                } else {
                    System.out.printf("Bought %s%n", input);
                }
            } else if (gameName.equals("RoverWatch Origins Edition")) {
                cash -= 39.99;
                if (cash < 0) {
                    cash += 39.99;
                    System.out.println("Too Expensive");

                } else {
                    System.out.printf("Bought %s%n", input);
                }
            } else {
                System.out.println("Not Found");

            }
            if (cash == 0) {
                outOfmoney = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (outOfmoney) {
            System.out.println("Out of money!");
        } else {
            System.out.printf("Total spent: $%.2f. ", moneyInBeginning - cash);
            System.out.printf("Remaining: $%.2f", cash);
        }
    }
}