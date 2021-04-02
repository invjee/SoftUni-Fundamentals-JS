package ExamPrepFin;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogic03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, int[]> heroes = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int hp = Integer.parseInt(tokens[1]);
            int mp = Integer.parseInt(tokens[2]);
            heroes.put(name, new int[2]);
            heroes.get(name)[0] = hp;
            heroes.get(name)[1] = mp;
        }
        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] tokens = line.split(" - ");
            String command = tokens[0];
            if (command.equals("CastSpell")) {
                String hero = tokens[1];
                int mpNeeded = Integer.parseInt(tokens[2]);
                String spellName = tokens[3];
                castSpell(heroes, hero, mpNeeded, spellName);

            } else if (command.equals("TakeDamage")) {
                String hero = tokens[1];
                int damage = Integer.parseInt(tokens[2]);
                String attacker = tokens[3];
                takeDamage(heroes, hero, damage, attacker);

            } else if (command.equals("Recharge")) {
                String hero = tokens[1];
                int amount = Integer.parseInt(tokens[2]);
                recharge(heroes,hero, amount);

            } else if (command.equals("Heal")) {
                String hero = tokens[1];
                int amount = Integer.parseInt(tokens[2]);
                heal(heroes, hero, amount);

            }
            line = scanner.nextLine();
        }
        heroes.entrySet()
                .stream()
                .sorted((a,b)->{
                   int result =   b.getValue()[0]-a.getValue()[0];
                   if(result==0){
                       return a.getKey().compareTo(b.getKey());
                   }
                   return result;
                })
                .forEach(e->{
                    System.out.printf("%s%n HP: %d%n MP: %d%n", e.getKey(), e.getValue()[0], e.getValue()[1]);
                   // System.out.println(String.format("%s%n%HP: %d%nMP: %d%n", e.getKey(), e.getValue()[0], e.getValue()[1]));
                });
    }

    private static void heal(Map<String,int[]> heroes, String hero, int amount) {
        if(heroes.get(hero)[0]+amount>100){
            System.out.printf("%s healed for %d HP!%n", hero, 100-heroes.get(hero)[0]);
            heroes.get(hero)[0]=100;
        }else{
            System.out.printf("%s healed for %d HP!%n", hero, amount);
            heroes.get(hero)[0]+=amount;
        }
    }

    private static void recharge(Map<String,int[]> heroes, String hero, int amount) {

        if(heroes.get(hero)[1]+amount>200){
            System.out.printf("%s recharged for %d MP!%n", hero, 200-heroes.get(hero)[1]);
            heroes.get(hero)[1]=200;
        }else{
            System.out.printf("%s recharged for %d MP!%n", hero, amount);
            heroes.get(hero)[1]+=amount;
        }
    }

    private static void takeDamage(Map<String,int[]> heroes, String hero, int damage, String attacker) {
        int heroHP = heroes.get(hero)[0];
        if(heroHP>damage){
            System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", hero,damage,attacker,heroHP-damage);
            heroHP-=damage;
            heroes.get(hero)[0]=heroHP;
        }else{
            System.out.printf("%s has been killed by %s!%n", hero, attacker);
            heroes.remove(hero);
        }
    }

    static void castSpell(Map<String, int[]> heroes, String heroName, int mp, String spellName) {
        if (heroes.get(heroName)[1] >= mp) {
            System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, heroes.get(heroName)[1] - mp);
            heroes.get(heroName)[1] -= mp;
        } else {
            System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
        }
    }
}
