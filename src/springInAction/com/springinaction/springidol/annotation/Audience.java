package com.springinaction.springidol.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	@Pointcut("execution(* com.springinaction.springidol.Performer.perform(..))")
	public void performance(){}
	
	@Before("performance()")
	public void takeSteats() {
		System.out.println("The audience is taking their seats.");
	}

	@Before("performance()")
	public void turnOffCellPhones() {
		System.out.println("The audience is turning off their cellphones");
	}

	@AfterReturning("performance()")
	public void applaud() {
		System.out.println("CLAP CLAP CLAP");
	}

	@AfterThrowing("performance()")
	public void demandRefund() {
		System.out.println("Boo! We want our money back!");
	}

	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint joinPoint) {
		try {
			System.out.println("The audience is taking their seats.");
			System.out.println("The audience is turning off their cellphones");

			long start = System.currentTimeMillis();
			joinPoint.proceed();
			long end = System.currentTimeMillis();
			
			System.out.println("CLAP CLAP CLAP");
			System.out.println("The performance took " + (end - start) + " milliseconds");
		} catch (Throwable e) {
			System.out.println("Boo! We want our money back!");
			e.printStackTrace();
		}

	}
}
