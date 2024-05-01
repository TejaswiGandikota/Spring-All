package com.mvn.Student.Student;

public class StudentClassMethods {
        int Id;
        String Name;
        String Course;
        String Doj;
        String Batch;
        public void insert(int id,String name,String course,String doj,String batch)
        {
        	Id = id;
        	Name = name;
        	Course = course;
        	Doj = doj;
        	Batch = batch;
        }
        public void print()
        {
        	System.out.println(Id);
        	System.out.println(Name);
        	System.out.println(Course);
        	System.out.println(Doj);
        	System.out.println(Batch);
        }
}
