package ListsEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers05Nope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] arr = scanner.nextLine().split(" ");
        int specialNum = Integer.parseInt(arr[0]);
        int power = Integer.parseInt(arr[1]);


        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == specialNum) {
                numbers.remove(i);
                removeRight(numbers, power, i);
                removeLeft(numbers, power, i);
            }
        }
       // System.out.println(numbers.toString());
        System.out.println(sumList(numbers));


    }

    static List<Integer> removeLeft(List<Integer> numbers, int count, int index) {
        for (int i = index - 1; i >= 0; i--) {

            numbers.remove(i);
            count--;
            if (count <= 0) {
                break;
            }

        }
        return numbers;
    }

    static List<Integer> removeRight(List<Integer> numbers, int count, int index) {
        for (int i = index; i < numbers.size(); i++) {
            numbers.remove(i);
            count--;
            if (count == 0) {
                break;
            }
        }
        return numbers;
    }

    static int sumList(List<Integer> numbers){
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum+=numbers.get(i);
        }
        return sum;
    }


}
