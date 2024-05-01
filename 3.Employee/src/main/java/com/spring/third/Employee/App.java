package com.spring.third.Employee;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class App 
{
    public static void main( String[] args )
    {
		/*
		 * Resource res = new ClassPathResource("springconfig.xml"); XmlBeanFactory
		 * factory = new XmlBeanFactory(res); EmployeeClass myEmployee = (EmployeeClass)
		 * factory.getBean("abc"); myEmployee.print();
		 */
    	Resource res = new FileSystemResource("C:\\Users\\gandi\\OneDrive\\Desktop\\FileSystem\\springconfig.xml.txt");
        XmlBeanFactory factory = new XmlBeanFactory(res);
        EmployeeClass myEmployee = (EmployeeClass) factory.getBean("abc");
        myEmployee.print();
    }
}
