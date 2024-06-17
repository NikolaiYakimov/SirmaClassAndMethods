package dev.Methods.exc1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        getSignOfInteger(number);
    }

    public static void getSignOfInteger(int number){
        if(number>0){
            System.out.println("The number "+ number +" is positive");
        } else if (number<0) {
            System.out.println("The number "+ number +" is negative");
        }else{
            System.out.println("The number "+ number +" is zero");

        }
    }
}
