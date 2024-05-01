package com.spring.javabased;

public class StudentBean {
        private int id;
        private String name;
        private String batch;
        private String course;
        
        public StudentBean()
        {
        	super();
        }
        public StudentBean(int id,String name,String batch,String course)
        {
        	super();
        	this.id = id;
        	this.name = name;
        	this.batch = batch;
        	this.course = course;
        }
        
        public void setId(int id)
        {
        	this.id = id;
        }
        public void setName(String name)
        {
        	this.name = name;
        }
        public void setBatch(String batch)
        {
        	this.batch =batch;
        }
        public void setCourse(String course)
        {
        	this.course = course;
        }
        
        public int getId()
        {
        	return id;
        }
        public String getName()
        {
        	return name;
        }
        public String getBatch()
        {
        	return batch;
        }
        public String getCourse()
        {
        	return course;
        }
        
        public void display()
        {
        	System.out.println("Student details are:");
        	System.out.println("Id:" + id);
        	System.out.println("Name:" + name);
        	System.out.println("Batch:" + batch);
        	System.out.println("Course:" + course);
        }
}
