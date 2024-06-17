package dev.Methods.exc8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number");
        double num=scanner.nextDouble();
        System.out.println("Enter power: ");
        int power=scanner.nextInt();

        System.out.println(mathPower(num,power));
    }

    public static double mathPower(double number,int power){
        return Math.pow(number,power);
    }
}
