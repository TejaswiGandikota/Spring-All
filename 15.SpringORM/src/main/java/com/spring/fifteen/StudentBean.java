package com.spring.fifteen;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentBean {
	     @Id
         private int id;
         private String name;
         private String course;
         
         public StudentBean()
         {
        	 super();
         }
         public StudentBean(int id, String name, String course)
         {
        	 super();
        	 this.id = id;
        	 this.name = name;
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
         public String getCourse()
         {
        	 return course;
         }
		@Override
		public String toString() {
			return "StudentBean [id=" + id + ", name=" + name + ", course=" + course + "]";
		}
         
         
}
