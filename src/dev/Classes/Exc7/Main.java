package dev.Classes.Exc7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Students> students= new ArrayList<>();
        while(true){
            String input=scanner.nextLine().trim();
            if(input.equals("end"))
                break;

            String[] words=input.split(" ");
            if(words.length!=4){
                System.out.println("Invalid output");
                continue;
            }
            String firstName=words[0];
            String lastName=words[1];
            int age=Integer.parseInt(words[2]);
            String hometown=words[3];
            students.add(new Students(firstName,lastName,age,hometown));
        }
        String town=scanner.nextLine().trim();

        for(Students student:students){
            if(student.getHomeTown().equalsIgnoreCase(town)){
                System.out.println(student.getFirstName()+" "+student.getLastName()+" is "+student.getAge()+" years old");
            }
        }
    }
}
