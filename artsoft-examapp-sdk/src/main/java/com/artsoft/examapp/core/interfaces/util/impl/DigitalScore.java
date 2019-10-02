package com.artsoft.examapp.core.interfaces.util.impl;

import com.artsoft.examapp.core.interfaces.util.Score;
import com.artsoft.examapp.core.interfaces.util.SubjectNameKey;
import com.artsoft.examapp.core.interfaces.util.Testable;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DigitalScore implements Score {
	
	private Testable testable;

	@Override
	public float scoreCalculate(float net, Testable testable) {
		System.out.println(net*typeParseScoring(testable));
		return net * typeParseScoring(testable);
	}

	@Override
	public Testable getTestable() {
		return this.testable;
	}
	
	private int typeParseScoring(Testable testable) {
		return testable.digitalScore();
	}

	@Override
	public String scoreName() {
		return SubjectNameKey.DIGITAL_SCORE;
	}


	
}
