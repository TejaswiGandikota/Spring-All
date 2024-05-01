package com.spring.seven;
import java.util.*;

public class AmeerpetTechnologiesBean {
            private List<String>studentnames;
            public AmeerpetTechnologiesBean()
            {
            	
            }
            public AmeerpetTechnologiesBean(List<String> studentnames)
            {
            	this.studentnames = studentnames;
            }
            public void setStudentnames(List<String> studentnames)
            {
            	this.studentnames = studentnames;
            }
            public List<String> getStudentnames()
            {
            	return this.studentnames;
            }
            public void print()
            {
            	System.out.println("Student Names:");
            	for(String stdnames:studentnames)
            	{
            		System.out.println(stdnames);
            	}
            }
}
