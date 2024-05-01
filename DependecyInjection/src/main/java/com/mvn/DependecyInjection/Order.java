package com.mvn.DependecyInjection;

public class Order {
         private int orderId;
         private String orderName;
         private Product product;
			/*
			 * public Order() {
			 * 
			 * } public Order(int orderId, String orderName, Product product) { this.orderId
			 * = orderId; this.orderName = orderName; this.product = product; }
			 */
         
         public void setOrderid(int orderId)
         {
        	 this.orderId = orderId;
         }
         public void setOrdername(String orderName)
         {
        	 this.orderName = orderName;
         }
         public void setProduct(Product product)
         {
        	 this.product = product;
         }
         public int getOrderid()
         {
        	 return this.orderId;
         }
         public String getOrdername()
         {
        	 return this.orderName;
         }
         public Product getProduct()
         {
        	 return this.product;
         }
         
         public void print()
         {
				/*
				 * System.out.println(orderId); System.out.println(orderName);
				 */
        	 System.out.println(getOrderid());
        	 System.out.println(getOrdername());
        	 System.out.println(product.getProductid());
        	 System.out.println(product.getProductname());
        	 System.out.println(product.getPrice());
        	 
         }
}
