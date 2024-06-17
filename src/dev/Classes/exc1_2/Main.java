package dev.Classes.exc1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOfCars=Integer.parseInt(scanner.nextLine());
        List<Car> carList=new ArrayList<>();
        for(int i=0;i<numberOfCars;i++){
            System.out.println("Enter car info:");
            String info=scanner.nextLine();
            String[] infoParts=info.split(" ");
            switch(infoParts.length){
                case 1:{
                    carList.add(new Car(infoParts[0]));
                    break;
                }
                case 2:{
                    carList.add(new Car(infoParts[0],infoParts[1]));
                    break;
                }
                case 3:{
                    carList.add(new Car(infoParts[0],infoParts[1],Integer.parseInt(infoParts[2])));
                    break;
                }
            }
        }


        for(int i=0;i<numberOfCars;i++){
            System.out.println(carList.get(i).carInfo());
        }

        Car car=new Car("Ferrari","F90",560);
        System.out.println(car.carInfo());
    }
}