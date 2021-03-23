package ListsEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int i = 0;
        while (!(firstPlayer.isEmpty() || secondPlayer.isEmpty())) {
            int player1card = firstPlayer.get(0);
            int player2card = secondPlayer.get(0);
            if (player1card > player2card) {
                firstPlayer.add(player1card);
                firstPlayer.add(player2card);
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            } else if (player2card > player1card) {
                secondPlayer.add(player2card);
                secondPlayer.add(player1card);
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            } else {
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            }

        }


        int sum = 0;
        if (!firstPlayer.isEmpty()) {
            for (Integer card : firstPlayer) {
                sum += card;
            }
            System.out.println("First player wins! Sum: " + sum);
        } else {
            for (Integer card : secondPlayer) {
                sum += card;
            }
            System.out.println("Second player wins! Sum: " + sum);
           // System.out.println(firstPlayer.toString());
            //System.out.println(secondPlayer.toString());
        }
    }
}