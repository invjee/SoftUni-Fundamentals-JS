package BasicSyntaxConditionalStatementsAndLoopsEx;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String nStr = String.valueOf(n);

        int sumFactorial = 0;
        for (int i = 0; i < nStr.length(); i++) {
            int currentDigit = Integer.parseInt(String.valueOf(nStr.charAt(i)));
            int nFactorial = 1;
            for(int j = 1; j<=currentDigit; j++){
                nFactorial *= j;
            }
            sumFactorial +=nFactorial;
        }
        if(sumFactorial==n){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }


        //System.out.println(sumFactorial);
    }
}
