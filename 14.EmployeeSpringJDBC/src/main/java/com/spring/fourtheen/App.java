package com.spring.fourtheen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
       Employee emp = (Employee) context.getBean("empBean");
		
		  emp.create(); 
		  emp.insert();
		 
       emp.delete();
       emp.updateName();
       emp.getOnerecord();
       emp.getAllrecords();
    }
}
