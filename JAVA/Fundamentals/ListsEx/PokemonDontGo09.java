package ListsEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pokemons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sum = 0;
        while (!pokemons.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());
            int valuePok = 0;
            if (index < 0) {
                sum += pokemons.get(0);
                valuePok = pokemons.get(0);
                pokemons.set(0, pokemons.get(pokemons.size() - 1));
                index = 0;

            } else if (index > pokemons.size() - 1) {
                valuePok = pokemons.get(pokemons.size() - 1);
                sum += pokemons.get(pokemons.size() - 1);
                pokemons.set(pokemons.size() - 1, pokemons.get(0));
                index = pokemons.size() - 1;

            } else {
                valuePok = pokemons.get(index);
                sum += pokemons.get(index);
                pokemons.remove(index);

            }
            increaseDecreasValues(pokemons, valuePok);
           // decreaseValues(pokemons, valuePok);


        }
        System.out.println(sum);
    }

    static List<Integer> increaseDecreasValues(List<Integer> numbers, int value) {
        for (int i = 0; i < numbers.size(); i++) {
            int current = numbers.get(i);
            if (current <= value) {
                current += value;
                numbers.set(i, current);
            } else {
                current -= value;
                numbers.set(i, current);
            }

        }
        return numbers;
    }

    static List<Integer> decreaseValues(List<Integer> numbers, int value) {
        for (int i = 0; i < numbers.size(); i++) {
            int current = numbers.get(i);
            if (current > value) {
                current -= value;
                numbers.set(i, current);
            }
        }
        return numbers;
    }
}
