package com.artsoft.examapp.core.interfaces.util.impl;

import java.util.Random;

import com.artsoft.examapp.core.interfaces.util.NetRule;
import com.artsoft.examapp.core.interfaces.util.Score;
import com.artsoft.examapp.core.interfaces.util.SubjectNameKey;
import com.artsoft.examapp.core.interfaces.util.Testable;
import com.artsoft.examapp.core.model.subject.Subject;

public class VerbalScore implements Score {

	@Override
	public Testable getTestable() {
		return null;
	}

	@Override
	public float scoreCalculate(Testable testable) {
		System.out.println(testable.getSubjectName() + ": " +netCalculate(testable) * testable.aytTestVerbalCoefficient().subjectVerbalCoefficientOne()
				+ netCalculate2(testable) * testable.aytTestVerbalCoefficient().subjectVerbalCoefficientTwo());
		return netCalculate(testable) * testable.aytTestVerbalCoefficient().subjectVerbalCoefficientOne()
				+ netCalculate2(testable) * testable.aytTestVerbalCoefficient().subjectVerbalCoefficientTwo();
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
	
	private float netCalculate2(Testable testable) {
		//derslerdeki soru sayýlarýnda deðiþiklik var. Eþit aðýrlýktaki bazý derslerin 
		//_1 ve _2 ile biten soru sayýsý deðiþkenlerinin ayrýlmasý gerekiyor.
		int answered2 = testable.aytTest().subjectQuestionQuantityTwo() - testable.aytTestVerbalCoefficient().secondaryUnanswered();
		int falses2 = testable.aytTestVerbalCoefficient().secondaryFalseQuantity();
		float accurateLoss2 = (float) falses2 / NetRule.NET_RULE;
		System.out.println(testable.getSubjectName() + " Net: " + (answered2 - accurateLoss2 - falses2));
		return answered2 - accurateLoss2 - falses2;
	}

	@Override
	public String scoreName() {
		return SubjectNameKey.VERBAL_SCORE_NAME;
	}

}
