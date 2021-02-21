package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                sumEven+=arr[i];
            }else{
                sumOdd+= arr[i];
            }
        }
        System.out.println(sumEven-sumOdd);
    }
}
