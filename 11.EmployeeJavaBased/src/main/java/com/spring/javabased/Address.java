package com.spring.javabased;

public class Address {
       private String city;
       private String colony;
       private String state;
       private int pincode;
       
       public Address()
       {
    	   super();
       }
       public Address(String city,String colony,String state,int pincode)
       {
    	   super();
    	   this.city = city;
    	   this.colony = colony;
    	   this.state = state;
    	   this.pincode = pincode;
       }
       
       public void setCity(String city)
       {
    	   this.city = city;
       }
       public void setColony(String colony)
       {
    	   this.colony = colony;
       }
       public void setState(String state)
       {
    	   this.state = state;
       }
       public void setPincode(int pincode)
       {
    	   this.pincode = pincode;
       }
       
       public String getcity()
       {
    	   return city;
       }
       public String getColony()
       {
    	   return colony;
       }
       public String getState()
       {
    	   return state;
    	   
       }
       public int getPincode()
       {
    	   return pincode;
       }
}
