package com.spring.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.DetailsDao;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfiguration.xml");
        DetailsDao dao = (DetailsDao) context.getBean("dtDao");
        DetailsBean dt = new DetailsBean();
        
		/*
		 * dt.setId(1); dt.setName("Teja"); dt.setSalary(40000.00);
		 */
		/*
		 * dt.setId(2); dt.setName("Latha"); dt.setSalary(50000.0);
		 */
		
		/* dt.setId(3); dt.setName("Mahi"); dt.setSalary(95000.0); */
		 
		/* dao.saveDetails(dt); */
		/*
		 * DetailsBean details = dao.viewDetails(1); System.out.println(details);
		 */
		/*
		 * List<DetailsBean>db = dao.detailsAll(); System.out.println(db);
		 */
		/*
		 * dao.deleteDetails(103); System.out.println("Deleted");
		 */
        DetailsBean db = dao.viewDetails(1);
        db.setName("Tejaswi");
        db.setSalary(50000.00);
        dao.updateDetails(db);
        System.out.println("Updated sucessfully");
    }
}
