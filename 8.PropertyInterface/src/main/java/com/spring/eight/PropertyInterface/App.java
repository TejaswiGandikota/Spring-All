package com.spring.eight.PropertyInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
      AmeerpetTechnologies myBean = (AmeerpetTechnologies) context.getBean("abc");
      myBean.print();
    }
}
