package dev.Classes.exc5;

public class Product {
    private String name;
    private double price;
    private  int quantity;

    public Product(String name,double price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;

    }

    public double totalCostOfProducts(double price,int quantity){
        return price*quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String toJson() {
        return String.format("{\"name\":\"%s\", \"price\":%.2f, \"quantity\":%d, \"totalCost\":%.2f}",
                name, price, quantity, totalCostOfProducts(price,quantity));
    }
}
