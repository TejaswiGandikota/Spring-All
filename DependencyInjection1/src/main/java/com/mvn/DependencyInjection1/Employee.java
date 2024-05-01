package com.mvn.DependencyInjection1;

public class Employee {
        private String name;
        private double salary;
        private Details details;
        public Employee()
        {
        	
        }
        public Employee(String name, double salary,  Details details)
        {
        	this.name = name;
        	this.details = details;
        }
        public void setName(String name)
        {
        	this.name = name;
        }
        public void setDetails(Details details)
        {
        	this.details = details;
        }
        public void setSalary(double salary)
        {
        	this.salary = salary;
        }
        public String getName()
        {
        	return this.name;
        }
        public Details getDetails()
        {
        	return this.details;
        }
        public double getSalary()
        {
        	return this.salary;
        }
}
