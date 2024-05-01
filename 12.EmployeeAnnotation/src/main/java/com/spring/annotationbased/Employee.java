package com.spring.annotationbased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
       @Value("101")
	   private int id;
       @Value("Tejaswi")
	   private String name;
       @Value("50000.0")
	   private double salary;
       @Value("Hyderabad")
	   private String location;
       
       public Employee()
       {
    	   super();
       }
       public Employee(int id, String name, double salary, String location)
       {
    	   super();
    	   this.id = id;
    	   this.name = name;
    	   this.salary = salary;
    	   this.location = location;
       }
       
       public void setId(int id)
       {
    	   this.id = id;
       }
       public void setName(String name)
       {
    	   this.name = name;
       }
       public void setSalary(double salary)
       {
    	   this.salary = salary;
       }
       public void setLocation(String location)
       {
    	   this.location = location;
       }
       
       public int getId()
       {
    	   return id;
       }
       public String getName()
       {
    	   return name;
       }
       public double getSalary()
       {
    	   return salary;
       }
       public String getLocation()
       {
    	   return location;
       }
       
       public void print()
       {
    	   System.out.println("Employee Details:");
    	   System.out.println("\nEmployee Id:" + id);
    	   System.out.println("Employee Name:" + name);
    	   System.out.println("Employee Salary:" + salary);
    	   System.out.println("Employee Location:" + location);
       }
}