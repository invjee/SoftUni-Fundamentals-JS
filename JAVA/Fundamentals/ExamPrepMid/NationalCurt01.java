package ExamPrepMid;

import java.util.Scanner;

public class NationalCurt01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int thurd = Integer.parseInt(scanner.nextLine());

        int questions = Integer.parseInt(scanner.nextLine());

        int sumOfAnswers = first+second+thurd;

        int counter=0;

        while(questions>0){
            counter++;
            questions-=sumOfAnswers;

            if(counter%4==0){
                counter++;
                //continue;
            }

        }
        System.out.println("Time needed: "+ counter+"h.");
    }
}
