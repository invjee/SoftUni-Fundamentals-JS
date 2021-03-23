package Methods;

import java.util.Scanner;

public class RepeatString07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int repeating = Integer.parseInt(scanner.nextLine());
       String newStr =repeated(a,repeating);
        System.out.println(newStr);
    }
    static String repeated(String str, int n){
        String newOne="";
        for (int i = 0; i < n; i++) {
            newOne+=str;
        }
        return newOne;
    }
}
