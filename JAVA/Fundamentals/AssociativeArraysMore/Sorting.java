package AssociativeArraysMore;
import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        Map<String, Map<String, List<Double>>> test = new TreeMap<>();
        test.put("B", new TreeMap<>() {{
            put("Pounds", new ArrayList<>());
        }});
        test.get("B").get("Pounds").add(65.00);
        test.get("B").get("Pounds").add(62.50);

        test.put("C", new TreeMap<>() {{
            put("Pounds", new ArrayList<>());
        }});
        test.get("C").get("Pounds").add(65.00);
        test.get("C").get("Pounds").add(62.50);
        test.get("C").get("Pounds").add(7.50);

        test.put("A", new TreeMap<>() {{
            put("Pounds", new ArrayList<>());
            ;
        }});
        test.get("A").get("Pounds").add(41.00);
        test.get("A").get("Pounds").add(43.00);

        test.put("D", new TreeMap<>() {{
            put("Pounds", new ArrayList<>());
            ;
        }});
        test.get("D").get("Pounds").add(41.00);
        test.get("D").get("Pounds").add(44.00);
        test.get("D").get("Pounds").add(24.00);

        test.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())//<-Сортираме по първия ключ във възходящ ред
                .forEach(e -> System.out.printf("%s - have %.2f %s%n",
                        e.getKey(),//<-Първия ключ
                        e.getValue().get(e.getValue().keySet().toString().replaceAll("[\\[\\]]", ""))//<-Сумираме стойностите
                                .stream()
                                .mapToDouble(Double::doubleValue)
                                .sum(),
                        e.getValue().keySet().toString().replaceAll("[\\[\\]]", ""))); //<-Взимаме втория ключ
        System.out.println("-----------------------------");

        test.entrySet()
                .stream()
                .sorted((a, b) -> { //<-Сортираме по сумата от стойностите в низходящ ред
                    return Double.compare(b.getValue().get(b.getValue().keySet().toString()
                                    .replaceAll("[\\[\\]]", ""))
                                    .stream().mapToDouble(Double::doubleValue).sum(),
                            a.getValue().get(a.getValue().keySet().toString()
                                    .replaceAll("[\\[\\]]", "")).stream()
                                    .mapToDouble(Double::doubleValue).sum());
                }).filter(c -> c.getValue().get(c.getValue().keySet().toString()//<-Взимаме само тези със сума >=90
                .replaceAll("[\\[\\]]", ""))
                .stream().mapToDouble(Double::doubleValue).sum() >= 90)
                .forEach(e -> System.out.printf("%s - have %.2f %s%n",
                        e.getKey(),//<-Първия ключ
                        e.getValue().get(e.getValue().keySet().toString().replaceAll("[\\[\\]]", ""))//<-Сумираме стойностите
                                .stream()
                                .mapToDouble(Double::doubleValue)
                                .sum(),
                        e.getValue().keySet().toString().replaceAll("[\\[\\]]", "")));//<-Взимаме втория ключ
        System.out.println("-----------------------------");

        test.entrySet().stream().sorted((a, b) -> {//<-Сортираме по първата стойност  в низходящ ред
            int sort = Double.compare(b.getValue().get(b.getValue().keySet().toString()
                            .replaceAll("[\\[\\]]", "")).get(0),
                    a.getValue().get(a.getValue().keySet().toString()
                            .replaceAll("[\\[\\]]", "")).get(0));
            if (sort == 0) {//<- Ако първата стойност е равна сортираме по втарата
                sort = Double.compare(b.getValue().get(b.getValue().keySet().toString()
                                .replaceAll("[\\[\\]]", "")).get(1),
                        a.getValue().get(a.getValue().keySet().toString()
                                .replaceAll("[\\[\\]]", "")).get(1));
                if (sort == 0) {//<- Ако втората стойност е равна сортираме първия ключ
                    Map.Entry.comparingByKey();
                }
            }
            return sort;
        }).forEach(e -> System.out.printf("%s - have %.2f and %.2f %s%n",
                e.getKey(),//<-Първия ключ
                e.getValue().get(e.getValue().keySet().toString().replaceAll("[\\[\\]]", "")).get(0),//<-Първа стойност
                e.getValue().get(e.getValue().keySet().toString().replaceAll("[\\[\\]]", "")).get(1),//<-Втора стойност
                e.getValue().keySet().toString().replaceAll("[\\[\\]]", "")));//<-Втория ключ
    }
}
// Конзолата отпечатва:
// A - have 84,00 Pounds
// B - have 127,50 Pounds
// C - have 135,00 Pounds
// D - have 108,00 Pounds
// -----------------------------
// C - have 135,00 Pounds
// B - have 127,50 Pounds
// D - have 108,00 Pounds
// -----------------------------
// B - have 65,00 and 62,50 Pounds
// C - have 65,00 and 62,50 Pounds
// D - have 41,00 and 44,00 Pounds
// A - have 41,00 and 43,00 Pounds
