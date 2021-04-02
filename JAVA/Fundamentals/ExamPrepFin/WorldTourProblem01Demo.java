package ExamPrepFin;

import java.util.Scanner;

public class WorldTourProblem01Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scanner.nextLine());

        String line = scanner.nextLine();
        while (!line.equals("Travel")) {
            String[] tokens = line.split(":");
            if (tokens[0].equals("Add Stop")) {
                int index = Integer.parseInt(tokens[1]);
                int buildIndex = input.length();
                if (index >= 0 && index < buildIndex) {
                    input.insert(Integer.parseInt(tokens[1]), tokens[2]);
                }
                System.out.println(input);

            } else if (tokens[0].equals("Remove Stop")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);
                if(startIndex>=0&&startIndex<input.length()&&endIndex>=0&&endIndex<input.length()){
input.delete(startIndex, endIndex+1);
                }
                System.out.println(input);


            } else if (tokens[0].equals("Switch")) {
input= new StringBuilder(input.toString().replace(tokens[1], tokens[2]));
                System.out.println(input);
            }


            line = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: "+input);
    }
}
