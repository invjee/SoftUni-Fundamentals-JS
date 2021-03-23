package AssociativeArraysEx;

import java.util.*;

public class ForceBook09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> forceSides = new LinkedHashMap<>();

        String line = scanner.nextLine();

        while (!line.equals("Lumpawaroo")) {

            if (line.contains("|")) {
                String[] tokens = line.split(" \\| ");
                String forceSide = tokens[0];
                String forceUser = tokens[1];
                boolean isContained = false;
                String currentForceSide = "";
                for (Map.Entry<String, List<String>> entry : forceSides.entrySet()) {

                    if (entry.getValue().contains(forceUser)) {
                        isContained = true;
                        break;
                    }
                }
                if (!isContained) {
                    forceSides.putIfAbsent(forceSide, new ArrayList<>());
                    forceSides.get(forceSide).add(forceUser);
                }
            } else if (line.contains("->")) {
                String[] tokens = line.split(" -> ");
                String forceSide = tokens[1];
                String forceUser = tokens[0];
                boolean isContained = false;
                String currentSide = "";
                for (Map.Entry<String, List<String>> entry : forceSides.entrySet()) {


                    if (entry.getValue().contains(forceUser)) {
                        isContained = true;
                        entry.getValue().remove(forceUser);
                        break;
                    }
                }
                if (isContained) {
                    forceSides.putIfAbsent(forceSide, new ArrayList<>());
                    forceSides.get(forceSide).add(forceUser);
                    System.out.println(String.format("%s joins the %s side!", forceUser, forceSide));
                } else {
                    forceSides.putIfAbsent(forceSide, new ArrayList<>());
                    forceSides.get(forceSide).add(forceUser);
                    System.out.println(String.format("%s joins the %s side!", forceUser, forceSide));
                }
            }

            line = scanner.nextLine();
        }

        forceSides.entrySet()
                .stream()
                .sorted((a,b)->{
                    int result = b.getValue().size()-a.getValue().size();
                    if(result==0){
                        result= a.getKey().compareTo(b.getKey());
                    }
                    return result;
                })
                .filter(a->a.getValue().size()>0)
                .forEach(e->{
                    System.out.println(String.format("Side: %s, Members: %d",  e.getKey(), e.getValue().size()));
                    e.getValue().stream().sorted().forEach(i-> System.out.println("! "+ i));
                });
    }
}
