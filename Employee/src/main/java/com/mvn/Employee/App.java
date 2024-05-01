
  package com.mvn.Employee;
  
  public class App { 
	  public static void main( String[] args )
	  {
			/*
			 * EmployeeClassMethods emp = new EmployeeClassMethods();
			 * emp.insert(101,"Tejaswi"); emp.print();
			 */
		  /*EmployeeConstructor empC= new EmployeeConstructor(101,"Tejaswi","FullStackJava");
		  empC.print();*/
		  EmployeeSetter e = new EmployeeSetter();
		  e.setId(101);
		  e.setName("Tejaswi");
		  e.setCourse("FullStackJava");
		  System.out.println(e.getId());
		  System.out.println(e.getName());
		  System.out.println(e.getCourse());
  }
	  }
 
