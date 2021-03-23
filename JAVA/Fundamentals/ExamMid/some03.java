package ExamMid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class some03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> priceRatings = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int entryPoint = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();

        long leftItems = 0;
        long rightItems = 0;

        for (int i = entryPoint; i < priceRatings.size(); i++) {
            if(i==priceRatings.size()-1){
                break;
            }
            long currentItem = priceRatings.get(i+1);
            long entryElement = priceRatings.get(entryPoint);
            if (type.equals("cheap")) {

                if (currentItem < entryElement) {
                    rightItems += (long) currentItem;
                }
            } else if (type.equals("expensive")) {
                if (currentItem >= entryElement) {
                    rightItems += (long) currentItem;
                }
            }

        }
        for (int i = entryPoint; i >= 0; i--) {
            if(i==0){
                break;
            }
            if(type.equals("cheap")){
                if(priceRatings.get(i-1)<priceRatings.get(entryPoint)){
                    leftItems+= (long) priceRatings.get(i-1);
                }
            }else if(type.equals("expensive")){
                if(priceRatings.get(i-1)>=priceRatings.get(entryPoint)){
                    leftItems+= (long) priceRatings.get(i-1);
                }
            }

        }
        if(leftItems>=rightItems){
            System.out.println("Left - "+ leftItems);
        }else{
            System.out.println("Right - " + rightItems);
        }


    }
}
