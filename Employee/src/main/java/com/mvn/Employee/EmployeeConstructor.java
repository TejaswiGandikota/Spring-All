package com.mvn.Employee;

public class EmployeeConstructor {
         int empId;
         String empName;
         String course;
         public EmployeeConstructor(int empId,String empName,String course) {
        	 this.empId = empId;
        	 this.empName = empName;
        	 this.course = course;
         }
         public void print()
         {
        	 System.out.println("Emp Id:" + empId);
        	 System.out.println("Emp Name:" + empName);
        	 System.out.println("Course:" + course);
         }
}
