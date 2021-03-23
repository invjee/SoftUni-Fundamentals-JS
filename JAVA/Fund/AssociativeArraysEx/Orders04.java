package AssociativeArraysEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        Map<String, Double[]> products = new LinkedHashMap<>();

        while(!line.equalsIgnoreCase("buy")){
            String[] tokens = line.split(" ");
            String product = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity= Integer.parseInt(tokens[2]);
            double sum = price*quantity*1.0;
            if(!products.containsKey(product)) {
                products.put(product, new Double[2]);

                products.get(product)[0] = price;
                products.get(product)[1] = quantity * 1.0;
            }else {
                Double[] newArray = products.get(product);

                newArray[0] = price;
                newArray[1] += quantity * 1.0;
                products.put(product, newArray);

            }


            line = scanner.nextLine();
        }
        for (Map.Entry<String, Double[]> entry : products.entrySet()) {
            double sum = entry.getValue()[0]*entry.getValue()[1];
            System.out.println(String.format("%s -> %.2f", entry.getKey(), sum));
        }
    }
}
