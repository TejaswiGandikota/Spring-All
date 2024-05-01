package com.spring.six.AddressDIObjects;

public class AddressBean {
	 private String housenum;
     private String city;
     private String state;
     private int pincode;
     public AddressBean()
     {
    	 
     }
     public AddressBean(String housenum, String city, String state, int pincode)
     {
    	 this.housenum = housenum;
    	 this.city = city;
    	 this.state = state;
    	 this.pincode = pincode;
     }
     public void setHousenum(String housenum)
     {
    	 this.housenum = housenum;
     }
     public void setCity(String city)
     {
    	 this.city = city;
     }
     public void setState(String state)
     {
    	 this.state = state;
     }
     public void setPincode(int pincode)
     {
    	 this.pincode = pincode;
     }
     public String getHousenum()
     {
    	 return this.housenum;
     }
     public String getCity()
     {
    	 return this.city;
     }
     public String getState()
     {
    	 return this.state;
     }
     public int getPincode()
     {
    	 return this.pincode;
     }
}  
