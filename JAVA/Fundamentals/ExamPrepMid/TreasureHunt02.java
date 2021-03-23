package ExamPrepMid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] treasure = scanner.nextLine().split("\\|");
        List<String> treasureList = Arrays.stream(treasure).collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!line.equals("Yohoho!")) {
            String[] tokens = line.split(" ");
            String command = tokens[0];
            if (command.equals("Loot")) {
                for (int i = 1; i <tokens.length ; i++) {
                    if(!treasureList.contains(tokens[i])) {
                        treasureList.add(0, tokens[i]);
                    }
                }

            } else if (command.equals("Drop")) {
                drop(treasureList, Integer.parseInt(tokens[1]));


            } else if (command.equals("Steal")) {

                stolenItems(treasureList, Integer.parseInt(tokens[1]));
            }
            line= scanner.nextLine();

        }
        double sum = sumTreasure(treasureList);
        if(sum!=0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.%n", sum);
        }else{
            System.out.println("Failed treasure hunt.");
        }

    }

    static double sumTreasure(List<String> treasure) {
        int sum = 0;
        double finalSum = 0;

        for (int i = 0; i < treasure.size(); i++) {
            int current = treasure.get(i).length();
            sum += current;
        }
        if (treasure.size() != 0) {
            finalSum = sum * 1.0 / treasure.size();
        }
        return finalSum;

    }



    static List<String> drop(List<String> treasure, int index) {
        if (index >= 0 && index < treasure.size()) {
            treasure.add(treasure.get(index));
            treasure.remove(index);
        }
        return treasure;
    }

//    static List<String> steel(List<String> treasure, int count) {
//        if (count > treasure.size()) {
//            count = treasure.size();
//        }
//        for (int i = 0; i < count; i++) {
//            treasure.remove(treasure.size() - 1);
//
//        }
//
//
//        return treasure;
//    }

    static void stolenItems(List<String> treasure, int count){
        List<String> stolenItems = new ArrayList<>();
        if (count > treasure.size()) {
            count = treasure.size();
        }
        for (int i = 0; i < count; i++) {
            stolenItems.add(0,treasure.get(treasure.size()-1));
            treasure.remove(treasure.size() - 1);
        }
        System.out.println(stolenItems.toString().replaceAll("[\\[\\]]", ""));

    }
}
