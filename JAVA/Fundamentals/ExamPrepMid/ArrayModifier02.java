package ExamPrepMid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Long> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Long::parseLong)
                .collect(Collectors.toList());

        String line = scanner.nextLine();

        while(!line.equals("end")){
            String[] tokens = line.split(" ");
            String command = tokens[0];
            if(command.equals("swap")){
                int index1 = Integer.parseInt(tokens[1]);
                int index2 = Integer.parseInt(tokens[2]);
                long el = numbers.get(index1);
                long el2 = numbers.get(index2);
                numbers.set(index1, el2);
                numbers.set(index2, el);

            }else if(command.equals("multiply")){
                int index1 = Integer.parseInt(tokens[1]);
                int index2 = Integer.parseInt(tokens[2]);
                long el = numbers.get(index1);
                long el2 = numbers.get(index2);
                long multiply = el*el2;
                numbers.set(index1,multiply);


            }else if(command.equals("decrease")){
                for (int i = 0; i <numbers.size() ; i++) {

                    numbers.set(i, numbers.get(i)-1);
                }

            }
            line=scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\]]", ""));

    }
}
