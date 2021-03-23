package ArraysEx;

import java.util.Scanner;

public class Train01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] train = new int[n];
        int sumTrain = 0;
        for (int i = 0; i < n; i++) {
            int currentWagoon = Integer.parseInt(scanner.nextLine());
            train[i] = currentWagoon;
            sumTrain +=currentWagoon;
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", train[i]);
        }
        System.out.printf("%n%d",sumTrain);


    }
}
