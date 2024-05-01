package com.spring.nine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
       First fr = (First) context.getBean("b");
       fr.print();
    }
}