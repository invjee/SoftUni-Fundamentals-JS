package Lists;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativeAndReverse07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbers = removeNegativeNumbers(numbers);
        Collections.reverse(numbers);

        if(numbers.isEmpty()){
            System.out.println("empty");
        }else{
            System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
        }
    }
    static List<Integer> removeNegativeNumbers(List<Integer> numbers){
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)<0){
                numbers.remove(i);
                i--;
            }
        }

        return numbers;
    }
}
