package ObjectsAndClassesEx.OpinionPoll03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String name = line.split("\\s+")[0];
            int age = Integer.parseInt(line.split("\\s+")[1]);


                Person person = new Person(name, age);
                personList.add(person);


        }
        personList = personList.stream().filter(p->p.getAge()>30).collect(Collectors.toList());
        personList.sort(Comparator.comparing(p->p.getName()));

        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
