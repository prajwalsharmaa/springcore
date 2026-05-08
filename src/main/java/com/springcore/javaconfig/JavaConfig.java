package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class JavaConfig {
	
	@Bean("getSamosa")
	public Samosa getSamosa() {
		return new Samosa();
	}
	@Bean//now the bean goes to the ioc container from which we can use it 
	public Student getStudent() {
		
		Student student = new Student(getSamosa());
		return student;
	}
}
