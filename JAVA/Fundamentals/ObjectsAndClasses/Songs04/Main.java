package ObjectsAndClasses.Songs04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] names = scanner.nextLine().split("_");

            String typeList = names[0];
            String name = names[1];
            String time = names[2];

            Song song = new Song(typeList, name,time);

            songs.add(song);
        }

        String typeList = scanner.nextLine();
        if(typeList.equals("all")){
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        }else{
            for (Song song : songs) {
                if(song.getTypeList().equals(typeList)){
                    System.out.println(song.getName());
                }
            }
        }
    }
}
