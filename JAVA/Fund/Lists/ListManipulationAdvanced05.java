package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!line.equals("end")) {
            String[] tokens = line.split(" ");
            String command = tokens[0];
            if (command.equals("Contains")) {
                int number = Integer.parseInt(tokens[1]);
                if(numbers.contains(number)){
                    System.out.println("Yes");
                }else{
                    System.out.println("No such number");
                }
            } else if (command.equals("Print")) {
                String word = tokens[1];
                if(word.equals("even")){
                    printEven(numbers);
                }else{
                    printOdd(numbers);
                }


            } else if (command.equals("Get")) {
                int sum = 0;
                for (int i = 0; i < numbers.size(); i++) {
                    sum += numbers.get(i);
                }
                System.out.println(sum);

            } else if (command.equals("Filter")) {
                String condition = tokens[1];
                int number = Integer.parseInt(tokens[2]);
                filter(numbers, condition, number);
                System.out.println();

            }

            line = scanner.nextLine();
        }
    }

    private static void filter(List<Integer> numbers, String condition, int number) {
        if(condition.equals(">")){
            for (int i = 0; i < numbers.size(); i++) {
                if(numbers.get(i)>number){
                    System.out.print(numbers.get(i)+" ");
                }
            }

        }else if(condition.equals("<")){
            for (int i = 0; i < numbers.size(); i++) {
                if(numbers.get(i)<number){
                    System.out.print(numbers.get(i)+" ");
                }
            }

        }else if(condition.equals("<=")){
            for (int i = 0; i < numbers.size(); i++) {
                if(numbers.get(i)<=number){
                    System.out.print(numbers.get(i)+" ");
                }
            }

        }else if(condition.equals(">=")){
            for (int i = 0; i < numbers.size(); i++) {
                if(numbers.get(i)>=number){
                    System.out.print(numbers.get(i)+" ");
                }
            }

        }

    }

    private static void printEven(List<Integer> numbers) {
        for (int i = 0; i <numbers.size() ; i++) {
            if(numbers.get(i)%2==0){
                System.out.print(numbers.get(i)+ " ");
            }
        }
        System.out.println();
    }

    private static void printOdd(List<Integer> numbers) {
        for (int i = 0; i <numbers.size() ; i++) {
            if(numbers.get(i)%2==1){
                System.out.print(numbers.get(i)+ " ");
            }
        }
        System.out.println();
    }

}
