package ArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElOfEqualEl07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // String arrAsString = scanner.nextLine();
       String[] arr = scanner.nextLine().split(" ");

        String max ="";
        for (int i = 0; i < arr.length; i++) {
            String current = arr[i];
            //int max = 0;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j].equals(arr[i])){
                    current += " "+ arr[i];

                }else{
                    break;
                }
            }
            if(max.length()<current.length()){
                max=current;
            }
        }
        System.out.println(max);

    }
}
