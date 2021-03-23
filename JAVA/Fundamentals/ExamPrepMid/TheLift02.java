package ExamPrepMid;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int maxPeople = 4;

        int[] lift = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean peopleAreOnTheLIft = false;

        for (int i = 0; i < lift.length; i++) {
            if(people==0){
                System.out.println("The lift has empty spots!");
                printLift(lift);
                peopleAreOnTheLIft=true;
                break;
            }else{

                if(people<=4){



                    int freeSpaces = 4-lift[i];
                    if(people<freeSpaces){
                        int oldValue = lift[i];
                        lift[i]= people+oldValue;
                        people-=4-oldValue;
                        if(lift[i]<4) {
                            System.out.println("The lift has empty spots!");
                            printLift(lift);
                            peopleAreOnTheLIft = true;
                            break;
                        }else if(lift[i]==4&&i== lift.length-1){
                            printLift(lift);
                            break;
                        }
                    }else if(people==freeSpaces){
                        int oldValue = lift[i];
                        lift[i]= people+oldValue;
                        people -=freeSpaces;
                        if(i==lift.length-1){
                            printLift(lift);
                            break;
                        }


                    }else if(people>freeSpaces) {
                        lift[i]=4;
                        people -= freeSpaces;

                  //      lift[i] =0
                    }


                }else {

                    people -=4-lift[i];
                    lift[i] = 4;
                }
            }
        }

        if(people>0){
            System.out.println("There isn't enough space! " +people +" people in a queue!");
           printLift(lift);
        }


    }
    static void printLift(int[] lift){
        for (int i = 0; i < lift.length; i++) {
            System.out.print(lift[i]+" ");

        }
        System.out.println();
    }
}
