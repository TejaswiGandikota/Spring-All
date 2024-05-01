package com.spring.javabased;

public class ProductBean {
         private int pid;
         private String pname;
         private int quantity;
         private double price;
         
         public ProductBean()
         {
        	 super();
         }
         public ProductBean(int pid, String pname, int quantity, double price)
         {
        	 super();
        	 this.pid = pid;
        	 this.pname = pname;
        	 this.quantity = quantity;
        	 this.price = price;
         }
         
         public void setPid(int pid)
         {
        	 this.pid = pid;
         }
         public void setPname(String pname)
         {
        	 this.pname = pname;
         }
         public void setQuantity(int quantity)
         {
        	 this.quantity = quantity;
         }
         public void setPrice(double price)
         {
        	 this.price = price;
         }
         
         public int getPid()
         {
        	 return pid;
         }
         public String getPname()
         {
        	 return pname;
         }
         public int getQuantity()
         {
        	 return quantity;
         }
         public double getPrice()
         {
        	 return price;
         }
         
         public void print()
         {
        	 double total = price*quantity;
        	 System.out.println("total:" + total);
        	 double discount = 0.0;
        	 
        	 if(total<3000)
        	 {
        		 discount = (total*10)/100;
        	 }
        	 else if(total<=3000 && total>1000)
        	 {
        		 discount = (total*15)/100;
        	 }
        	 else
        	 {
        		 discount = (total*20)/100;
        		 System.out.println("Discount:" + discount);
        	 }
        	 
        	 double invoice = total-discount;
        	 System.out.println("invoice:" + invoice);
         }
}
