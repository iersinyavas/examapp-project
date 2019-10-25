package com.artsoft.examapp.core.interfaces.util.impl;

import com.artsoft.examapp.core.interfaces.util.NetRule;
import com.artsoft.examapp.core.interfaces.util.Score;
import com.artsoft.examapp.core.interfaces.util.SubjectNameKey;
import com.artsoft.examapp.core.interfaces.util.Testable;

public class EqualFocusScore implements Score{

	@Override
	public Testable getTestable() {
		return null;
	}

	@Override
	public float scoreCalculate(Testable testable) {
		System.out.println(testable.getSubjectName() + ": " +netCalculate(testable)*testable.aytTestEqualFocusCoefficient().subjectEqualFocusCoefficient());
		return netCalculate(testable) * testable.aytTestEqualFocusCoefficient().subjectEqualFocusCoefficient();
	}
	
	private float netCalculate(Testable testable) {
		//derslerdeki soru say�lar�nda de�i�iklik var. E�it a��rl�ktaki baz� derslerin 
		//_1 ve _2 ile biten soru say�s� de�i�kenlerinin ayr�lmas� gerekiyor.
		int answered = testable.aytTest().subjectQuestionQuantityOne() - testable.unanswered();
		int falses = testable.falseQuantity();
		float accurateLoss = (float) falses / NetRule.NET_RULE;
		System.out.println(testable.getSubjectName() + " Net: " + (answered - accurateLoss - falses));
		return answered - accurateLoss - falses;
	}

	@Override
	public String scoreName() {
		return SubjectNameKey.EQUAL_SCORE_NAME;
	}

}
