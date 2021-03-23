package ExamPrepMid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> treasure = new ArrayList<>(Arrays.asList("one", "two", "three"));
        int count = 2;
        if(count>treasure.size()){
            count=treasure.size();
        }

        for (int i = 0; i<count; i++) {
            treasure.remove(treasure.size()-1);

        }
        System.out.println(treasure.toString());

    }
}
