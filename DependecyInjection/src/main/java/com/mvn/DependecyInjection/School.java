 package com.mvn.DependecyInjection;

public class School {
         private String schoolName;
         private Student student;

			/*
			 * public School() {
			 * 
			 * } public School(String schoolName, Student student) { this.schoolName =
			 * schoolName; this.student = student; }
			 */
         public void setSchoolname(String schoolName)
         {
        	 this.schoolName = schoolName;
         }
         public String getSchoolname()
         {
        	 return this.schoolName;
         }
         public void setStudent(Student student)
         {
        	 this.student = student;
         }
         public Student getStudent()
         {
        	 return this.student;
         }
         public void print()
         {
				/*
				 * System.out.println("School Name:" + schoolName);
				 * System.out.println("Student Details:"); 
				 * System.out.println("Student Name:" + student.getSname()); 
				 * System.out.println("Student Class:" + student.getSclass()); 
				 * System.out.println("Marks in Maths:" + student.getMarks().getMaths()); 
				 * System.out.println("Marks in Physics:" + student.getMarks().getPhysics()); 
				 * System.out.println("Marks in Chemistry:" + student.getMarks().getChemistry());
				 */
        	 System.out.println("School Name:" + getSchoolname());
			 System.out.println("Student Details:"); 
			 System.out.println("Student Name:" + student.getSname()); 
			 System.out.println("Student Class:" + student.getSclass()); 
			 System.out.println("Marks in Maths:" + student.getMarks().getMaths()); 
			 System.out.println("Marks in Physics:" + student.getMarks().getPhysics()); 
			 System.out.println("Marks in Chemistry:" + student.getMarks().getChemistry());
         }
}
