package com.spring.javabased;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
       @Bean
	public ProductBean getProduct()
	{
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Enter Id:");
    	int id = scan.nextInt();
    	
    	System.out.println("Enter Name:");
    	String name = scan.next();
    	
    	System.out.println("Enter Quantity:");
    	int quantity = scan.nextInt();
    	
    	System.out.println("Enter Price:");
    	double price = scan.nextDouble();
    	
    	ProductBean pb = new ProductBean(id,name,quantity,price);
		return pb;
		
	}
}
