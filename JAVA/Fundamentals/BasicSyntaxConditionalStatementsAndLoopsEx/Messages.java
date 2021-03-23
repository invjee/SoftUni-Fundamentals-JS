package BasicSyntaxConditionalStatementsAndLoopsEx;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNumbers = Integer.parseInt(scanner.nextLine());

        StringBuilder builder = new StringBuilder();


        for (int i = 0; i < countNumbers; i++) {
            String num = scanner.nextLine();
            int howLong = num.length();
            char lastSymbol = num.charAt(num.length()-1);
            int digit = Integer.parseInt(String.valueOf(lastSymbol));
            String abc = "abcdefghijklmnopqrstuvwxyz";
            if(digit!=0){
                int offset =  (digit - 2)*3+howLong-1;

                if(digit==8||digit==9){
                    offset +=1;
                }

                char symbol=abc.charAt(offset);
                builder.append(symbol);
            }else{
                String symbol = " ";
                builder.append(symbol);
            }

        }
        String word = builder.toString();
        System.out.println(word);


       // System.out.println(abc.charAt(offset));







    }
}
