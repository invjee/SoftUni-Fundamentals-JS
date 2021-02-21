package ArraysEx;

import java.util.Scanner;

public class CommonElements02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr1 = scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");
        StringBuilder builder = new StringBuilder();
       // String[] arr3 = new String[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            String current = arr2[i];
            for (int j = 0; j < arr1.length; j++) {
                if(current.equals(arr1[j])){
                    builder.append(current+" ");

                }

            }
        }
        String commonWords = builder.toString();
        System.out.println(commonWords);
       // System.out.println(String.join(" ", arr3));
    }
}
