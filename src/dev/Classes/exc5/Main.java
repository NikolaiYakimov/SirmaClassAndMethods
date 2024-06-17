package dev.Classes.exc5;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage(50); // Initialize storage with capacity 1000

        Product product1 = new Product("cucumber", 1.5, 15); // totalCost = 500
        Product product2 = new Product("tomato", 0.90, 25); // totalCost = 200
        Product product3 = new Product("bread", 1.10, 8); // totalCost = 450

        storage.addProduct(product1);
        storage.addProduct(product2);
        storage.addProduct(product3);
        storage.getProducts();
        System.out.println(storage.getRemainCapacity());
        System.out.println(storage.totalCost());
    }
}
