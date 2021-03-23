package ObjectsAndClassesEx.OrderByAge07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        List<Person> personsList = new ArrayList<>();

        while(!line.equals("End")){
            String name = line.split(" ")[0];
            String id = line.split(" ")[1];
            int age = Integer.parseInt(line.split(" ")[2]);
            Person person = new Person(name, id, age);
            personsList.add(person);

            line = scanner.nextLine();
        }

        personsList = personsList.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());

        for (Person person : personsList) {
            System.out.println(person);
        }


    }
}
