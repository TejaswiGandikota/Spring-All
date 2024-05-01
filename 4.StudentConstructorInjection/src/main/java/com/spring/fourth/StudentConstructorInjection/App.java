package com.spring.fourth.StudentConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =  new ClassPathXmlApplicationContext("springconfig.xml");
        StudentBean stdBean = (StudentBean) context.getBean("std");
        stdBean.print();
    }
}
