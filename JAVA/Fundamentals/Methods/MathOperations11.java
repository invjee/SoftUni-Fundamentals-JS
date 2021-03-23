package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());
        double result = calculate(a,operator,b);
        System.out.println(new DecimalFormat("0.##").format(result));
    }
    private static double calculate(int a,String operator, int b){
        double sum = 0.0;
        switch(operator){
            case "*": sum = a*b;break;
            case "-": sum = a-b; break;
            case "/": sum = (double) a/b;break;
            case "+": sum = a+b; break;
        }
        return sum;
    }
}
