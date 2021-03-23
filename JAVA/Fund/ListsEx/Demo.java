package ListsEx;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        String text = "aabbccddcdc";
        int portions = 3;
        int chars = text.length() / portions;
        System.out.println(chars);
        String[] newEqual = new String[portions];

        int count = 0;

        for (int i = 0; i < text.length(); i += chars) {
            portions--;

            if(portions==0){
                String part = text.substring(i);
                newEqual[count] = part;
                break;
            }else{
                String part = text.substring(i, i + chars);
                newEqual[count] = part;
            }
            count++;
        }
        System.out.println(String.join(" ", newEqual));

    }
}
