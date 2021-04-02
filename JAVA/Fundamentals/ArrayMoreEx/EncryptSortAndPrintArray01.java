package ArrayMoreEx;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            String name = scanner.nextLine();
            int sum = 0;

            for (int j = 0; j < name.length(); j++) {
                char code = name.charAt(j);
                int result = 0;
                if(code=='a'||code=='i'||code=='e'||code=='u'||code=='o'||code=='A'||code=='E'||code=='I'||code=='U'||code=='O'){
                    result=code*name.length();
                }else{
                    result=code/name.length();
                }
                sum+=result;
            }
            arr[i]=sum;

        }
        Arrays.sort(arr);
        for(int sorted:arr){
            System.out.println(sorted);
        }

    }
}
