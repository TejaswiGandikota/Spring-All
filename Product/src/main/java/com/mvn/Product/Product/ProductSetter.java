package com.mvn.Product.Product;

public class ProductSetter {
     int pId;
     String pName;
     String brand;
     Double price;
     public void setId(int pId)
     {
    	 this.pId = pId;
     }
     public int getId()
     {
    	 return pId;
     }
     public void setName(String pName)
     {
    	 this.pName = pName;
     }
     public String getName()
     {
    	 return pName;
     }
     public void setBrand(String brand)
     {
    	 this.brand = brand;
     }
     public String getBrand()
     {
    	 return brand;
     }
     public void setPrice(Double price)
     {
    	 this.price = price;
     }
     public Double getPrice()
     {
    	 return price;
     }
}
