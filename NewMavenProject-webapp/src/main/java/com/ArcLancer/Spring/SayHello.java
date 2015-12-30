package com.ArcLancer.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SayHello {

	public SayHello() {
	}

	public String SayHello2() {
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringBeans.xml");

		HelloBeans helloBeans = (HelloBeans) applicationContext.getBean("helloBeans");

		return helloBeans.getMessage();
	}
}
