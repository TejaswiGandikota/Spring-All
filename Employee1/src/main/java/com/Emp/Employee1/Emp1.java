package com.Emp.Employee1;

public class Emp1 {
     private String name;
     private int age;
     private double salary;
     
     // Default constructor
     public Emp1()
     {
    	 // Initialize default values if needed
     }
     
     // Parameterized constructor
     public Emp1(String name, int age, double salary)
     {
    	 this.name = name;
    	 this.age = age;
    	 this.salary = salary;
     }
     // setter methods
     public void setName(String name)
     {
    	 this.name = name;
     }
     public void setAge(int age)
     {
    	 this.age = age;
     }
     public void setSalary(double salary)
     {
    	 this.salary = salary;
     }
     //Getter methods
     public String getName()
     {
    	 return this.name;
     }
     public int getAge()
     {
    	 return this.age;
     }
     public double getSalary()
     {
    	 return this.salary;
     }
}
