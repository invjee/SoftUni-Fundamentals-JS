package ArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            boolean isTop = true;
            int current = arr[i];
            //int max = current;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] >= current) {
                        isTop = false;
                        break;
                }
            }
            if(isTop){
                builder.append(current+" ");
            }
        }
        String newArr = builder.toString();
        System.out.println(newArr);
    }
}
