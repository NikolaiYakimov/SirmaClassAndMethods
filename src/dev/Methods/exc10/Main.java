package dev.Methods.exc10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        System.out.println(multEvenByOdd(number));
    }

    public static int multEvenByOdd(int number){
        int sumEven=0;
        int sumOdd=0;
        while(number>0){
            int digit=number%10;
            if(digit%2==0)
                sumEven+=digit;
            else
                sumOdd+=digit;
            number/=10;
        }
        return sumEven*sumOdd;
    }
}
