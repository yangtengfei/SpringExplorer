package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext atx = new ClassPathXmlApplicationContext("spring-idol-autowiring.xml");
		
		Performer performer = (Performer)atx.getBean("duke");
		performer.perform();
	}
}
