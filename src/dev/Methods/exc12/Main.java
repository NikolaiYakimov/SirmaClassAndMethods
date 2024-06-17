package dev.Methods.exc12;

import java.awt.image.ComponentSampleModel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String password=scanner.nextLine();
        validatePassword(password);
    }

    private static void validatePassword(String password){
        boolean isValid=true;

        if(!(password.length()>=6&&password.length()<=10)){
            System.out.println("Password need to be between 6 and 10 charct.");
            isValid=false;
        }
        if(!(isNumericOrAlh(password))){
            System.out.println("Password need to contain only letters or numbers");
            isValid=false;
        }
        if(!hadTwoDigitsAtLeast(password)){
            System.out.println("Password must have at least 2 digits");
            isValid=false;
        }
        if(isValid){
            System.out.println("The password is valid");
        }

    }

    private static boolean isNumericOrAlh(String password){
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(!Character.isLetterOrDigit(ch))
                return false;
        }
        return true;
    }

    private static boolean hadTwoDigitsAtLeast(String password){
        int count=0;
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(Character.isDigit(ch))
                count++;
        }
        return count>=2;
    }

}
