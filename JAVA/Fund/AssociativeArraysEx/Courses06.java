package AssociativeArraysEx;

import java.util.*;

public class Courses06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        Map<String, List<String>> courses = new LinkedHashMap<>();

        while(!line.equals("end")){
            String courseName = line.split(" : ")[0];
            String studentName = line.split(" : ")[1];
            courses.putIfAbsent(courseName, new ArrayList<>());
          //  List<String> current = courses.get(courseName);
            courses.get(courseName).add(studentName);
           // courses.put(courseName, current);

            line=scanner.nextLine();
        }
        courses.entrySet()
                .stream()
                .sorted((a,b)->{
                    int result = b.getValue().size()-a.getValue().size();
                    return result;
                })
                .forEach(e-> {
            System.out.println(String.format("%s: %d", e.getKey(), e.getValue().size()));
            e.getValue().stream()
                    .sorted().forEach(i-> System.out.println("-- "+ i));
//            Collections.sort(e.getValue());
//                  e.getValue().forEach(i-> System.out.println("-- "+ i));
        });

    }
}
