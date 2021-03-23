package ExamPrepMid;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        double avarrageSum = sum*1.0/numbers.size();

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)<=avarrageSum){
                numbers.remove(i);
                i--;
            }
        }
        if(numbers.isEmpty()){
            System.out.println("No");
        }else{
            Collections.sort(numbers);
            Collections.reverse(numbers);
            //   System.out.println(numbers.toString());
            int counter =0;
            for (int i = 0; i <numbers.size() ; i++) {
                counter++;
                System.out.print(numbers.get(i)+" ");
                if(counter==5){
                    break;
                }
            }
        }


    }
}
