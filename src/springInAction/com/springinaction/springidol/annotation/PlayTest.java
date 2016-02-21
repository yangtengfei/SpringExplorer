package com.springinaction.springidol.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext atx = new ClassPathXmlApplicationContext("spring-idol-annotation.xml");
		
		Performer performer = (Performer)atx.getBean("kenny");
		performer.perform();
	}
}
