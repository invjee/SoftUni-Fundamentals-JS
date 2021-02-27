package Methods;

import java.util.Scanner;

public class Grades02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gradeN = Double.parseDouble(scanner.nextLine());
        grade(gradeN);

    }
    static void grade(double n){
        if(n>=2&&n<=2.99){
            System.out.println("Fail");
        }else if(n<=3.49){
            System.out.println("Poor");
        }else if( n <= 4.49){
            System.out.println("Good");
        }else if(n <=5.49){
            System.out.println("Very good");
        }else if(n<=6){
            System.out.println("Excellent");
        }
    }
}
