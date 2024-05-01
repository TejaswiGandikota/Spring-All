package com.Student.Student1;

import com.Student.Student1.Interface.Student1Imp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		/*
		 * Student1 st = new Student1(37,"Tejaswi","Java","Batch-11","01-11-2023","Hyderabad");
		 * System.out.println(st.getRollno()); 
		 * System.out.println(st.getName());
		 * System.out.println(st.getCourse()); 
		 * System.out.println(st.getBatch());
		 * System.out.println(st.getDoj()); 
		 * System.out.println(st.getLocation());
		 * st.setRollno(1); 
		 * st.setCourse("Full Stack Java");
		 * System.out.println(st.getRollno()); 
		 * System.out.println(st.getName());
		 * System.out.println(st.getCourse()); 
		 * System.out.println(st.getBatch());
		 * System.out.println(st.getDoj()); 
		 * System.out.println(st.getLocation());
		 */
    	Student1Imp st = new Student1Imp(37,"Tejaswi","Java","Batch-11","01-11-2023","Hyderabad");
    	System.out.println("Student RollNo:" + st.getRollno());
    	System.out.println("Student Name:" + st.getName());
    	System.out.println("Student Course:" + st.getCourse());
    	System.out.println("Student Batch:" + st.getBatch());
    	System.out.println("Student DOJ:" + st.getDoj());
    	System.out.println("Student Location:" + st.getLocation());
    	
    	st.setRollno(1);
    	st.setName("Tejaswi Gandikota");
    	st.setCourse("Full Stack Java");
    	st.setLocation("Vizag");
    	st.setDoj("02-12-2023");
    	
    	System.out.println("\nUpdated Information:-");
    	
    	System.out.println("Student RollNo:" + st.getRollno());
    	System.out.println("Student Name:" + st.getName());
    	System.out.println("Student Course:" + st.getCourse());
    	System.out.println("Student Batch:" + st.getBatch());
    	System.out.println("Student DOJ:" + st.getDoj());
    	System.out.println("Student Location:" + st.getLocation());
    }
}
