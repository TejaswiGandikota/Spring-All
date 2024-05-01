package com.spring.eight.PropertyInterface;
import java.util.*;
public class AmeerpetTechnologies {
         private Properties studentbatches;
         public AmeerpetTechnologies()
         {
        	 
         }
         public AmeerpetTechnologies(Properties studentbatches)
         {
        	 this.studentbatches = studentbatches;
         }
         public void setStudentbatches(Properties studentbatches)
         {
        	 this.studentbatches = studentbatches;
         }
         public Properties getStudentbatches()
         {
        	 return this.studentbatches;
         }
         public void print()
         {
        	 Set<String> keys=studentbatches.stringPropertyNames();
        	 for(String key:keys)
        	 {
        		 System.out.println(key + ":" + studentbatches.getProperty(key));
        	 }
         }
}
