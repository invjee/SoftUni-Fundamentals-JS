package ExamMid;

import java.util.Scanner;

public class some01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceOfFlourPackage = Double.parseDouble(scanner.nextLine());
        double priceOfEgg = Double.parseDouble(scanner.nextLine());
        double priceOfApron = Double.parseDouble(scanner.nextLine());

        //  double priceStudentSet = priceOfFlourPackage+10*priceOfEgg+priceOfApron;
        //  double sum =0;

//        for (int i = 1; i <=students ; i++) {
//            double priceStudentSet =0;
//            if(i%5==0){
//                priceStudentSet = 10*priceOfEgg+1.20*priceOfApron;
//            }else{
//                priceStudentSet = priceOfFlourPackage+10*priceOfEgg+1.20*priceOfApron;
//            }
//            sum+=priceStudentSet;
//        }
        double percentApron = Math.ceil(students * 1.20);
        double studentsApron = percentApron * priceOfApron;
        double studentsEggs = 10.0 * priceOfEgg * students;
        int flourFree = 0;
        if (students >= 5) {
            flourFree = students / 5;
        }
        double studentsFlour = priceOfFlourPackage * 1.0 * (students - flourFree);
        double sumOther = studentsApron + studentsEggs + studentsFlour;
        if (budget >= sumOther) {
            System.out.printf("Items purchased for %.2f$.", sumOther);
            //System.out.println(sumOther);
        } else {
            // System.out.println(sumOther-budget);
            System.out.printf("%.2f$ more needed.", sumOther - budget);
        }
    }
}
