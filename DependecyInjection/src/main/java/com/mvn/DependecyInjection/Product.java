package com.mvn.DependecyInjection;

public class Product {
         private int productId;
         private String productName;
         private double price;

			/*
			 * public Product() {
			 * 
			 * } public Product(int productId, String productName, double price) {
			 * this.productId = productId; this.productName = productName; this.price =
			 * price; }
			 */
         public void setProductid(int productId)
         {
        	 this.productId = productId;
         }
         
         public void setProductname(String productName)
         {
        	 this.productName = productName;
         }
         public void setPrice(double price)
         {
        	 this.price = price;
         }
         public int getProductid()
         {
        	 return this.productId;
         }
         public String getProductname()
         {
        	 return this.productName;
         }
         public double getPrice()
         {
        	 return this.price;
         }
}
