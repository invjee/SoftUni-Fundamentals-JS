package ExamPrepMid;

import java.util.Scanner;

public class BlackFlag01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOfPlunder = Integer.parseInt(scanner.nextLine());
        double dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Integer.parseInt(scanner.nextLine());

        double plunderSum = 0;

        for (int i = 1; i <= daysOfPlunder; i++) {

            if(i%3==0){
                plunderSum += 0.5*dailyPlunder;
            }
            plunderSum+=dailyPlunder;
            if(i%5==0){
                plunderSum = 0.70*plunderSum;
            }
        }

        if(plunderSum>=expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.", plunderSum);
        }else{
            double precentPlunder = plunderSum/expectedPlunder*100;
            System.out.printf("Collected only %.2f%% of the plunder.", precentPlunder);
        }
    }
}
