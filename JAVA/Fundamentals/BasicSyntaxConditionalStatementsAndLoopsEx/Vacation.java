package BasicSyntaxConditionalStatementsAndLoopsEx;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        switch(day){
            case "Friday":
                if(type.equals("Students")){
                    price = 8.45;
                }else if(type.equals("Business")){
                    price = 10.90;
                }else if(type.equals("Regular")){
                    price = 15;
                }
                break;
            case "Saturday":
                if(type.equals("Students")){
                    price = 9.80;
                }else if(type.equals("Business")){
                    price = 15.60;
                }else if(type.equals("Regular")){
                    price = 20;
                }
                break;
            case "Sunday":
                if(type.equals("Students")){
                    price = 10.46;
                }else if(type.equals("Business")){
                    price = 16;
                }else if(type.equals("Regular")){
                    price = 22.50;
                }
                break;
        }
        double totalPrice = price*people;
        if(type.equals("Students")&& people>=30){
            totalPrice *= 0.85;
        }
        if(type.equals("Business") && people>=100){
            people -=10;
            totalPrice = people*price;
        }
        if(type.equals("Regular")&& people>=10&& people<=20){
            totalPrice *= 0.95;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
/*   	Friday	Saturday	Sunday
Students	8.45	9.80	10.46
Business	10.90	15.60	16
Regular  	15	    20     	22.50
*/
