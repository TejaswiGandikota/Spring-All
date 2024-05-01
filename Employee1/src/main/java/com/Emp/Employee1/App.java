package com.Emp.Employee1;
import com.Emp.Employee1.Interface.Emp1Imp;

public class App 
{
    public static void main( String[] args )
    {
    	//create an emp object using parameterized constructor
		/*
		 * Emp1 emp = new Emp1("Tejaswi", 21 ,45000.00);
		 *  System.out.println("Name:" + emp.getName());
		 *  System.out.println("Age:" + emp.getAge());
		 * System.out.println("Salary:" + emp.getSalary());
		 */
        
        //updating employee details using setter methods
		/*
		 * emp.setName("Tejaswi Gandikota"); 
		 * emp.setAge(22); 
		 * emp.setSalary(50000.0);
		 */
        
		/*
		 * System.out.println("Updated Employee Details"); 
		 * System.out.println("Name:" + emp.getName()); 
		 * System.out.println("Age:" + emp.getAge());
		 * System.out.println("Salary:" + emp.getSalary());
		 */    
    	Emp1Imp emp1 = new Emp1Imp("Tejaswi",21,45000.0);
    	System.out.println("Employee Name:" + emp1.getName());
    	System.out.println("Employee Age:" + emp1.getAge());
    	System.out.println("Employee Salary:" + emp1.getSalary());
    	
    	emp1.setName("Tejaswi Gandikota");
    	emp1.setAge(22);
    	emp1.setSalary(50000.0);
    	
    	System.out.println("\n Updated Employee Details:");
    	System.out.println("Employee Name:" + emp1.getName());
    	System.out.println("Employee Age:" + emp1.getAge());
    	System.out.println("Employee Salary:" + emp1.getSalary());
    	
    }
}
