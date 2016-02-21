package com.springinaction.springidol.annotation;

import java.util.Map;

/**
 * 用来展示Map的使用
 * @author yangtf
 *
 */
public class OneManBandForMap implements Performer {
	private Map<String, Instrument> instruments;

	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}

	@Override
	public void perform() {
		for(String key : instruments.keySet()){
			System.out.print(key + " : ");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}
	}

}
