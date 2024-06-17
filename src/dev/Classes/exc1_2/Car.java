package dev.Classes.exc1_2;

public class Car {
    //Exc1

    private String brand;
    private String model;
    private int horsePower;

    public  Car(String brand,String model,int horsePower){
        this.brand=brand;
        this.model=model;
        this.horsePower=horsePower;
    }
    //Exc2
    public Car(String brand){
        this(brand,"unknown",-1);
    }
    public Car(String brand,int horsePower){
        this(brand,"unknown",horsePower);
    }
    public Car(String brand,String model){
        this(brand,model,-1);
    }
    public void setBrand(String brand){
        this.brand=brand;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String carInfo(){
        return "Info: The car is: "+brand+" " + model+ " - " +horsePower+" HP";
    }
}
