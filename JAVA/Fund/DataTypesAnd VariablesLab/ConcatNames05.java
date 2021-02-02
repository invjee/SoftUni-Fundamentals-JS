package DataTypesAndVariables;

import java.util.Scanner;

public class ConcatNames05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String delimeter = scanner.nextLine();
        System.out.println(name1+delimeter+name2);
    }
}
