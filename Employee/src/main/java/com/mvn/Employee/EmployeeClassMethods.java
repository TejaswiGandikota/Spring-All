package com.mvn.Employee;

public class EmployeeClassMethods {
      int EmpId;
      String EmpName;
      public void insert(int id,String name) {
    	  EmpId = id;
    	  EmpName=name;
}
    	  public void print() {
    		  System.out.println(EmpId);
    		  System.out.println(EmpName);
    	  }
     }	  
