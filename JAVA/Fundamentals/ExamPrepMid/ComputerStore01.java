package ExamPrepMid;

import java.util.Scanner;

public class ComputerStore01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        double totalPrice = 0;

        while(!(line.equals("special")||line.equals("regular"))){
            double price = Double.parseDouble(line);
            if(price<0){
                System.out.println("Invalid price!");
            }else {
                totalPrice += price;
            }



            line= scanner.nextLine();
        }
        double taxes= totalPrice*0.20;
        double finalPriceTaxes = totalPrice+taxes;
        double totalPriceDiscaount =0;

        if(totalPrice==0){
            System.out.println("Invalid order!");

        }else{
            if(line.equals("special")){
            totalPriceDiscaount = finalPriceTaxes*0.90;
            }else{
                totalPriceDiscaount=finalPriceTaxes;
            }


            System.out.printf("Congratulations you've just bought a new computer!%nPrice without taxes: %.2f$%nTaxes: %.2f$%n-----------%nTotal price: %.2f$%n", totalPrice,taxes, totalPriceDiscaount);
        }

    }
}
