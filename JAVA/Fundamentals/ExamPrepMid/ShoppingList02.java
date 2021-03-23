package ExamPrepMid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = Arrays.stream( scanner.nextLine().split("!")).collect(Collectors.toList());               ;

        String line = scanner.nextLine();

        while(!line.equals("Go Shopping!")){
            String command = line.split(" ")[0];
            String product = line.split(" ")[1];

            if(command.equals("Urgent")){
                if(!shoppingList.contains(product)){
                    shoppingList.add(0, product);
                }

            }else if(command.equals("Unnecessary")){
                if(shoppingList.contains(product)){
                   //int index =  shoppingList.indexOf(product);
                   shoppingList.remove(product);
                }


            }else if(command.equals("Correct")){
                if(shoppingList.contains(product)){
                    String newProduct = line.split(" ")[2];
                    int index = shoppingList.indexOf(product);
                    shoppingList.set(index, newProduct);
                }

            }else if(command.equals("Rearrange")){
                if(shoppingList.contains(product)){
                    shoppingList.remove(product);
                    shoppingList.add(product);
                }


            }
            line = scanner.nextLine();
        }
        System.out.println(shoppingList.toString().replaceAll("[\\[\\]]", ""));
    }
}
