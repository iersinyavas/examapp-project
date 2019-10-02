package com.artsoft.examapp.core.interfaces.util.impl;

import com.artsoft.examapp.core.interfaces.util.Score;
import com.artsoft.examapp.core.interfaces.util.SubjectNameKey;
import com.artsoft.examapp.core.interfaces.util.Testable;

public class VerbalScore implements Score {
	
	@Override
	public Testable getTestable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float scoreCalculate(float net, Testable testable) {
		System.out.println(net*typeParseScoring(testable));
		return net*typeParseScoring(testable);
	}
	
	private int typeParseScoring(Testable testable) {
		return testable.verbalScore();
	}

	@Override
	public String scoreName() {
		return SubjectNameKey.VERBAL_SCORE;
	}

}
