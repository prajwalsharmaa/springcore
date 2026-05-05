package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student = (Student)context.getBean("ob",Student.class);
		/*
		 * System.out.println(student); System.out.println(student.address);
		 * System.out.println(student.address.getClass());
		 */
		
		System.out.println(student.hashCode());
		
		Student student1 = (Student) context.getBean("ob",Student.class);
		System.out.println(student1.hashCode());//By default spring creates singleton bean so the hashcode will be same which means its the same bean created before
		
		Teacher t1 = (Teacher) context.getBean("teacher",Teacher.class);
		Teacher t2 = (Teacher) context.getBean("teacher",Teacher.class);
		System.out.println(t1.hashCode() + "  "+ t2.hashCode());
	}

}
