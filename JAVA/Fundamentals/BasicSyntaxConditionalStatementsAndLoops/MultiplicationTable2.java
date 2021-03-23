package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int multiplayer = Integer.parseInt(scanner.nextLine());
        if(multiplayer>10){
            System.out.println(n+" X "+multiplayer +" = " +multiplayer*n);
        }else{
            for (int i = multiplayer; i <=10 ; i++) {
                int product = i*n;
                System.out.println(n+" X "+i +" = " +product);
            }
        }


    }
}
