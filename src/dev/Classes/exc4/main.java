package dev.Classes.exc4;

public class main {
    public static void main(String[] args) {
        Engine engine=new Engine(100);
        var vehicle=new Vehicle("Ferari","F90",engine,200);
        vehicle.drive(100);
        System.out.println(vehicle.getFuel() );
    }
}
