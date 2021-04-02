package AssociativeArraysMore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    static class Person{
        String name;
       private String address;
       private int age;

        public Person(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> names = new ArrayList<>();
int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();;
            String address = scanner.nextLine();;
        }


    }

}
