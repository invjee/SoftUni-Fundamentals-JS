package DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < n; i++) {
            //double current = Double.parseDouble(scanner.nextLine());
            BigDecimal current = new BigDecimal(scanner.nextLine());
            sum = sum.add(current);
        }
        System.out.println(sum);
    }
}
