package DataTypesAndVariablesEx;

import java.util.Scanner;

public class DataTypeFinder002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        while(!data.equals("END")){
            String currentData = data;
            if (data.equals("true")||data.equals("false")){
                data = "boolean";
                break;
            }//else if(data.length()==1){
//               else if(data>=48&&data<=57){
//
//                }
            //}

        }
    }
}
