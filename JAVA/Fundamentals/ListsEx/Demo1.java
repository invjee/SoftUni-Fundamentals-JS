package ListsEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        String name = "Velina Ivanova Surlekova";

        List<String> listAr = Arrays.stream(name.split(" ")).collect(Collectors.toList());

        List<String> string = new ArrayList<>();
        String[] strings = name.split(" ");





    }
}
