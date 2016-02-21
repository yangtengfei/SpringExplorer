package com.springinaction.springidol;

import java.util.Collection;

/**
 * 单人乐队，用来展示 List 的使用
 * @author yangtf
 *
 */
public class OneManBand implements Performer {
	private Collection<Instrument> instruments;

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}

	@Override
	public void perform() {
		for (Instrument instrument : instruments) {
			instrument.play();
		}
	}

}
