package ExamPrepMid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> sequence = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String line = scanner.nextLine();
        int moves = 0;

        while(!line.equals("end")){
            if(sequence.isEmpty()){
                System.out.printf("You have won in %d turns!%n", moves);
                return;
            }
            moves++;

            String[] tokens = line.split("\\s+");
            int one = Integer.parseInt(tokens[0]);
            int two = Integer.parseInt(tokens[1]);
            if((one==two)||one<0||one>=sequence.size()||two<0||two>=sequence.size()){
                System.out.println("Invalid input! Adding additional elements to the board");
                String toAdd = "-"+moves+"a";
                sequence.add(sequence.size()/2, toAdd);
                sequence.add(sequence.size()/2,toAdd);
                line = scanner.nextLine();
                continue;
            }

            if(sequence.get(one).equals(sequence.get(two))){
                System.out.println("Congrats! You have found matching elements - "+ sequence.get(one)+"!");
                if(two>one){
                    sequence.remove(two);
                    sequence.remove(one);
                }else{
                    sequence.remove(one);
                    sequence.remove(two);
                }


            }else{
                System.out.println("Try again!");
            }


            line=scanner.nextLine();
        }
        if(sequence.isEmpty()){
            System.out.println("You have won in "+moves+" turns!");
        }else {

            System.out.println("Sorry you lose :(");
            System.out.println(sequence.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
