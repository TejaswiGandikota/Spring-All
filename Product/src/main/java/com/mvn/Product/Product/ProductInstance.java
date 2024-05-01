package com.mvn.Product.Product;

public class ProductInstance {
     int pId;
     String pName;
     String brand;
     Double price;
     public static void main(String[] args)
     {
    	 ProductInstance p = new ProductInstance();
    	 p.pId=101;
    	 p.pName="Frock";
    	 p.brand="Aavasa";
    	 p.price=799.0;
    	 System.out.println("Product Id:" + p.pId);
    	 System.out.println("Product Name:" + p.pName);
    	 System.out.println("Brand:" + p.brand);
    	 System.out.println(p.price);
     }
}
