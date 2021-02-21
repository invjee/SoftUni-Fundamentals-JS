package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNum07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int n = arr.length;
        int sum = arr[0];
        while (n != 1) {
            int currentSum = 0;

            int[] newArr = new int[n-1];
            for (int i = 0; i < newArr.length; i++) {
                if (i != arr.length - 1) {
                    newArr[i] = arr[i] + arr[i + 1];
                    currentSum = arr[i] + arr[i + 1];
                } else {
                    break;
                }

            }
            arr = newArr;
            sum = currentSum;
            n -= 1;
        }
        System.out.println(sum);
    }
}
