package ArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] field = new int[fieldSize];
        int[] ladybugsIndexes = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        for (int ladyBugIndex : ladybugsIndexes) {
            if(ladyBugIndex>=0&&ladyBugIndex<field.length){
                field[ladyBugIndex] = 1;
            }

        }

        String commands = scanner.nextLine();
        while (!commands.equals("end")) {
            String[] arr = commands.split(" ");
            int index = Integer.parseInt(arr[0]);
            String direction = arr[1];
            int length = Integer.parseInt(arr[2]);
            if (index >= 0 && index < fieldSize && field[index] == 1) {
                field[index] = 0;
                if (direction.equals("right")) {

                    index += length;
                    while (index <= field.length - 1 ) {
                        if (field[index] == 0) {
                            field[index] = 1;
                            break;
                        }
                        index += length;
                    }

                } else if (direction.equals("left")) {

                    index -= length;
                    while (index >= 0 && field[index] == 1) {

                        index -= length;
                    }
                    if (index >= 0) {
                        field[index] = 1;
                    }
                }
            }


            commands = scanner.nextLine();
        }
        for (int i = 0; i < field.length; i++) {
            System.out.printf("%d ", field[i]);
        }


    }

}

