package com.mvn.Student.Student;

public class StudentConstructor {
       int sId;
       String sName;
       String sCourse;
       String doj;
       String batch;
       public StudentConstructor(int sId,String sName,String sCourse,String doj,String batch)
       {
    	   this.sId=sId;
    	   this.sName=sName;
    	   this.sCourse=sCourse;
    	   this.doj=doj;
    	   this.batch=batch;
       }
       public void print()
       {
    	   System.out.println(sId);
    	   System.out.println(sName);
    	   System.out.println(sCourse);
    	   System.out.println(doj);
    	   System.out.println(batch);
       }
}
