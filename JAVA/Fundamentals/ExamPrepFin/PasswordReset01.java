package ExamPrepFin;

import java.util.Scanner;

public class PasswordReset01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String passText = scanner.nextLine();
        String line = scanner.nextLine();
        while (!line.equals("Done")) {
            String[] tokens = line.split("\\s+");
            if (tokens[0].equals("TakeOdd")) {
                passText = takeOdd(passText);
                System.out.println(passText);
            } else if (tokens[0].equals("Cut")) {
                int index = Integer.parseInt(tokens[1]);
                int length = Integer.parseInt(tokens[2]);
                passText = cut(passText, index, length);


            } else if (tokens[0].equals("Substitute")) {
                String substring = tokens[1];
                String substitute = tokens[2];
                if(passText.contains(substring)){
                    passText= passText.replace(substring, substitute);
                    System.out.println(passText);
                }else{
                    System.out.println("Nothing to replace!");
                }
            }
            line = scanner.nextLine();
        }
        System.out.println("Your password is: "+ passText);
    }

    static String cut(String pass, int index, int length) {
        String substring = pass.substring(index, index + length);
        StringBuilder newPass = new StringBuilder(pass);
        newPass.delete(index, index + length);
      //  System.out.println(substring);
        System.out.println(newPass.toString());
        return newPass.toString();

    }

    private static String takeOdd(String passText) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < passText.length(); i += 2) {
            builder.append(passText.charAt(i));
        }
        return builder.toString();
    }
}
