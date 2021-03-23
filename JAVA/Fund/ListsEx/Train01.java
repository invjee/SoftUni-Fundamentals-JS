package ListsEx;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input= scanner.nextLine().split(" ");
        List<Integer> train = Arrays.stream(input)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String line = scanner.nextLine();

        while(!line.equals("end")){
            String[] tokens = line.split(" ");
            if(tokens[0].equals("Add")){
                int number = Integer.parseInt(tokens[1]);
                train.add(number);
            }else{
                int number= Integer.parseInt(tokens[0]);
                for (int i = 0; i < train.size(); i++) {
                    int sum = train.get(i)+number;
                    if(sum<=maxCapacity){
                        train.set(i,sum);
                        break;
                    }
                }
            }

            line=scanner.nextLine();
        }
        System.out.println(train.toString().replaceAll("[\\[\\],]", ""));
    }
}
