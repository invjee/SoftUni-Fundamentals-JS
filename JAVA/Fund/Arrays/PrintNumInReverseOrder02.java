package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintNumInReverseOrder02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] num = new int[n];
        for (int i = 0; i <n ; i++) {
            num[i]= Integer.parseInt(scanner.nextLine());
        }
      //  int[] reversed = new int[n];
        for (int i = n-1; i >=0 ; i--) {
            System.out.printf("%d ",num[i]);
        }
    }
}
