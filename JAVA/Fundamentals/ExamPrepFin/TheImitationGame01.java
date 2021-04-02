package ExamPrepFin;

import javax.management.MBeanRegistration;
import java.util.Scanner;

public class TheImitationGame01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder message = new StringBuilder(scanner.nextLine());
        String line = scanner.nextLine();
        while (!line.equals("Decode")) {
            String[] command = line.split("\\|");
            switch (command[0]) {
                case "Move":
                    int n = Integer.parseInt(command[1]);
                    String substring = message.substring(0, n);
                    message.delete(0, n);
                    message.append(substring);
                   // System.out.println(message);
                    break;
                case "Insert":
                    int index = Integer.parseInt(command[1]);
                    String value = command[2];
                    message.insert(index, value);
                   // System.out.println(message);
                    break;
                case "ChangeAll":
                    String substringToChange = command[1];
                    String newText = command[2];
                    if(message.toString().contains(substringToChange)) {
                       message=new StringBuilder( message.toString().replace(substringToChange, newText));
                    }
                   // System.out.println(message);


                    break;
            }

            line = scanner.nextLine();
        }
        System.out.println("The decrypted message is: "+message);
    }
}
