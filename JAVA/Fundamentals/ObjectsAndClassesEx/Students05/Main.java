package ObjectsAndClassesEx.Students05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            String firstName = line[0];
            String lastName = line[1];
            double grade = Double.parseDouble(line[2]);

            Student student = new Student(firstName, lastName, grade);
            studentList.add(student);
        }

        studentList = studentList.stream()
                .sorted(Comparator.comparing(Student::getGrade).reversed())
                .collect(Collectors.toList());

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
