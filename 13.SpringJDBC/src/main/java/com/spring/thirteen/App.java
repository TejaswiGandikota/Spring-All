package com.spring.thirteen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        StudentClass stdc = (StudentClass) context.getBean("jdbcId3");
		/* stdc.create(); */
		/* stdc.insert(); */
		 stdc.delete(); 
		/* stdc.updateRecord(); */
        stdc.getReccord();
    }
}