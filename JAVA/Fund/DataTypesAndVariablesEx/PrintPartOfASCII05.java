package DataTypesAndVariablesEx;

import java.util.Scanner;

public class PrintPartOfASCII05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        for (int i = a; i <= b; i++) {
            char currentChar = (char) i;
            System.out.printf("%c ", currentChar);
        }
    }
}
