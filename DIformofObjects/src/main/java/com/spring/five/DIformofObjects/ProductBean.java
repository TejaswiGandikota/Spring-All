package com.spring.five.DIformofObjects;

public class ProductBean {
      private int productid;
      private String productname;
      private double productprice;
      private int productquantity;
      public ProductBean()
      {
    	  
      }
      public ProductBean(int productid, String productname, double productprice, int productquantity)
      {
    	  this.productid = productid;
    	  this.productname = productname;
    	  this.productprice = productprice;
    	  this.productquantity = productquantity;
      }
      public void setProductid(int productid)
      {
    	  this.productid = productid;
      }
      public void setProductname(String productname)
      {
    	  this.productname = productname;
      }
      public void setProductprice(double productprice)
      {
    	  this.productprice = productprice;
      }
      public void setProductquantity(int productquantity)
      {
    	  this.productquantity = productquantity;
      }
      public int getProductid()
      {
    	  return this.productid;
      }
      public String getProductname()
      {
    	  return this.productname;
      }
      public double getProductprice()
      {
    	  return this.productprice;
      }
      public int getProductquantity()
      {
    	  return this.productquantity;
      }
}
