package com.spring.javabased;

public class Employee {
        private int id;
        private String name;
        private Address address;
        
        public Employee()
        {
        	super();
        }
        public Employee(int id, String name, Address address)
        {
        	super();
        	this.id = id;
        	this.name = name;
        	this.address = address;
        }
        
        public void setId(int id)
        {
        	this.id = id;
        }
        public void setName(String name)
        {
        	this.name = name;
        }
        public void setAddress(Address address)
        {
        	this.address = address;
        }
        
        public int getId()
        {
        	return id;
        }
        public String getName()
        {
        	return name;
        }
        public Address getAddress()
        {
        	return address;
        }
        
        public void display()
        {
        	System.out.println("Employee Details:");
        	System.out.println("Emp Id:"+ id);
        	System.out.println("Emp Name:" + name);
        	System.out.println("Emp City:" + address.getcity());
        	System.out.println("Emp Colony:" + address.getColony());
        	System.out.println("Emp State:" + address.getState());
        	System.out.println("Emp pincode:" + address.getPincode());
        }
}
