package ExamPrepMid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> warShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxHealth = Integer.parseInt(scanner.nextLine());

        String line = scanner.nextLine();

        while (!line.equals("Retire")) {

            String[] tokens = line.split(" ");
            String command = tokens[0];

            if (command.equals("Fire")) {
                int index = Integer.parseInt(tokens[1]);
                int damage = Integer.parseInt(tokens[2]);
                if (index >= 0 && index < warShip.size()) {
                    int newSectionHealth = warShip.get(index) - damage;
                    warShip.set(index, newSectionHealth);
                    if (newSectionHealth <= 0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        return;
                    }
                }
            } else if (command.equals("Defend")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);
                int damage = Integer.parseInt(tokens[3]);
                if ((startIndex >= 0 && startIndex < pirateShip.size()) && (endIndex >= 0 && endIndex < pirateShip.size())) {
                    for (int i = startIndex; i <= endIndex; i++) {
                        pirateShip.set(i, pirateShip.get(i) - damage);
                        if (pirateShip.get(i) <= 0) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            return;
                        }
                    }
                }

            } else if (command.equals("Repair")) {
                int index = Integer.parseInt(tokens[1]);
                int health = Integer.parseInt(tokens[2]);
                if (index >= 0 && index < pirateShip.size()) {
                    int newHealth = pirateShip.get(index) + health;
                    if (newHealth > maxHealth) {
                        newHealth = maxHealth;
                    }
                    pirateShip.set(index, newHealth);
                }
            } else if (command.equals("Status")) {
                int count = 0;
                double percent20OfCapacity= maxHealth*0.2;
                for (int i = 0; i < pirateShip.size(); i++) {
                    //double percentOfCapacity = pirateShip.get(i) * 1.0 / maxHealth * 100;
                    if (pirateShip.get(i)< percent20OfCapacity ) {
                        count++;

                    }
                }
                System.out.printf("%d sections need repair.%n", count);
            }


            line = scanner.nextLine();
        }


            int sumPirateShip = sumTheShip(pirateShip);
            int sumWarShip = sumTheShip(warShip);
            System.out.println("Pirate ship status: " + sumPirateShip);
            System.out.println("Warship status: " + sumWarShip);

    }

    static int sumTheShip(List<Integer> pirates) {
        int sum = 0;
        for (int i = 0; i < pirates.size(); i++) {
            sum += pirates.get(i);
        }
        return sum;
    }
}
