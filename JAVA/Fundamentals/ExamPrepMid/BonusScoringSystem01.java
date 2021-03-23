package ExamPrepMid;

import java.util.Scanner;

public class BonusScoringSystem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine())+5;
        int max = 0;
        double maxBonus = 0.0;

            for (int i = 0; i <studentsCount ; i++) {
                double currentMax = Double.parseDouble(scanner.nextLine());

                if(maxBonus<currentMax){
                    maxBonus=max*1.0/lectures*additionalBonus;
                    //max=currentMax;R

                }

        }

        long finalBonus = Math.round(maxBonus);

        System.out.printf("Max Bonus: %d.%n", finalBonus);
        System.out.println("The student has attended "+ max+ " lectures.");

    }
}
