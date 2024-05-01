package com.Product.Product1;

import com.Product.Product1.Interface.Product1Imp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
		/*
		 * Product1 p = new Product1(1,"Lipstick","Lakme",980.50);
		 * System.out.println("Product Id:" + p.getId());
		 * System.out.println("Product Name:" + p.getName());
		 * System.out.println("Product Brand:" + p.getBrand());
		 * System.out.println("Product Price:" + p.getPrice());
		 * 
		 * p.setId(101); p.setName("Foundation"); p.setBrand("Glowhouse");
		 * p.setPrice(850.0);
		 * 
		 * System.out.println("\nUpdated the details of the product");
		 * System.out.println("Product Id:" + p.getId());
		 * System.out.println("Product Name:" + p.getName());
		 * System.out.println("Product Brand:" + p.getBrand());
		 * System.out.println("Product Price:" + p.getPrice());
		 */
    	Product1Imp p = new Product1Imp(1,"Lipstick","Lakme",990.55);
    	System.out.println("Product Id:" + p.getId());
    	System.out.println("Product Name:"+ p.getName());
    	System.out.println("Product Brand:" + p.getBrand());
    	System.out.println("Product Price:" + p.getPrice());
    	
    	p.setId(101);
    	p.setName("Foundation");
    	p.setBrand("Glowhouse");
    	p.setPrice(880.0);
    	
    	System.out.println("\nUpdated the product details:");
    	System.out.println("Product Id:" + p.getId());
    	System.out.println("Product Name:"+ p.getName());
    	System.out.println("Product Brand:" + p.getBrand());
    	System.out.println("Product Price:" + p.getPrice());
    }
}
