package com.spring.annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration @ComponentScan("com.spring.annotationbased")
public class App 
{
    public static void main( String[] args )
    {
    	
      ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
      Student std = (Student) context.getBean(Student.class);
      std.print();
    }
}