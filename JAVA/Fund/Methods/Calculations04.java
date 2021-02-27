package Methods;

import java.util.Scanner;

public class Calculations04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        if(command.equalsIgnoreCase("Add")){
            add(a,b);
        }else if(command.equalsIgnoreCase("Subtract")){
            subtract(a,b);
        }else if(command.equalsIgnoreCase("Divide")){
            divide(a,b);
        }else if(command.equalsIgnoreCase("Multiply")){
            multiply(a,b);
        }
//        switch (command){
//            case "Add": add(a,b);
//            break;
//            case "Subtract": subtract(a,b);
//            break;
//            case "Divide": divide(a,b);
//            break;
//            case "Multiply": multiply(a,b);
//            break;
//        }
  }
    static void add(int a, int b){
        System.out.println(a+b);

    }
    static void multiply(int a, int b){
        System.out.println(a*b);
    }
    static void divide(int a, int b){
        System.out.println(a/b);
    }
    static void subtract(int a, int b){
        System.out.println(a-b);
    }
}
