package dev.Methods.exc9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String inputType=scanner.next();
        switch (inputType){

            case "int"->{
                int a=scanner.nextInt();
                int b=scanner.nextInt();
                System.out.println(getMax(a,b));

            }
            case "char"->{
                char ch1=scanner.next().charAt(0);
                char ch2=scanner.next().charAt(0);
                System.out.println(getMax(ch1,ch2));
            }
            case "string"->{
                String name1=scanner.next();
                String name2=scanner.next();
                System.out.println(getMax(name1,name2));
            }

        }

    }

    public static int getMax(int a,int b){

        if(a>b){
            return  a;
        }else {
            return b;
        }
    }

    public static String getMax(String a,String b){
        if(a.compareTo(b)>0){
            return  a;
        }else {
            return b;
        }
    }

    public static char getMax(char a,char b){
        if(a>b){
            return  a;
        }else {
            return b;
        }
    }
}
