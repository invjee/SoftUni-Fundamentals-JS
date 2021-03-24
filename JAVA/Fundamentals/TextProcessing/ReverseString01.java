package TextProcessing;

import java.util.Scanner;

public class ReverseString01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while(!line.equals("end")) {
            String reversedString = reverse(line);
            System.out.println(line +" = "+ reversedString);
            line=scanner.nextLine();
        }
    }
    static String reverseString(String str){

        if(str.isEmpty()){
            return str;
        }

          return reverseString(str.substring(1))+str.charAt(0);


    }
    static String reverse(String str){
        String reversed ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+= str.charAt(i);
        }
        return  reversed;
    }

}
