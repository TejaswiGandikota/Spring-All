package com.mvn.DependecyInjection;

public class Student {
          private String sName;
          private int sClass;
          private Marks marks;

			/*
			 * public Student() {
			 * 
			 * } public Student(String sName, int sClass, Marks marks) { this.sName = sName;
			 * this.sClass = sClass; this.marks = marks; }
			 */
          public void setSname(String sName)
          {
        	  this.sName = sName;
          }
          public void setSclass(int sClass)
          {
        	  this.sClass = sClass;
          }
          public String getSname()
          {
        	  return this.sName;
          }
          public int getSclass()
          {
        	  return this.sClass;
          }
          public void setMarks(Marks marks)
          {
        	  this.marks = marks;
          }
          public Marks getMarks()
          {
        	  return this.marks;
          }
}
