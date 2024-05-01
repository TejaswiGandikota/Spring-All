package com.mvn.Student.Student;

public class StudentInstance {
          int sId;
          String sName;
          String sCourse;
          String doj;
          String batch;
          public static void main(String[] args)
          {
        	  StudentInstance s = new StudentInstance();
        	  s.sId=101;
        	  s.sName="Tejaswi";
        	  s.sCourse="FullStackJava";
        	  s.doj="01-11-2023";
        	  s.batch="Batch-11";
        	  System.out.println("Id:" + s.sId);
        	  System.out.println("Name:" + s.sName);
        	  System.out.println("Course:" + s.sCourse);
        	  System.out.println("Date of Join:" + s.doj);
        	  System.out.println("Batch:" + s.batch);
          }
}
