package ArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {

            int[] currentArr = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(e->Integer.parseInt(e))
                    .toArray();
            if(i%2==0){
                arr1[i]=currentArr[0];
                arr2[i]= currentArr[1];
            }else{
                arr1[i]=currentArr[1];
                arr2[i]= currentArr[0];
            }

        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("%d ", arr1[i]);
        }
        System.out.printf("%n");
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("%d ", arr2[i]);
        }
    }
}
