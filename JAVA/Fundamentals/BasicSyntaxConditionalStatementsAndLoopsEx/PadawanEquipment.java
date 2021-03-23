package BasicSyntaxConditionalStatementsAndLoopsEx;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        int counter = 0;
        double sum = 0;
        double headset =0;
        double mouse = 0;
        double keyboard = 0;
        double display = 0;

        for (int i = 1; i <= lostGamesCount; i++) {
            counter++;
            if (counter % 3 == 0 && counter%4==0) {
                headset += headsetPrice;
                mouse += mousePrice;
                keyboard += keyboardPrice;
                display += displayPrice;
            }else if(counter % 2 == 0 && counter % 3 == 0){
                headset += headsetPrice;
                mouse += mousePrice;
                keyboard += keyboardPrice;
            }else if(counter % 3 == 0){
                mouse += mousePrice;
            }else if(counter % 2 == 0){
                headset +=headsetPrice;
            }

        }
        sum = headset+mouse+keyboard+display;
        System.out.printf("Rage expenses: %.2f lv.", sum);
    }
}
/*•	On the first input line - lost games count – integer in the range [0, 1000].
•	On the second line – headset price - floating point number in range [0, 1000].
•	On the third line – mouse price - floating point number in range [0, 1000].
•	On the fourth line – keyboard price - floating point number in range [0, 1000].
•	On the fifth line – display price - floating point number in range [0, 1000].
8/

 */
