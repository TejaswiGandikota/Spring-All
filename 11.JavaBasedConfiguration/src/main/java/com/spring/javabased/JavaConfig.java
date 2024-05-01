package com.spring.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class JavaConfig {
        @Bean("id")
        public StudentBean getBean()
        {
        	StudentBean bean = new StudentBean();
        	bean.setId(1);
        	bean.setName("Tejaswi");
        	bean.setBatch("Batch-11");	
        	bean.setCourse("Java Full Stack");
        	return bean;
        	
        }
        @Bean("id1")
        public StudentBean getBean1()
        {
        	StudentBean bean1 = new StudentBean();
        	bean1.setId(2);
        	bean1.setName("Latha");
        	bean1.setBatch("Batch-11");	
        	bean1.setCourse("Java Full Stack");
        	return bean1;
        	
        }
}
