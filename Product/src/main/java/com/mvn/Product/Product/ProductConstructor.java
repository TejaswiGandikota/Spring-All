package com.mvn.Product.Product;

public class ProductConstructor {
        int pId;
        String pName;
        String brand;
        Double price;
        public ProductConstructor(int pId,String pName,String brand,Double price)
        {
        	this.pId=pId;
        	this.pName=pName;
        	this.brand=brand;
        	this.price=price;
        }
        public void print()
        {
        	System.out.println(pId);
        	System.out.println(pName);
        	System.out.println(brand);
        	System.out.println(price);
        }
}
