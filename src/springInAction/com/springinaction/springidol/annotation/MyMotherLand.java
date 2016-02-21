package com.springinaction.springidol.annotation;

public class MyMotherLand implements Poem {
	private static String[] Lines = {
		"oh !",
		"My Mother Land,",
		"I Love U!"
	};
	
	public MyMotherLand() {
	}

	@Override
	public void recite() {
		for (int i = 0; i < Lines.length; i++) {
			System.out.println(Lines[i]);
		}
	}

}
