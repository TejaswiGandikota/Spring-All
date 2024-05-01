package com.mvn.DependencyInjection1;

public class Company {
      private String Cname;
      private Employee employee;
      public Company()
      {
    	  
      }
      public Company(String Cname, Employee employee)
      {
    	  this.Cname = Cname;
    	  this.employee = employee;
      }
      public void setEmployee(Employee employee)
      {
    	  this.employee = employee;
      }
      public Employee getEmployee()
      {
    	  return this.employee;
      }
      public void print()
      {
    	  System.out.println("Company Name:" + Cname);
    	  System.out.println("Employee Name:" + employee.getName());
    	  System.out.println("Employee Salary:" + employee.getSalary()); 
    	  System.out.println("Empployee Education:" + employee.getDetails().getEducation());
    	  System.out.println("Employee Location: "+ employee.getDetails().getLocation());
      }
}
