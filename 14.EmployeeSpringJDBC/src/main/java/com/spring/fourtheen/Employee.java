package com.spring.fourtheen;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class Employee {
        private int id;
        private String name;
        private double salary;
        private int deptno;
        private JdbcTemplate jdbctemplate;
        
        public Employee()
        {
        	super();
        }
        public Employee(int id, String name, double salary, int deptno, JdbcTemplate jdbctemplate)
        {
        	super();
        	this.id = id;
        	this.name = name;
        	this.salary = salary;
        	this.deptno = deptno;
        	this.jdbctemplate = jdbctemplate;
        }
        
        public void setId(int id)
        {
        	this.id = id;
        }
        public void setName(String name)
        {
        	this.name = name;
        }
        public void setSalary(double salary)
        {
        	this.salary = salary;
        }
        public void setDeptno(int deptno)
        {
        	this.deptno = deptno;
        }
        public void setJdbctemplate(JdbcTemplate jdbctemplate)
        {
        	this.jdbctemplate = jdbctemplate;
        }
        
        public int getId()
        {
        	return id;
        }
        public String getName()
        {
        	return name;
        }
        public double getSalary()
        {
        	return salary;
        }
        public int getDeptno()
        {
        	return deptno;
        }
        public JdbcTemplate getJdbctemplate() 
        {
        	return jdbctemplate;
        }
        
        public void create()
        {
        	jdbctemplate.execute("create table Employee(id int, name varchar2(20), salary number(10,2), deptno int)");
        	System.out.println("Table created");
        }
        public void insert()
        {
        	int insert = jdbctemplate.update("insert into Employee values(101,'Kim Taehyung',65000.0,1)");
        	System.out.println(insert + "value inserted ");
        	int insert1 = jdbctemplate.update("insert into Employee values(102,'Jeon Jungkook',65000.0,2)");
        	System.out.println(insert1 + "value  inserted ");
        	int insert2 = jdbctemplate.update("insert into Employee values(103,'Park Jimin',65000.0,2)");
        	System.out.println(insert2 + "value inserted");
        	int insert3 = jdbctemplate.update("insert into Employee values(109,'Tejaswi',60000.0,1)");
        	System.out.println(insert3 + "value inserted");
        	int insert4 = jdbctemplate.update("insert into Employee values(104,'Hosek',70000.0,2)");
        	System.out.println(insert4 + "value inserted");
        	int insert5 = jdbctemplate.update("insert into Employee values(105,'Kim Namjoon',70000.0,3)");
        	System.out.println(insert5 + "value inserted");
        	int insert6 = jdbctemplate.update("insert into Employee values(106,'Min Yoongi',70000.0,3)");
        	System.out.println(insert6 + "value inserted");
        	int insert7 = jdbctemplate.update("insert into Employee values(107,'Kim SeokJin',70000.0,1)");
        	System.out.println(insert7 + "value inserted");
        }
        public void delete()
        {
        	int delete = jdbctemplate.update("delete from Employee where name='Tejaswi' ");
        	System.out.println(delete + "Record deleted");
        }
        public void updateName()
        {
        	int update = jdbctemplate.update("update Employee set name='Jung Hosek' where name='Hosek' ");
        	System.out.println(update + "Updated");
        }
        public void getOnerecord()
        {
        	List<Map<String,Object>> oneRecord = jdbctemplate.queryForList("select * from Employee where id='101' ");
        	Iterator it = oneRecord.iterator();
       	 while(it.hasNext())
       	 {
       		 Object obj = it.next();
       		 System.out.println(obj.toString());
       		 
       	 }
        }
        public void getAllrecords()
        {
        	List<Map<String,Object>> allRecords = jdbctemplate.queryForList("select * from Employee");
        	Iterator it1 = allRecords.iterator();
        	while(it1.hasNext())
        	{
        		Object o = it1.next();
        		System.out.println(o.toString());
        	}
        }
}
