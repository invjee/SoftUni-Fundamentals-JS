package ObjectsAndClassesEx.Articles2004;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Article> articles = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            String[] line = scanner.nextLine().split(", ");
            String title = line[0];
            String content = line[1];
            String author = line[2];

            Article article = new Article(title, content, author);
            articles.add(article);

        }

        String command = scanner.nextLine();
        String tryIt = "getTitle";
        switch (command){
            case "title":
                articles = articles.stream().sorted(Comparator.comparing(Article::getTitle)).collect(Collectors.toList());
                break;
            case "content":
                articles = articles.stream().sorted(Comparator.comparing(Article::getContent)).collect(Collectors.toList());
                break;
            case "author":
                articles = articles.stream().sorted(Comparator.comparing(Article::getAuthor)).collect(Collectors.toList());
                break;
        }
        for (Article article : articles) {
            System.out.println(article);
        }







    }
    static String changeCommandName(String command){
        command = "get"+command;
        return command;
    }
}
