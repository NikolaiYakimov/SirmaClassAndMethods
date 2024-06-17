package dev.Methods.exc6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter width: ");
        int width=Integer.parseInt(scanner.nextLine());

        System.out.println("Enter height: ");
        int height=Integer.parseInt(scanner.nextLine());

        System.out.println(calculateRectArea(width,height));
    }

    public static int calculateRectArea(int a,int b){
        return a*b;
    }
}
