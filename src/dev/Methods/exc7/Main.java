package dev.Methods.exc7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String");
        String input=scanner.nextLine();
        System.out.println("Enter times to repeat");
        int n=scanner.nextInt();

        System.out.println(repeatString(input,n));
    }

    public static String repeatString(String input,int repeat){
        StringBuilder newStr= new StringBuilder("");
        for (int i=0;i<repeat;i++){
            newStr.append(input);
        }
        return newStr.toString();
    }
}
