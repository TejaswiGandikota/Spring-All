package com.spring.fourth.StudentConstructorInjection;

public class StudentBean {
         private int id;
         private String name;
         private String course;
         private String batch;
         private String location;
         public StudentBean()
         {
        	 
         }
         public StudentBean(int id, String name, String course, String batch, String location)
         {
        	 
        	 this.id = id;
        	 this.name = name;
        	 this.course = course;
        	 this.batch = batch;
        	 this.location = location;
         }
         
         public void setId(int id)
         {
        	 this.id = id;
         }
         public void setName(String name)
         {
        	 this.name = name;
         }
         public void setCourse(String course)
         {
        	 this.course = course;
         }
         public void setBatch(String batch)
         {
        	 this.batch = batch;
         }
         public void setLocation(String location)
         {
        	 this.location = location;
         }
         public int getId()
         {
        	 return this.id;
         }
         public String getName()
         {
        	 return this.name;
         }
         public String getCourse()
         {
        	 return this.course;
         }
         public String getBatch()
         {
        	 return this.batch;
         }
         public String getLocation()
         {
        	 return this.location;
         }
         public void print()
         {
        	 System.out.println("Student ID:" + id);
        	 System.out.println("Student Name:" + name);
        	 System.out.println("Student Course:" + course);
        	 System.out.println("Student Batch:" + batch);
        	 System.out.println("Student Location:" + location);
         }
}
