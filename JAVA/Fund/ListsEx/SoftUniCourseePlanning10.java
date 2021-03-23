package ListsEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCourseePlanning10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> course = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!line.equals("course start")) {

            String[] tokens = line.split(":");
            String command = tokens[0];
            if (command.equals("Add")) {
                add(course, (tokens[1]));

            } else if (command.equals("Insert")) {
                insert(course, tokens[1], Integer.parseInt(tokens[2]));

            } else if (command.equals("Remove")) {
                remove(course, tokens[1]);

            } else if (command.equals("Swap")) {
                swap(course, tokens[1], tokens[2]);

            } else if (command.equals("Exercise")) {
                exercise(course, tokens[1]);
            }

            line = scanner.nextLine();
        }
        for (int i = 0; i < course.size(); i++) {
            int index = i + 1;
            System.out.println(index + "." + course.get(i));
        }
        //  System.out.println(course.toString());
    }

    static List<String> add(List<String> course, String word) {
        if (!course.contains(word)) {
            course.add(word);
        }
        return course;
    }

    static List<String> insert(List<String> course, String word, int index) {
        if (!course.contains(word)) {
            course.add(index, word);
        }
        return course;
    }

    static List<String> remove(List<String> course, String word) {

        if (course.contains(word)) {
            String wordEx = word + "-Exercise";

            course.remove(word);
            if (course.contains(wordEx)) {
                course.remove(wordEx);

            }
        }
        return course;
    }

    static List<String> swap(List<String> course, String word1, String word2) {
        if (course.contains(word1) && course.contains(word2)) {
            String exOne = word1 + "-Exercise";
            String exTwo = word2 + "-Exercise";

            int index1 = course.indexOf(word1);
            int index2 = course.indexOf(word2);
            String current = course.get(index1);
            course.set(index1, word2);
            course.set(index2, current);
            if (course.contains(exOne)) {
                course.remove(course.indexOf(exOne));
                if (course.indexOf(word1) != course.size() - 1) {
                    course.add(course.indexOf(word1) + 1, exOne);
                } else {
                    course.add(exOne);
                }

            }
            if (course.contains(exTwo)) {

                course.remove(course.indexOf(exTwo));
                if (course.indexOf(word2) != course.size() - 1) {
                    course.add(course.indexOf(word2) + 1, exTwo);
                } else {
                    course.add(exTwo);
                }
            }

        }
        return course;
    }

    static List<String> exercise(List<String> course, String word) {
        if (course.contains(word)) {
            if (!course.contains(word + "-Exercise")) {

                int index = course.indexOf(word);
                if (index != course.size() - 1) {
                    course.add(index + 1, word + "-Exercise");
                } else {
                    course.add(word + "-Exercise");
                }
            }

        } else {
            course.add(word);
            course.add(word + "-Exercise");
        }
        return course;
    }
}
