package dev.Classes.exc6;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String value=scanner.nextLine();
        String[] words=value.split(" ");
        Random rnd=new Random();
        for(int i=words.length-1;i>0;i--){
           int index= rnd.nextInt(i+1);
            String temp = words[i];
            words[i] = words[index];
            words[index] = temp;
        }

        for (String word : words) {
            System.out.println(word);
        }
    }
}
