package com.spring.eight;
import java.util.*;
public class Employee {
       private List<String> empname;
       private Set<Integer> empnum;
       private Map<String,Integer> empdeptno;
       private Properties empsalary;
       public Employee()
       {
    	   
       }
       public Employee(List<String> empname, Set<Integer> empnum, Map<String, Integer> empdeptno, Properties empsalary)
       {
    	   this.empname = empname;
    	   this.empnum = empnum;
    	   this.empdeptno = empdeptno;
    	   this.empsalary = empsalary;
       }
      public void setEmpname(List<String> empname)
      {
    	  this.empname = empname;
      }
      public void setEmpnum(Set<Integer> empnum)
      {
    	  this.empnum = empnum;
      }
      public void setEmpdeptno(Map<String, Integer> empdeptno)
      {
    	  this.empdeptno = empdeptno;
      }
      public void setEmpsalary(Properties empsalary)
      {
    	  this.empsalary = empsalary;
      }
      public List<String> getEmpname()
      {
    	  return this.empname;
      }
      public Set<Integer> getEmpnum()
      {
    	  return this.empnum;
      }
      public Map<String, Integer> getEmpdeptno()
      {
    	  return this.empdeptno;
      }
      public Properties getEmpsalary()
      {
    	  return this.empsalary;
      }
      public void print()
      {
    	  System.out.println("Employee Names:");
    	  for(String names:empname)
    	  {
    		  System.out.println(names);
    	  }
    	  System.out.println("Employee Numbers:");
    	  for(Integer nums:empnum)
    	  {
    		  System.out.println(nums);
    	  }
    	  System.out.println("Employee Dept Nums:");
    	  for(Map.Entry<String, Integer> entry: empdeptno.entrySet())
    	  {
    		  System.out.println(entry.getKey()+":"+entry.getValue());
    	  }
    	  System.out.println("Employee Salary:");
    	  Set<String> keys=empsalary.stringPropertyNames();
    	  for(String key:keys)
    	  {
    		  System.out.println(key + ":" + empsalary.getProperty(key));
    	  }
    	  
      }
}
