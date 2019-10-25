package com.artsoft.examapp.core.interfaces.util.impl;

import com.artsoft.examapp.core.interfaces.util.NetRule;
import com.artsoft.examapp.core.interfaces.util.Score;
import com.artsoft.examapp.core.interfaces.util.SubjectNameKey;
import com.artsoft.examapp.core.interfaces.util.Testable;

public class TytScoreTwo implements Score{

	private Testable testable;

	@Override
	public float scoreCalculate(Testable testable) {
		System.out.println(testable.getSubjectName() + ": " +netCalculate(testable)*testable.tytTestCoefficient().tytCoefficientTwo());
		return netCalculate(testable) * testable.tytTestCoefficient().tytCoefficientTwo();
	}
	
	private float netCalculate(Testable testable) {
		//derslerdeki soru sayýlarýnda deðiþiklik var. Eþit aðýrlýktaki bazý derslerin 
		//_1 ve _2 ile biten soru sayýsý deðiþkenlerinin ayrýlmasý gerekiyor.
		int answered = testable.aytTest().subjectQuestionQuantityOne() - testable.unanswered();
		int falses = testable.falseQuantity();
		float accurateLoss = (float) falses / NetRule.NET_RULE;
		System.out.println(testable.getSubjectName() + " Net: " + (answered - accurateLoss - falses));
		return answered - accurateLoss - falses;
	}

	@Override
	public Testable getTestable() {
		return this.testable;
	}

	@Override
	public String scoreName() {
		return SubjectNameKey.TYT_SCORE_NAME_2;
	}

}
