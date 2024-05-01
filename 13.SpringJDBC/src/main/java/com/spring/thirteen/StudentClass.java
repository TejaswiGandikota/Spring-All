package com.spring.thirteen;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentClass {
	
         private JdbcTemplate jdbctemplate;
         
         public StudentClass()
         {
        	 super();
         }
         public StudentClass(JdbcTemplate jdbctemplate)
         {
        	 super();
        	 this.jdbctemplate = jdbctemplate;
         }
         
         public void setJdbctemplate(JdbcTemplate jdbctemplate)
         {
        	 this.jdbctemplate = jdbctemplate;
         }
         public JdbcTemplate getJdbctemplate()
         {
        	 return jdbctemplate;
         }
         
         public void create() {
        	    jdbctemplate.execute("CREATE TABLE Student (id INT, name VARCHAR(20), course VARCHAR(20))");
        	    System.out.println("Table Created");
        	}

         public void insert() {
        	 int insert = jdbctemplate.update("insert into Student values(101,'Ishan','Java Full Stack')");
        	 System.out.println( insert + "Values inserted");
        	 int insert1 =  jdbctemplate.update("insert into Student values(102,'Gill','Java Full Stack')");
        	 System.out.println(insert1 + "Value inserted");
        	 int insert2 =  jdbctemplate.update("insert into Student values(103,'Jadeja','Java Full Stack')");
        	 System.out.println(insert2 + "Value inserted");
        	 int insert3 =  jdbctemplate.update("insert into Student values(104,'Bumrah','Java Full Stack')");
        	 System.out.println(insert3 + "Value inserted");
         }
         public void delete() 
         {
        	 int delete = jdbctemplate.update("delete  from Student where id='107' ");
        	 System.out.println(delete + "Value deleted");
         }
         public void updateRecord()
         {
        	 int update =jdbctemplate.update("update Student set id='107' where id='101' ");
        	 System.out.println(update + " Row updated");
         }
         public void getReccord()
         {
				/*   To select single record
				 * List<Map<String ,Object>> oneRecord =
				 * jdbctemplate.queryForList("select * from Student where id='107' ");
				 */
        	 
        	 // To get all records
        	 List<Map<String ,Object>> oneRecord = jdbctemplate.queryForList("select * from Student ");
        	 Iterator it = oneRecord.iterator();
        	 while(it.hasNext())
        	 {
        		 Object obj = it.next();
        		 System.out.println(obj.toString());
        		 
        	 }
        	 
         }
}
