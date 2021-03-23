package ListsEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> peopleParty = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");

            if (line[2].equals("not")) {
                if(peopleParty.contains(line[0])){
                    peopleParty.remove(line[0]);
                }else{
                    System.out.println(line[0]+ " is not in the list!");
                }

            } else {
                if (!peopleParty.contains(line[0])) {
                    peopleParty.add(line[0]);
                } else {
                    System.out.println(line[0] + " is already in the list!");
                }
            }
        }
        for (String name:peopleParty){
            System.out.println(name);
        }
        //String format = peopleParty.toString().replaceAll("[\\[\\],]", "");


    }
}
