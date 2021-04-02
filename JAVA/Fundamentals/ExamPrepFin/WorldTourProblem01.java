package ExamPrepFin;

import java.util.Scanner;

public class WorldTourProblem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stops = scanner.nextLine();

        String line = scanner.nextLine();
        while (!line.equals("Travel")) {
            String[] tokens = line.split(":");
            String command = tokens[0];
            if (command.equals("Add Stop")) {
                int index = Integer.parseInt(tokens[1]);
                String string = tokens[2];
                if (checkIfValid(stops, index)) {
                    stops = insertString(stops, index, string);
                }
                System.out.println(stops);


            } else if (command.equals("Remove Stop")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);
                if (checkIfValid(stops, startIndex) && checkIfValid(stops, endIndex)) {
                    stops = removeStp(stops, startIndex, endIndex);
                }
                System.out.println(stops);
            } else if (command.equals("Switch")) {
                String oldString = tokens[1];
                String newString = tokens[2];
                if (stops.contains(oldString)) {
                    stops = stops.replace(oldString, newString);

                }
                System.out.println(stops);


            }

            line = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + stops);
    }

    private static String removeStp(String stops, int startIndex, int endIndex) {
        StringBuilder build = new StringBuilder(stops);
        build.delete(startIndex, endIndex + 1);


        return build.toString();
    }

    private static String insertString(String stops, int index, String string) {
        StringBuilder build = new StringBuilder(stops);
        build.insert(index, string);

        return build.toString();
    }


    private static boolean checkIfValid(String stops, int index) {
        if (index >= 0 && index < stops.length()) {
            return true;
        }
        return false;
    }

}
