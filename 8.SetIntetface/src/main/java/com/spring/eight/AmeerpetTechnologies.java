package com.spring.eight;

import java.util.Set;

public class AmeerpetTechnologies {
          private Set<Integer>studentrollnumbers;
          public AmeerpetTechnologies()
          {
        	  
          }
          public AmeerpetTechnologies(Set<Integer> studentrollnumbers)
          {
        	  this.studentrollnumbers = studentrollnumbers;
          }
          public void setStudentrollnumbers(Set<Integer> studentrollnumbers)
          {
        	  this.studentrollnumbers = studentrollnumbers;
          }
          public Set<Integer> getStudentrollnumbers()
          {
        	  return this.studentrollnumbers;
          }
          public void print()
          {
        	  System.out.println("Student Roll Numbers:");
        	  for(Integer rollnumbers:studentrollnumbers)
        	  {
        		  System.out.println(rollnumbers);
        	  }
          }
}
