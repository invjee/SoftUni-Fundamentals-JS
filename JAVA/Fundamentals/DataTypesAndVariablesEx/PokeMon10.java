package DataTypesAndVariablesEx;

import java.util.Scanner;

public class PokeMon10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        double nHalf = n/2.0;
        int counterTarget = 0;
        while (m  <= n) {
            n -= m;
            if(n==nHalf){
                if(y!=0){
                    n/=y;
                }
            }



            counterTarget++;

        }
        System.out.println(n);
        System.out.println(counterTarget);

    }
}
