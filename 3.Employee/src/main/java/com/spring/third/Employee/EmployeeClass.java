package com.spring.third.Employee;

public class EmployeeClass {
        private String name;
        private int id;
        private double salary;
        private int deptno;
        private String doj;
        public EmployeeClass()
        {
        	super();
        }
        public EmployeeClass(String name, int id, double salary, int deptno, String doj)
        {
        	super();
        	this.name = name;
        	this.id = id;
        	this.salary = salary;
        	this.deptno = deptno;
        	this.doj = doj;
        }
        public void setName(String name)
        {
        	this.name = name;
        }
        public void setId(int id)
        {
        	this.id = id;
        }
        public void setSalary(double salary)
        {
        	this.salary = salary;
        }
        public void setDeptno(int deptno)
        {
        	this.deptno = deptno;
        }
        public void setDoj(String doj)
        {
        	this.doj = doj;
        }
        public String getName()
        {
        	return this.name;
        }
        public int getId()
        {
        	return this.id;
        }
        public double getSalary()
        {
        	return this.salary;
        }
        public int getDeptno()
        {
        	return this.deptno;
        }
        public String getDoj()
        {
        	return this.doj;
        }
        public void print()
        {
        	System.out.println("Employee Details: ");
        	System.out.println("Employee Name: " + name);
        	System.out.println("Employee Id:" + id);
        	System.out.println("Employee Salary:" + salary);
        	System.out.println("Employee Deptno:" + deptno);
        	System.out.println("Employee DOJ:" + doj);
        }
}
