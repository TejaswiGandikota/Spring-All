package com.spring.five.DIformofObjects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig1.xml");
        OrderBean orderBean = (OrderBean) context.getBean("order");
        orderBean.print();
    }
}
