package dev.Classes.Exc8;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String input=scanner.nextLine();
        String[] articleParts=input.split(", ");
        Article article=new Article(articleParts[0],articleParts[1],articleParts[2]);
        int n=Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++){
            String comandInput=scanner.nextLine();
            String[] commandParts=comandInput.split(": ");
            switch (commandParts[0]){
                case "Edit":{
                    article.edit(commandParts[1]);
                    break;
                }
                case "ChangeAuthor":{
                    article.changeAuthor(commandParts[1]);
                    break;
                }
                case "Rename":{
                    article.rename(commandParts[1]);
                    break;
                }
            }
        }
        System.out.println(article);
    }
}
