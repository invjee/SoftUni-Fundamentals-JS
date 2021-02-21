package ArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int sum = 0;
            for (int j = i+1; j < arr.length; j++) {
                sum = current+arr[j];
                if(sum==n){
                    System.out.printf("%d %d%n",current, arr[j]);
                }
            }


        }

    }
}
//1 7 6 2 19 23
//8