package TextProcessingEx;

import java.util.Scanner;

public class StringExplosion07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text =scanner.nextLine();
        StringBuilder build = new StringBuilder();
        int power = 0;

        for (int i = 0; i <text.length() ; i++) {
            char currentChar = text.charAt(i);
            if(currentChar=='>'){
                power += Integer.parseInt(String.valueOf(text.charAt(i+1)));
                build.append(">");
            }else if(power==0){
                build.append(currentChar);
            }else{
                power--;
            }
        }
        System.out.println(build.toString());


    }
}
