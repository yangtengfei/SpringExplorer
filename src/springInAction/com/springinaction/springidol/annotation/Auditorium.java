package com.springinaction.springidol.annotation;

/**
 * 初始化和销毁 Bean 时执行相应的方法
 * @author yangtf
 */
public class Auditorium {
	public void turnOnLights(){
		System.out.println("----Light ON----");
	}
	
	public void turnOffLights(){
		System.out.println("----Light OFF----");
	}
}
