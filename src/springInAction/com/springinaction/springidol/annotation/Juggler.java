package com.springinaction.springidol.annotation;

/**
 * 杂技师进行表演
 * @author yangtf
 *
 */
public class Juggler implements Performer {
	private int beanBags = 3;
	
	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}

	public Juggler() {
	}

	@Override
	public void perform() {
		System.out.println("Juggling " + beanBags + " Beanbags");

	}

}
