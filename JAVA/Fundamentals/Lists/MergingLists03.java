package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

       // List<Integer> newList = new ArrayList<>();

        int min = Math.min(firstList.size(), secondList.size());
            for (int i = 0; i < min; i++) {

                System.out.print(firstList.get(i)+" "+ secondList.get(i)+" ");

            }
            printTheRest(firstList, min);
            printTheRest(secondList,min);
    }
    static void printTheRest(List<Integer> listInt, int beginIndex){
        for (int i = beginIndex; i < listInt.size() ; i++) {
            System.out.print(listInt.get(i)+" ");
        }
    }
}
