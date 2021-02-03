package BasicSyntaxConditionalStatementsAndLoopsEx;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        //String password = "";
        StringBuilder passwordBuilder = new StringBuilder();
        for (int i = user.length()-1; i >=0; i--) {
            char currentSymbol = user.charAt(i);
            passwordBuilder.append(currentSymbol);
        }
        String password = passwordBuilder.toString();
        String passTry = scanner.nextLine();
        int counter = 0;
        while(!passTry.equals(password)){
            System.out.println("Incorrect password. Try again.");
            counter++;
            if(counter>3){
                System.out.printf("User %s blocked!", user);
                break;
            }
            passTry = scanner.nextLine();
        }
        if(passTry.equals(password)){
            System.out.printf("User %s logged in.", user);
        }


    }
}
//Incorrect password. Try again.
