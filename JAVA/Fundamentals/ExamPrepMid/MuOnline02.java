package ExamPrepMid;

import java.util.Scanner;

public class MuOnline02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rooms = scanner.nextLine().split("\\|");

        int health = 100;
        int bitcoins = 0;
        boolean youDidIt= true;

        for (int i = 0; i <rooms.length ; i++) {
            String[]current = rooms[i].split(" ");
            String command = current[0];
            int num = Integer.parseInt(current[1]);

            if(command.equals("potion")){
                int healingPoints = 100-health;
                health+=num;
                if(health>=100){

                    health=100;
                }else{
                    healingPoints=num;
                }
                System.out.printf("You healed for %d hp.%n", healingPoints);
                System.out.printf("Current health: %d hp.%n", health);

            }else if(command.equals("chest")){
                bitcoins+=num;
                System.out.printf("You found %d bitcoins.%n", num);

            }else{
                health-=num;
                if(health>0){
                    System.out.printf("You slayed %s.%n", command);
                }else{
                    System.out.printf("You died! Killed by %s.%n", command);
                    System.out.println("Best room: "+(i+1));
                    youDidIt=false;
                    break;
                }

            }

        }
        if(youDidIt){
            System.out.printf("You've made it!%nBitcoins: %d%nHealth: %d%n", bitcoins, health);
        }



    }
}
