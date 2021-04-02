package ExamPrepFin;

import java.util.Scanner;

public class ActivationKey01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder rawKey = new StringBuilder(scanner.nextLine());
        String line = scanner.nextLine();

        while (!line.equals("Generate")) {
            String[] tokens = line.split(">>>");

            String command = tokens[0];

            if (command.equals("Contains")) {
                String substring = tokens[1];
                if (rawKey.indexOf(substring) != -1) {
                    System.out.println(rawKey + " contains " + substring);
                } else {
                    System.out.println("Substring not found!");
                }

            } else if (command.equals("Flip")) {
                String upperOrLower = tokens[1];
                int startIndex = Integer.parseInt(tokens[2]);
                int endIndex = Integer.parseInt(tokens[3]);
                for (int i = startIndex; i < endIndex; i++) {
                    char currentChar = rawKey.charAt(i);
                    if (upperOrLower.equals("Upper")) {
                        rawKey.setCharAt(i, Character.toUpperCase(currentChar));
                    } else {
                        rawKey.setCharAt(i, Character.toLowerCase(currentChar));
                    }
                }
                System.out.println(rawKey.toString());

            } else if (command.equals("Slice")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);
                rawKey.delete(startIndex, endIndex);
                System.out.println(rawKey.toString());
            }

            line = scanner.nextLine();
        }
        System.out.println("Your activation key is: "+ rawKey.toString());
    }
}
