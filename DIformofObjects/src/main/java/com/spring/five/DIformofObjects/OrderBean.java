package com.spring.five.DIformofObjects;

public class OrderBean {
         private int orderid;
         private ProductBean product;
         public OrderBean()
         {
        	 
         }
         public OrderBean(int orderid, ProductBean product)
         {
        	 this.orderid = orderid;
        	 this.product = product;
         }
        
         public void setProduct(ProductBean product)
         {
        	 this.product = product;
         }
         public void setOrderid(int orderid)
         {
        	 this.orderid = orderid;
         }
         public ProductBean getProduct()
         {
        	 return this.product;
         }
         public int getOrderid()
         {
        	 return this.orderid;
         }
         public void print()
         {
        	 System.out.println("Order Id:" + getOrderid());
        	 System.out.println("Product ID:" + product.getProductid());
        	 System.out.println("Product Name:" + product.getProductname());
        	 System.out.println("Product Price:" + product.getProductprice());
        	 System.out.println("Product Quantity:" + product.getProductquantity());
         }
}
