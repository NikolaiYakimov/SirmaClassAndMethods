package dev.Methods.exc5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter product");
        String product=scanner.nextLine();
        System.out.println("Enter quantity: ");
        int quantity=Integer.parseInt(scanner.nextLine());
        shopOrderCalc(product,quantity);
    }
    public static void shopOrderCalc(String product,int quantity){

        switch (product){
            case "coffee"->{
                System.out.println(1.50*quantity);
            }
            case "water"->{
                System.out.println(1.00*quantity);
            }
            case "coke"->{
                System.out.println(1.40*quantity);
            }
            case "snack"->{
                System.out.println(2.00*quantity);
            }
            default -> System.out.println("Invalid product");
        }
    }


}
