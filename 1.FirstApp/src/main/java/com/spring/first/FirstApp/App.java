package com.spring.first.FirstApp;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App 
{
    public static void main( String[] args )
    {
        Resource res = new ClassPathResource("springsconfig.xml");
        XmlBeanFactory factory = new XmlBeanFactory(res);
        BeanClass myBean = (BeanClass) factory.getBean("add");
        myBean.printAddition();
    }
}