    package AssociativeArraysMore;

    import java.util.*;

    public class Judge02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            Map<String, Map<String, Integer>> contests = new LinkedHashMap<>();
            // Map<String, Integer> students = new LinkedHashMap<>();
            Map<String, Integer> userStatistic = new LinkedHashMap<>();

            while (!line.equals("no more time")) {
                String[] tokens = line.split(" -> ");
                String username = tokens[0];
                String contest = tokens[1];
                int points = Integer.parseInt(tokens[2]);

                if (!contests.containsKey(contest)) {
                    contests.put(contest, new LinkedHashMap<>());
                    contests.get(contest).put(username, points);
                } else {
                    if (!contests.get(contest).containsKey(username)) {
                        contests.get(contest).put(username, points);
                    } else {
                        int currentScore = contests.get(contest).get(username);
                        if (points > currentScore) {
                            contests.get(contest).put(username, points);
                        }
                    }

                }
//                if (!userStatistic.containsKey(username)) {
//                    userStatistic.put(username, points);
//                } else {
//                    if(contests.containsKey(contest)&&contests.get(contest).containsKey(username)){
//                        int currentPoints = contests.get(contest).get(username);
//                        if(points>=currentPoints){
//                            userStatistic.put(username, points);
//                        }
//                    }else{
//                        userStatistic.put(username, userStatistic.get(username) + points);
//
//                    }
//
//                }

                line = scanner.nextLine();
            }
            for (Map.Entry<String, Map<String, Integer>> contestsEntrySet : contests.entrySet()) {
                for (Map.Entry<String, Integer> userEntry : contestsEntrySet.getValue().entrySet()) {
                    userStatistic.putIfAbsent(userEntry.getKey(), 0);
                    int newPoints = userStatistic.get(userEntry.getKey())+userEntry.getValue();
                    userStatistic.put(userEntry.getKey(), newPoints);
                }
            }

            int[] num = new int[1];
            contests.entrySet().stream().forEach(e -> {
                num[0] = 0;
                System.out.println(e.getKey() + ": " + e.getValue().size() + " participants");
                e.getValue().entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.<String, Integer>comparingByKey()))
                        .forEach(k -> {
                            System.out.println(++num[0] + ". " + k.getKey() + " <::> " + k.getValue());
                        });
            });
            System.out.println("Individual standings:");
    int[] num2 = new int[1];
            userStatistic.entrySet().stream().sorted((a, b) -> {
                num2[0]=0;
                int result = b.getValue().compareTo(a.getValue());
                if (result == 0) {
                    result = a.getKey().compareTo(b.getKey());
                }
                return result;
            }).forEach(e -> {

                System.out.println(++num2[0]+". "+e.getKey()+" -> "+ e.getValue());
            });

        }
    }
