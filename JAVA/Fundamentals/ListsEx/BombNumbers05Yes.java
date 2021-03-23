package ListsEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers05Yes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] arr = scanner.nextLine().split(" ");
        int specialNum = Integer.parseInt(arr[0]);
        int power = Integer.parseInt(arr[1]);
        int powerAll = power*2+1;

        while(numbers.contains(specialNum)){
            int bombIndex = numbers.indexOf(specialNum);
            int leftBound = Math.max(0,bombIndex-power);
            int rightBound = Math.min(numbers.size()-1, bombIndex+power);

            for (int i = rightBound; i >= leftBound; i--) {
                numbers.remove(i);

            }
        }
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println(sum);

        //System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
