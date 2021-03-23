package ExamPrepMid;

import java.util.Scanner;

public class SoftuniReception01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstEmployeeAnswersPerHour = Integer.parseInt(scanner.nextLine());
        int secondEmployeeAnswersPerHour = Integer.parseInt(scanner.nextLine());
        int thirdEmployeeAnswersPerHour = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int allAnswersPerHour =firstEmployeeAnswersPerHour+secondEmployeeAnswersPerHour+thirdEmployeeAnswersPerHour;
        //double hoursNeeded = (double) studentsCount/allAnswersPerHour;
        //if(hoursNeeded>)
       // System.out.println(Math.ceil(hoursNeeded));
        int hoursCounter = 0;
        while(studentsCount>0){

//            if(studentsCount<0){
//                break;
//            }
            hoursCounter++;
            studentsCount-=allAnswersPerHour;

            if(hoursCounter%4==0){
                hoursCounter++;
               // continue;
            }

        }
        System.out.printf("Time needed: %dh.", hoursCounter);
    }
}
