package ObjectsAndClasses.Stundent206;

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

            if(isStudentExist(students, firstName, secondName)){

                Student student = getStudent(students,firstName,secondName);
                student.setFirstName(firstName);
                student.setSecondName(secondName);
                student.setAge(age);
                student.setCity(city);

            }else{
                Student student = new Student(firstName, secondName, age, city);
                students.add(student);
            }

            line = scanner.nextLine();
        }
        String givenCity = scanner.nextLine();

        for (Student student : students) {
            if(givenCity.equals(student.getCity())){
                //System.out.println(student);
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getSecondName(), student.getAge());
            }
        }
    }
    private static boolean isStudentExist(List<Student> students, String firstName, String secondName){
        for (Student student : students) {
            if(student.getFirstName().equals(firstName)&& student.getSecondName().equals(secondName)){
                return true;
            }
        }

        return false;
    }
    private static Student getStudent(List<Student> students, String firstName, String lastName){

        Student existingStudent = null;

        for (Student student : students) {
            if(student.getFirstName().equals(firstName)&&student.getSecondName().equals(lastName)){
                existingStudent=student;
            }
        }

        return existingStudent;
    }
}
