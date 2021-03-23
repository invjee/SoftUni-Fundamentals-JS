package ObjectsAndClassesEx.Articles02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        String title = input[0];
        String content = input[1];
        String author = input[2];

        Article article = new Article(title,content, author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String tokens = scanner.nextLine();
            String command = tokens.split(": ")[0];
            String changedArticle = tokens.split(": ")[1];
            switch (command){
                case "Edit": article.edit(changedArticle);
                    break;
                case "ChangeAuthor": article.change(changedArticle);
                    break;
                case "Rename": article.rename(changedArticle);
                    break;
            }

        }
        System.out.println(article);
    }
}
