package com.mvn.Employee;

public class EmployeeSetter {
       int empId;
       String empName;
       String course;
       public void setId(int empId)
       {
    	    this.empId = empId;
       }
       public int getId() {
    	   return empId;
       }
       public void setName(String empName)
       {
    	   this.empName = empName;
       }
       public String getName()
       {
    	   return empName;
       }
       public void setCourse(String course)
       {
    	   this.course = course;
       }
       public String getCourse()
       {
    	   return course;
       }
}
