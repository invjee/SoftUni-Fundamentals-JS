package ListsEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\|");
        List<String> result = new ArrayList<>();

        for (int i = input.length - 1; i >= 0; i--) {
            String[] temp = input[i].split("\\s+");

            for (String s : temp) {
                if(!"".equals(s)){
                    result.add(s);
                }




            }

        }
        System.out.println(String.join(" ", result));
    }
}
