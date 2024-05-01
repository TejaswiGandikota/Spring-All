package com.spring.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	   @Bean
       public Address getBean()
       {
		Address add = new Address();
		add.setCity("Hyderabad");
		add.setColony("Punjagutta officers colony");
		add.setState("Telangana");
		add.setPincode(500018);
		return add;
       }
	   @Bean
	   public Employee getBean1()
       {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Tejaswi");
		emp.setAddress(getBean());
		return emp;
		
       }
}
