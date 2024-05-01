package com.spring.six.AddressDIObjects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("springconfig1.xml");
       StudentBean stdBean =(StudentBean) context.getBean("std");
       stdBean.print();
    }
}
