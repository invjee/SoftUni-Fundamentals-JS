package Methods;

import java.util.Scanner;

public class greaterOfTwoValues09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String variable = scanner.nextLine();
        if(variable.equalsIgnoreCase("int")){
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(a,b));
        }else if(variable.equalsIgnoreCase("char")){
            char a = scanner.nextLine().charAt(0);
            char b = scanner.nextLine().charAt(0);
            System.out.println(getMax(a,b));
        }else if(variable.equalsIgnoreCase("string")){
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            System.out.println(getMax(a,b));
        }


    }

    static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }


    }

    static char getMax(char a, char b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static String getMax(String first, String second) {
        if (first.compareTo(second)>=0) {
            return first;
        }else{
            return second;
        }
    }
}
