package com.spring.eight;
import java.util.*;
public class AmeerpetTechnologies {
         private Map<String,String>studentcourses;
         public AmeerpetTechnologies()
         {
        	 
         }
         public AmeerpetTechnologies(Map<String,String>studentcourses)
         {
        	 this.studentcourses = studentcourses;
         }
         public void setStudentcourses(Map<String,String> studentcourses)
         {
        	 this.studentcourses = studentcourses;
         }
         public Map<String,String> getStudentcourses()
         {
        	 return this.studentcourses;
         }
         public void print()
         {
        	 System.out.println("Student Courses:");
        	
        	 for(Map.Entry<String, String> entry: studentcourses.entrySet())
        	 {
        		 System.out.println(entry.getKey()+ ":" + entry.getValue());
        	 }
        	
         }
}
