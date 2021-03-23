package ObjectsAndClasses.Students05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        List<Student> students = new ArrayList<>();

        while (!line.equals("end")) {
            String[] tokens = line.split(" ");
            String firstName = tokens[0];
            String secondName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String city = tokens[3];

            Student student = new Student(firstName, secondName, age, city);

            students.add(student);



            line = scanner.nextLine();
        }
        String givenCity = scanner.nextLine();

        for (Student student : students) {
            if(student.getCity().equals(givenCity)){
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getSecondName(), student.getAge());
            }

        }
    }
}
