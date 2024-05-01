package com.mvn.Student.Student;

public class StudentSetter {
       int sId;
       String sName;
       String sCourse;
       String doj;
       String batch;
       public void setId(int sId)
       {
    	   this.sId = sId;
       }
       public int getId()
       {
    	   return sId;
       }
       public void setName(String sName)
       {
    	   this.sName = sName;
       }
       public String getName()
       {
    	   return sName;
       }
       public void setCourse(String sCourse)
       {
    	   this.sCourse = sCourse;
       }
       public String getCourse()
       {
    	   return sCourse;
       }
       public void setDoj(String doj)
       {
    	   this.doj = doj;
       }
       public String getDoj()
       {
    	   return doj;
       }  
       public void setBatch(String batch)
       {
    	   this.batch = batch;
       }
       public String getBatch()
       {
    	   return batch;
       }
}
