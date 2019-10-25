package com.artsoft.examapp.core.interfaces.util;

import com.artsoft.examapp.core.model.subject.Subject;
import com.artsoft.examapp.core.model.util.ExamRequirement;

public interface Testable extends Test, AytTest{
	
	int unanswered();
	int trueQuantity();
	int falseQuantity();

	String getSubjectNameKey(ExamRequirement examRequirement);
	TytTestCoefficient tytTestCoefficient();
	AytTest aytTest();
	AytTestDigitalCoefficient aytTestDigitalCoefficient();
	AytTestEqualFocusCoefficient aytTestEqualFocusCoefficient();
	AytTestVerbalCoefficient aytTestVerbalCoefficient();
	AytTestForeignLanguageCoefficient aytTestForeignLanguageCoefficient();
//	float verbalCoefficient();
//	float digitalCoefficient();
//	float equalFocusCoefficient();
//	float tytCoefficient();
	
	
}
