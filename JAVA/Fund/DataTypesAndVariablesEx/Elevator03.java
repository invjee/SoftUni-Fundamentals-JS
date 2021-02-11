package DataTypesAndVariablesEx;

import java.util.Scanner;

public class Elevator03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());
        int lastCourse = n%p;
        int finalCourse = 0;
        if(lastCourse!=0){
            n -=lastCourse;
            finalCourse = n/p+1;
        }else{
            finalCourse = n/p;
        }
        System.out.println(finalCourse);
    }
}
