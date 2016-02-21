package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext atx = new ClassPathXmlApplicationContext("springaop.xml");
		
		Contestant performer = (Contestant)atx.getBean("kenny3");
//		performer.perform();
		performer.receiveAward();
		
	}
}
