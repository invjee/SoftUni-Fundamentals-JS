package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        System.out.println(new DecimalFormat("0.####").format(mathPower(number,power)));
    }
    static double mathPower(double n, int pow){
        double nPow =1;
        for (int i = 0; i < pow; i++) {
            nPow*=n;
        }
        return  nPow;
    }
}
