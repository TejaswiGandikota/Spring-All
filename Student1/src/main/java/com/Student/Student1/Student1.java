package com.Student.Student1;

public class Student1 {
     private int rollno;
     private String name;
     private String course;
     private String batch;
     private String doj;
     private String location;

		/*
		 * public Student1() {
		 * 
		 * }
		 */
     public Student1(int rollno, String name, String course, String batch, String doj, String location)
     {
    	 this.rollno = rollno;
    	 this.name = name;
    	 this.course = course;
    	 this.batch = batch;
    	 this.doj = doj;
    	 this.location = location;
     }
     public void setRollno(int rollno)
     {
    	 this.rollno = rollno;
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
     public void setDoj(String doj)
     {
    	 this.doj = doj;
     }
     public void setLocation(String location)
     {
    	 this.location = location;
     }
     public int getRollno()
     {
    	 return this.rollno;
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
     public String getDoj()
     {
    	 return this.doj;
     }
     public String getLocation()
     {
    	 return this.location;
     }
}
