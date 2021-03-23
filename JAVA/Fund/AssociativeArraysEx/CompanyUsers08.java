package AssociativeArraysEx;

import java.util.*;

public class CompanyUsers08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companies = new LinkedHashMap<>();
        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String name = line.split(" -> ")[0];
            String id = line.split(" -> ")[1];
            companies.putIfAbsent(name, new ArrayList<>());
            if (!companies.get(name).contains(id)) {
                companies.get(name).add(id);
            }

            line = scanner.nextLine();
        }
        companies.entrySet()
                .stream()
                .sorted((a,b)->a.getKey().compareTo(b.getKey()))
                .forEach(e-> {
                    System.out.println(e.getKey());
                    e.getValue().forEach(i-> System.out.println("-- "+ i));
                });
    }
}
