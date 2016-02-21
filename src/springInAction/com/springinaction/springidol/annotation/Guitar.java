package com.springinaction.springidol.annotation;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument {
	@Override
	public void play() {
		System.out.println("bleng bleng");
	}
}
