package ExamPrepMid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String line = scanner.nextLine();

        while(!line.equals("End")){

            String[] tokens = line.split("\\s+");
            String command = tokens[0];
            int index = Integer.parseInt(tokens[1]);

            if(command.equals("Shoot")){
                int power = Integer.parseInt(tokens[2]);
               if(ifIndexExist(targets, index)) {
                    int newValue = targets.get(index)-power;
                    if(newValue<=0){
                        targets.remove(index);
                    }else{
                        targets.set(index, newValue);
                    }
                }

            }else if(command.equals("Add")){
                if(ifIndexExist(targets,index)){
                    int value = Integer.parseInt(tokens[2]);
                    targets.add(index, value);
                }else{
                    System.out.println("Invalid placement!");
                }

            }else  if(command.equals("Strike")){
                int radius = Integer.parseInt(tokens[2]);

               if(index-radius>=0&&index+radius<targets.size()){
                   targets.subList(index-radius,index+radius+1).clear();
               }else{
                   System.out.println("Strike missed!");
               }


            }

            line=scanner.nextLine();
        }
        String targetPrint = targets.toString().replaceAll("[\\[\\],]","");
        System.out.println(targetPrint.replaceAll(" ", "|"));

    }
    static boolean ifIndexExist(List<Integer> targets, int index){
        if(index>=0&&index<targets.size()){
            return true;
        }else{
            return false;
        }
    }
}
