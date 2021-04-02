package AssociativeArraysMore;

import java.sql.SQLOutput;
import java.util.*;


public class Ranking01 {


    static class Student {
        private String username;

        private Map<String, Integer> userContests;

        public Student(String username, String contest, int points) {
            this.username = username;
            this.userContests = new LinkedHashMap<>();
            this.userContests.put(contest, points);

        }

        public void addContests(String contest, int points) {
            this.userContests.put(contest, points);
        }

        public String getUsername() {
            return username;
        }

        public Map<String, Integer> getUserContests() {
            return userContests;
        }

        public int getPoints() {
            int sum = 0;
            for (Integer value : this.userContests.values()) {
                sum += value;
            }
            return sum;

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> contests = new LinkedHashMap<>();
        String line = scanner.nextLine();
        while (!line.equals("end of contests")) {
            String[] input = line.split(":");
            contests.put(input[0], input[1]);

            line = scanner.nextLine();
        }
        Map<String, Student> students = new LinkedHashMap<>();

        line = scanner.nextLine();
        while (!line.equals("end of submissions")) {
            String[] tokens = line.split("=>");
            String contest = tokens[0];
            String password = tokens[1];
            String username = tokens[2];
            int points = Integer.parseInt(tokens[3]);
            if (contests.containsKey(contest) && contests.get(contest).equals(password)) {

                if (!students.containsKey(username)) {
                    Student current = new Student(username, contest, points);
                    students.put(current.getUsername(), current);
                } else {
                    Student current = students.get(username);
                    if (current.getUserContests().containsKey(contest)) {
                        if (current.getUserContests().get(contest) < points) {
                            current.addContests(contest, points);
                        }
                    } else {

                        //  current.setContests(contest, points);
                        students.get(current.getUsername()).addContests(contest, points);

                    }
                }
            }

            line = scanner.nextLine();
        }
        String student = "";
        int max = Integer.MIN_VALUE;
        for (Map.Entry<String, Student> stringStudentEntry : students.entrySet()) {
            if (stringStudentEntry.getValue().getPoints() > max) {
                max = stringStudentEntry.getValue().getPoints();
                student = stringStudentEntry.getKey();

            }
        }


                System.out.printf("Best candidate is %s with total %d points.%n", student, max);
        System.out.println("Ranking:");


                students.entrySet().stream()
                        .sorted((a,b)->{
                            return a.getKey().compareTo(b.getKey());
                        })
                        .forEach(w -> {
                    System.out.println(w.getKey());

                    w.getValue().getUserContests().entrySet().stream()
                            .sorted((a,b)->{
                                return b.getValue().compareTo(a.getValue());
                            })
                            .forEach(e->{
                                System.out.println("#  "+ e.getKey()+" -> "+e.getValue());

                            });
                });
            }
        }


