package AssociativeArraysEx;

import java.util.*;

public class StudentAcademy07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> students = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }

        students.entrySet()
                .stream()
                .filter((a)-> a.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble()>=4.50
                    )

                .sorted((a,b)->{
                    double first = a.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                    double second = b.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();

                    return Double.compare(second, first);
                })
                .forEach(e-> System.out.println(String.format("%s -> %.2f", e.getKey(), e.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble())));
    }
}
