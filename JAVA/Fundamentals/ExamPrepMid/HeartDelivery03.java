package ExamPrepMid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("@"))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());

        String line = scanner.nextLine();
        int currentIndex = 0;

        while (!line.equals("Love!")) {
            int numberJump = Integer.parseInt(line.split(" ")[1]);

            currentIndex += numberJump;
            if (currentIndex >= numbers.size()) {
                currentIndex = 0;
            }
            if (numbers.get(currentIndex) == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", currentIndex);

            } else {
                int currentValue = numbers.get(currentIndex) - 2;
                numbers.set(currentIndex, currentValue);
                if (currentValue == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", currentIndex);
                }
            }


            line = scanner.nextLine();
        }

        System.out.printf("Cupid's last position was %d.%n", currentIndex);
        int houseCountFailed = 0;
        boolean isSuccessful = true;
        for (Integer number : numbers) {
            if (number > 0) {
                isSuccessful = false;
                houseCountFailed++;
            }
        }
        if(isSuccessful){
            System.out.println("Mission was successful.");
        }else{
            System.out.printf("Cupid has failed %d places.", houseCountFailed);
        }

    }
}
