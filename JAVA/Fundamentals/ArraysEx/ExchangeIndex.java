package ArraysEx;

import java.util.Scanner;

public class ExchangeIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int index = Integer.parseInt(scanner.nextLine());
        int[] arr = {1,2,3,4,5};
        int[] newArr = new int[arr.length];
        for (int i = index+1; i < arr.length ; i++) {
            newArr[i-(index+1)]=arr[i];

        }
        for (int i = 0; i <= index; i++) {

                    newArr[(arr.length+i)-(index+1)] = arr[i];
        }
        for(int i = 0; i<newArr.length; i++){
            System.out.print(newArr[i]+" ");
        }
        //System.out.println(newArr.length);
    }
}
