package dev.Methods.exc11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first num");
        int num1=scanner.nextInt();
        System.out.println("Enter operation");
        char operation=scanner.next().charAt(0);
        System.out.println("Enter second num");
        int num2=scanner.nextInt();
        System.out.println("-".repeat(30));
        mathOperations(num1,operation,num2);
    }

    public static void mathOperations(int a , char operation,int b){
        switch (operation){
            case '+':{
                System.out.println(a+b);
                break;
            }
            case '-':{
                System.out.println(a-b);
                break;
            }
            case '*':{
                System.out.println(a*b);
                break;
            }
            case '/':{
                System.out.println(a/b);
                break;
            }
            default:{
                System.out.println("Invalid operation");
                break;
            }
        }
    }
}
