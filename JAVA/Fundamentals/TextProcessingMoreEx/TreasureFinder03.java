package TextProcessingMoreEx;

import java.util.Scanner;

public class TreasureFinder03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        String hiddenMessage = scanner.nextLine();
        StringBuilder builder = new StringBuilder();
int indexText =0;
        int keyIndex =0;
        char fromHidden = hiddenMessage.charAt(indexText);
        int fromKey = Integer.parseInt(String.valueOf(key.charAt(keyIndex)));
        while (indexText<hiddenMessage.length()) {


            char current = (char) (fromHidden - fromKey);
            builder.append(current);

            keyIndex++;
            indexText++;
            if(keyIndex==key.length()) {
                keyIndex = 0;
            }
            if(key.charAt(keyIndex)==' '){
                keyIndex++;
            }
            if(indexText==hiddenMessage.length()){
                break;
            }


            fromHidden = hiddenMessage.charAt(indexText);
            fromKey = Integer.parseInt(String.valueOf(key.charAt(keyIndex)));

        }
        System.out.println(builder);
    }
}
