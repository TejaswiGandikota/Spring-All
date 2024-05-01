package com.spring.annotationbased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("1")
        private int id;
	@Value("Tejaswi")
        private String name;
	@Value("Batch-11")
        private String batch;
	@Value("Java Full Stack")
        private String course;
        
        public Student()
        {
        	super();
        }
        public Student(int id, String name, String batch, String course)
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
        	this.batch = batch;
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
        
        public void print()
        {
        	System.out.println("Student Id:" + id );
        	System.out.println("Student Name:" + name);
        	System.out.println("Student Batch:" + batch);
        	System.out.println("Student Course:" + course);
        }
}
