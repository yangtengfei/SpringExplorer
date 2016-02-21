package com.springinaction.springidol.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Instrumentalist implements Performer {
	@Value("blablablas")
	private String song;
	
	@Autowired
//	@StringedInstrument
	private Instrument instrument;
	
	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	@Override
	public void perform() {
		System.out.print("Playing " + song + " : ");
		if (instrument != null) {
			instrument.play();
		}
	}

}
