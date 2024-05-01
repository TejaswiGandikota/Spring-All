package com.mvn.Employee;

public class Employee {
       int EmpId;
       String EmpName;
       public static void main(String[] args) {
    	   Employee e = new Employee();
    	   e.EmpId=101;
    	   String name=e.EmpName="Teju";
    	   System.out.println(e.EmpId);
    	   System.out.println(name);
       }
}
