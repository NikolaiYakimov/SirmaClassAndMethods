package dev.Classes.exc5;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private static int capacity;
     private List <Product> products;

     public Storage(int capacityOfStorage){
         capacity=capacityOfStorage;
         products=new ArrayList<>();
     }

     public double totalCost(){
         double sum=0;
         for(var product :products){
             sum+=product.totalCostOfProducts(product.getPrice(),product.getQuantity());
         }
         return sum;
     }

     public void addProduct(Product product){
         if(product!=null){
             if(capacity>0) {
                 products.add(product);
                 capacity-=product.getQuantity();
             }
             else
                 System.out.println("We dont have capacity");
         }else{
             System.out.println("We dont have this item");
         }
     }

     public void  getProducts(){
        StringBuilder sb=new StringBuilder();
        for(var product:products){
            sb.append(product.toJson()).append("\n");
        }
         System.out.println(sb);
     }

     public double getRemainCapacity(){
         return capacity;
     }
}
