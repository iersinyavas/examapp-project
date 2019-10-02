package com.artsoft.examapp.core.interfaces.util.impl;

import com.artsoft.examapp.core.interfaces.util.Score;
import com.artsoft.examapp.core.interfaces.util.SubjectNameKey;
import com.artsoft.examapp.core.interfaces.util.Testable;

public class EqualFocusScore implements Score{

	@Override
	public Testable getTestable() {
		return null;
	}

	@Override
	public float scoreCalculate(float net, Testable testable) {
		System.out.println(net*typeParseScoring(testable));
		return net * typeParseScoring(testable);
	}
	
	private int typeParseScoring(Testable testable) {
		return testable.equalFocusScore();
	}

	@Override
	public String scoreName() {
		return SubjectNameKey.EQUAL_FOCUS_SCORE;
	}

}
