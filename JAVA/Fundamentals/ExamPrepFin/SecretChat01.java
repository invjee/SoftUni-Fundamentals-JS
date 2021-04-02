package ExamPrepFin;

import java.util.Scanner;

public class SecretChat01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String line = scanner.nextLine();
        while (!line.equals("Reveal")){
            String[] tokens=line.split(":\\|:");
            String command = tokens[0];
            switch (command){
                case "InsertSpace":
                    int index = Integer.parseInt(tokens[1]);
                    StringBuilder newMess = new StringBuilder(message);
                    newMess.insert(index, ' ');
                    message=newMess.toString();
                    System.out.println(message);
                    break;
                case  "Reverse":
                    String substring = tokens[1];
                    message= reverse(message, substring);

                    break;
                case  "ChangeAll":
                    String substringChange = tokens[1];
                    String replacement = tokens[2];
                    message= message.replace(substringChange, replacement);
                    System.out.println(message);
                    break;
            }

            line=scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s%n", message);


    }

    private static String reverse(String message, String substring) {
        StringBuilder sb = new StringBuilder(message);
        if(message.contains(substring)){
            int index = message.indexOf(substring);
            sb.delete(index, index+substring.length());
            String reversed = reverseString(substring);
            sb.append(reversed);
            System.out.println(sb.toString());

        }else{
            System.out.println("error");
        }
        return sb.toString();
    }

    private static String reverseString(String substring) {
        StringBuilder sb = new StringBuilder();
        for (int i = substring.length()-1; i >=0 ; i--) {
            sb.append(substring.charAt(i));
        }
        return sb.toString();
    }
}
