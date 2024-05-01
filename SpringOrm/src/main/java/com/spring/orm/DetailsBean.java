package com.spring.orm;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DetailsBean {
	
	     @Id
         private int id;
         private String name;
         private double salary;
         
         public DetailsBean()
         {
        	 super();
         }
         public DetailsBean(int id,String name,double salary)
         {
        	 super();
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
		@Override
		public String toString() {
			return "DetailsBean [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
         
}
