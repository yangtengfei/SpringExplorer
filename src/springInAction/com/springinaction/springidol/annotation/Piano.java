package com.springinaction.springidol.annotation;

@StringedInstrument
public class Piano implements Instrument {

	@Override
	public void play() {
		System.out.println("PLINK PLINK");
	}

}
