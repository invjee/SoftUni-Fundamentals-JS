package AssociativeArraysMore;

import java.util.*;

public class DragonArmy05 {
    static class Dragon {
        private String name;
        private String type;
        private int damage;
        private int health;
        private int armour;

        public Dragon(String name, String type) {
            this.name = name;
            this.type = type;

        }

        public void setDamageHealthArmor(int damage, int health, int armour) {
            this.damage = damage;
            this.health = health;
            this.armour = armour;
        }


        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public int getDamage() {
            return damage;
        }

        public int getHealth() {
            return health;
        }

        public int getArmour() {
            return armour;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Dragon>> dragons = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split(" ");
            String type = info[0];
            String name = info[1];
            int damage = 45;
            int health = 250;
            int armor = 10;
           // String some = info[2];
            if (!info[2].equals("null")) {
                damage = Integer.parseInt(info[2]);
            }
            if (!info[3].equals("null")) {
                health = Integer.parseInt(info[3]);
            }
            if (!info[4].equals("null")) {
                armor = Integer.parseInt(info[4]);
            }
            Dragon dragon = new Dragon(name, type);

            if (!dragons.containsKey(type)) {
                dragons.put(type, new TreeMap<>());
                dragons.get(dragon.getType()).put(name, dragon);

                dragons.get(dragon.getType()).get(dragon.getName()).setDamageHealthArmor(damage, health, armor);

            } else {
                if (dragons.get(dragon.getType()).containsKey(name)) {
                    dragons.get(dragon.getType()).get(dragon.getName()).setDamageHealthArmor(damage, health, armor);
                } else {
                    dragons.get(dragon.getType()).put(name, dragon);
                    dragons.get(dragon.getType()).get(dragon.getName()).setDamageHealthArmor(damage, health, armor);
                }

            }
        }
        for (Map.Entry<String, Map<String, Dragon>> dragonsEntry : dragons.entrySet()) {
            for (Map.Entry<String, Dragon> stringDragonEntry : dragonsEntry.getValue().entrySet()) {

            }
        }


        dragons.entrySet().stream().forEach(e -> {
            double averageArmor = 0.0;
            double averageHealth = 0.0;
            double averageDamage = 0.0;
            for (Map.Entry<String, Dragon> stringDragonEntry : e.getValue().entrySet()) {
                Dragon current = stringDragonEntry.getValue();
                averageDamage += current.getDamage();
                averageHealth += current.getHealth();
                averageArmor += current.getArmour();

            }
            if (e.getValue().size() != 0) {
                averageDamage /= e.getValue().size();
                averageHealth /= e.getValue().size();
                averageArmor /= e.getValue().size();
            }

            System.out.println(e.getKey() + String.format("::(%.2f/%.2f/%.2f)", averageDamage, averageHealth,averageArmor));
            e.getValue().entrySet().stream().forEach(k -> {
                System.out.println("-" + k.getKey() + " -> damage: " + k.getValue().getDamage() + ", health: " + k.getValue().getHealth() + ", armor: " + k.getValue().getArmour());

            });
        });

    }
}
