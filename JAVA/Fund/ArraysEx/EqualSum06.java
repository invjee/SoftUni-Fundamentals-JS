package ArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSum06 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int[] arr = Arrays.stream(scanner.nextLine().split(" "))
            .mapToInt(e->Integer.parseInt(e))
            .toArray();
    int index = 0;
    boolean isNumber = false;

        for (int i = 0; i <arr.length ; i++) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int j = 0; j <i ; j++) {
            sumLeft += arr[j];
        }
        for (int j = i+1; j < arr.length; j++) {
            sumRight+=arr[j];
        }
        if(sumLeft==sumRight){
            isNumber = true;
            index = i;
        }
    }
        if(isNumber){
        System.out.println(index);
    }else{
        System.out.println("no");
    }

}

}
