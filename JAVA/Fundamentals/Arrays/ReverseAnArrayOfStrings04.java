package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArrayOfStrings04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String values = scanner.nextLine();
        String[] arr = values.split(" ");

        for (int i = 0; i <arr.length/2 ; i++) {
            String current = arr[i];
            arr[i]= arr[arr.length-i-1];
            arr[arr.length-i-1]= current;
        }
        System.out.println(String.join(" ", arr));


    }
}
