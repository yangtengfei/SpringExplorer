package com.springinaction.springidol;

import org.aspectj.lang.annotation.DeclareParents;

public class ContestantIntroducer {
	
	@DeclareParents(value = "com.springinaction.springidol.Performer+",
			defaultImpl = GraciousContestant.class)
	public static Contestant contestant;
}
