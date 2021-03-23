package ExamPrepMid;

import java.util.Scanner;


public class CounterStrike01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energy = Integer.parseInt(scanner.nextLine());

        boolean isComplied = true;
        int counterWins = 0;
        String line = scanner.nextLine();

        while (!line.equals("End of battle")) {

            int distance = Integer.parseInt(line);

            if(energy>=distance){
                energy -= distance;
                counterWins++;
                if (counterWins % 3 == 0 && counterWins != 0) {
                    energy += counterWins;
                }
            }else{
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n", counterWins, energy);
                isComplied = false;
                break;
            }

            line = scanner.nextLine();
        }
        if (isComplied) {

            System.out.printf("Won battles: %d. Energy left: %d", counterWins, energy);
        }
    }
}
