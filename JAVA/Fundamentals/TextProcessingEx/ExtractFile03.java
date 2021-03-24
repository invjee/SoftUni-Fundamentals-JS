package TextProcessingEx;

import java.util.Scanner;

public class ExtractFile03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        int index = path.lastIndexOf("\\");
        String file = path.substring(index+1);
        String[] tokens = file.split("\\.");
        String fileName = tokens[0];
        String extension = tokens[1];

        System.out.println("File name: "+ fileName);
        System.out.println("File extension: "+ extension);

    }
}
