package com.mvn.Product.Product;

public class ProductClassMethods {
        int pId;
        String pName;
        String brand;
        Double price;
        public void insert(int id,String name,String brands,Double prices)
        {
        	pId = id;
        	pName = name;
        	brand = brands;
        	price = prices;
        }
        public void print()
        {
        	System.out.println(pId);
        	System.out.println(pName);
        	System.out.println(brand);
        	System.out.println(price);
        }
}
