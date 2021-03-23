package ExamPrepMid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int[] targetsNew = new int[targets.size()];

        String line = scanner.nextLine();

        int shotTargetsCount = 0;

        while (!line.equals("End")) {
            int shot = Integer.parseInt(line);
            if (shot >= 0 && shot < targets.size()) {

                if (targetsNew[shot] != -1) {
                    for (int i = 0; i < targets.size(); i++) {
                        if (targetsNew[i] != -1 && shot != i) {
                            if (targets.get(i) > targets.get(shot)) {
                                int newValue = targets.get(i) - targets.get(shot);
                                targets.set(i, newValue);

                            } else {
                                int newValue = targets.get(i) + targets.get(shot);
                                targets.set(i, newValue);
                            }
                        }

                    }
                    targets.set(shot, -1);

                    targetsNew[shot]= -1;
                    shotTargetsCount++;
                }

            }

            line = scanner.nextLine();
        }

        System.out.printf("Shot targets: %d -> ",shotTargetsCount);
        System.out.println(targets.toString().replaceAll("[\\[\\],]", ""));


    }


}
