package dev.Methods.exc4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String operation=scanner.nextLine();
        int number1=Integer.parseInt(scanner.nextLine());
        int number2=Integer.parseInt(scanner.nextLine());
        calculator(operation,number1,number2);
    }

    public static void calculator(String operation,int number1,int number2){
         switch (operation) {
            case "add" -> {
                System.out.println(addOperation(number1, number2));
                break;
            }
            case "multiply" -> {
                System.out.println(multiplyOperation(number1, number2));
                break;
            }
            case "subtract" -> {
                System.out.println(subtractOperation(number1, number2));
                break;
            }
            case "divide" -> {
                System.out.println(divideOperation(number1, number2));
                break;
            }
            default -> {
                System.out.println("Invalid operation");
            }
        }
    }

    public static int addOperation(int number1,int number2){
        return number1+number2;
    }
    public static int multiplyOperation(int number1,int number2){
        return number1*number2;
    }
    public static int subtractOperation(int number1,int number2){
        return number1-number2;
    }
    public static int divideOperation(int number1,int number2){
        return number1/number2;
    }
}
