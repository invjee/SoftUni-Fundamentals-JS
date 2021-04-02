package ExamPrepFin;

import java.util.*;


public class ThePianist03 {
    static class Piece {
        String piece;
        String composer;
        String key;

        public Piece(String piece, String composer, String key) {
            this.piece = piece;
            this.composer = composer;
            this.key = key;
        }

        public String getPiece() {
            return piece;
        }

        public void changeKey(String newKey) {
            this.key = newKey;
        }

        public String getComposer() {
            return composer;
        }

        public String getKey() {
            return key;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Piece> collection = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split("\\|");

            Piece current = new Piece(info[0], info[1], info[2]);
            collection.put(current.getPiece(), current);

        }
        String line = scanner.nextLine();
        while (!line.equals("Stop")) {
            String[] tokens = line.split("\\|");
            String command = tokens[0];
            String piece = tokens[1];
            switch (command) {
                case "Add":
                    String composerAdd = tokens[2];
                    String keyAdd = tokens[3];
                    if (collection.containsKey(piece)) {
                        System.out.println(piece + " is already in the collection!");
                    } else {
                        Piece current = new Piece(piece, composerAdd, keyAdd);
                        collection.put(current.getPiece(), current);
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composerAdd, keyAdd);
                    }
                    break;
                case "Remove":
                    if (collection.containsKey(piece)) {
                        collection.remove(piece);
                        System.out.println("Successfully removed " + piece + "!");
                    } else {
                        System.out.println("Invalid operation! " + piece + " does not exist in the collection.");
                    }
                    break;
                case "ChangeKey":
                    String newKey = tokens[2];
                    if (collection.containsKey(piece)) {
                        collection.get(piece).changeKey(newKey);
                        System.out.println("Changed the key of "+piece+" to "+ newKey+"!");
                    } else {
                        System.out.println("Invalid operation! " + piece + " does not exist in the collection.");
                    }
                    break;
            }
            line = scanner.nextLine();
        }
        collection.values().stream()
                .sorted((a,b)->{
                     int result = a.getPiece().compareTo(b.getPiece());
                    if(result==0){
                        result=a.getComposer().compareTo(b.getComposer());
                    }
                    return result;
                })
                .forEach(e->{
            System.out.printf("%s -> Composer: %s, Key: %s%n", e.getPiece(), e.getComposer(), e.getKey());
        });
    }
}
