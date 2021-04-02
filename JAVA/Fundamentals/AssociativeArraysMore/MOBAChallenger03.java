package AssociativeArraysMore;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MOBAChallenger03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        Map<String, Map<String, Integer>> playerPool = new LinkedHashMap<>();

        while (!line.equalsIgnoreCase("season end")) {
            if (line.contains("->")) {
                String[] commands = line.split(" -> ");
                String player = commands[0];
                String position = commands[1];
                int skill = Integer.parseInt(commands[2]);

                if (!playerPool.containsKey(player)) {
                    playerPool.put(player, new LinkedHashMap<>());
                    playerPool.get(player).put(position, skill);
                } else {
                    if (!playerPool.get(player).containsKey(position)) {
                        playerPool.get(player).put(position, skill);
                    } else {
                        int currentSkill = playerPool.get(player).get(position);
                        if (currentSkill < skill) {
                            playerPool.get(player).put(position, skill);
                        }
                    }
                }


            } else {
                String[] tokens = line.split(" vs ");
                String player1 = tokens[0];
                String player2 = tokens[1];
                if (playerPool.containsKey(player1) && playerPool.containsKey(player2)) {

                    playerPool.get(player1).entrySet().stream().forEach(e -> {
                        if(playerPool.containsKey(player2)) {
                            // if(!playerPool.get(player2).isEmpty()) {
                            if (playerPool.get(player2).containsKey(e.getKey())) {

                                int player1Skill = e.getValue();
                                int player2Skill = playerPool.get(player2).get(e.getKey());
                                if (player1Skill > player2Skill) {
                                    playerPool.remove(player2);
                                } else if (player2Skill > player1Skill) {
                                    playerPool.remove(player1);
                                }
                                // }
                            }
                        }

                    });
                }
            }

            line = scanner.nextLine();
        }

        playerPool.entrySet().stream().sorted((a, b) -> {
            int aTotalSkill = a.getValue().values().stream().reduce(0, (x, y) -> x + y);
            int bTotalSkill = b.getValue().values().stream().reduce(0, (x, y) -> x + y);
            int result = Integer.compare(bTotalSkill, aTotalSkill);
            if (result == 0) {
                result = a.getKey().compareTo(b.getKey());
            }
            return result;
        })
                .forEach(e -> {
                    System.out.println(e.getKey() + ": " + e.getValue().values().stream().mapToInt(Integer::intValue).sum() + " skill");
                    e.getValue().entrySet().stream()
                            .sorted((a, b) -> {
                                int result = b.getValue().compareTo(a.getValue());
                                if (result == 0) {
                                    result = a.getKey().compareTo(b.getKey());
                                }
                                return result;
                            })
                            .forEach(k -> {
                                System.out.println("- " + k.getKey() + " <::> " + k.getValue());
                            });
                });
    }
}
//reduce(0, (a, b) -> a + b)