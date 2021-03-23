package BasicSyntaxConditionalStatementsAndLoopsEx;

import java.util.Scanner;

public class GamingStore02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentBallanse = Double.parseDouble(scanner.nextLine());;
        String line = scanner.nextLine();
        double price = 0;
        double totalSpend =0;
        while (!line.equals("Game Time")) {
            if(line.equals("OutFall 4")||line.equals("CS: OG")||line.equals("Zplinter Zell")||line.equals("Honored 2")||line.equals("RoverWatch")||line.equals("RoverWatch Origins Edition")){
                if (line.equals("OutFall 4")) {
                    price = 39.99;
                    currentBallanse -=price;
                } else if (line.equals("CS: OG")) {
                    price = 15.99;
                    currentBallanse -=price;
                } else if (line.equals("Zplinter Zell")) {
                    price = 19.99;
                    currentBallanse -=price;
                } else if (line.equals("Honored 2")) {
                    price = 59.99;
                    currentBallanse -=price;
                } else if (line.equals("RoverWatch")) {
                    price = 29.99;
                    currentBallanse -=price;
                } else if (line.equals("RoverWatch Origins Edition")) {
                    price = 39.99;
                    currentBallanse -=price;
                }



                if(currentBallanse<0) {
                    System.out.println("Too Expensive");
                    currentBallanse += price;
                }else{
                    System.out.printf("Bought %s%n", line);
                    totalSpend+=price;
                }
                if(currentBallanse==0){
                    System.out.println("Out of money!");
                    return;
                }

            }else{
                System.out.println("Not Found");
            }


            line = scanner.nextLine();
        }
        if(currentBallanse>0){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f",totalSpend ,currentBallanse);
        }


    }
}
/*OutFall 4	$39.99
CS: OG	$15.99
Zplinter Zell	$19.99
Honored 2	$59.99
RoverWatch	$29.99
RoverWatch Origins Edition	$39.99

*/