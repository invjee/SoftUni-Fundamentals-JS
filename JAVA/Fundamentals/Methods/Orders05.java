package Methods;

import java.util.Scanner;

public class Orders05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        price(quantity,product);
//•	coffee – 1.50
//•	water – 1.00
//•	coke – 1.40
//•	snacks – 2.00

    }
    static void price(int n, String product){
        double sum = 0;
        if(product.equalsIgnoreCase("coffee")){
           sum = n*1.50;
        }else if(product.equalsIgnoreCase("water")){
            sum=n*1.00;
        }else if(product.equalsIgnoreCase("coke")){
            sum=n*1.40;
        }else if(product.equalsIgnoreCase("snacks")){
            sum=n*2.00;
        }
        System.out.printf("%.2f",sum);

    }
}
