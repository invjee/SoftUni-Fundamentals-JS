package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays
        .stream(scanner.nextLine().split(" "))
        .mapToInt(e->Integer.parseInt(e))
                .toArray();
        int[] arr1 =Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();
        int sumArr =0;
        boolean isIdentical = true;

        for (int i = 0; i <arr.length ; i++) {
            sumArr+=arr[i];
            if(arr[i]!=arr1[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.%n", i);
                isIdentical = false;
                break;
            }

        }
        if(isIdentical){
            System.out.printf("Arrays are identical. Sum: %d", sumArr);
        }
    }
}
