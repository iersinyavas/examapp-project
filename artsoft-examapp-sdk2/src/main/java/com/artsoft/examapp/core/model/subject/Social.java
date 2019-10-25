package com.artsoft.examapp.core.model.subject;

import java.util.List;

import com.artsoft.examapp.core.interfaces.util.AytTest;
import com.artsoft.examapp.core.interfaces.util.AytTestDigitalCoefficient;
import com.artsoft.examapp.core.interfaces.util.AytTestEqualFocusCoefficient;
import com.artsoft.examapp.core.interfaces.util.AytTestForeignLanguageCoefficient;
import com.artsoft.examapp.core.interfaces.util.AytTestVerbalCoefficient;
import com.artsoft.examapp.core.interfaces.util.Coefficient;
import com.artsoft.examapp.core.interfaces.util.QuestionQuantity;
import com.artsoft.examapp.core.interfaces.util.SubjectNameKey;
import com.artsoft.examapp.core.interfaces.util.Testable;
import com.artsoft.examapp.core.interfaces.util.TytTestCoefficient;
import com.artsoft.examapp.core.model.util.ExamRequirement;

public class Social extends VerbalSubject implements Testable, TytTestCoefficient{
	
	@Override
	public int questionQuantity() {
		return getQuestionQuantity();
	}
	
	@Override
	public int getQuestionQuantity() {
		return QuestionQuantity.SOCIAL_QUESTION_QUANTITY_1;
	}

	@Override
	public int unanswered() {
		return getUnanswered();
	}

	@Override
	public int trueQuantity() {
		return getTrueQuantity();
	}

	@Override
	public int falseQuantity() {
		return getFalseQuantity();
	}
	
	@Override
	public String getSubjectNameKey(ExamRequirement examRequirement) {
		return examRequirement.getSubjectNameKey(this);
	}
	
	@Override
	public String getSubjectName() {
		return SubjectNameKey.SOCIAL;
	}

	@Override
	public float tytCoefficientOne() {
		return Coefficient.SOCIAL_COEFFICIENT_1;
	}

	@Override
	public float tytCoefficientTwo() {
		return Coefficient.SOCIAL_COEFFICIENT_2;
	}

	@Override
	public TytTestCoefficient tytTestCoefficient() {
		return this;
	}

	@Override
	public AytTestDigitalCoefficient aytTestDigitalCoefficient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AytTestEqualFocusCoefficient aytTestEqualFocusCoefficient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AytTestVerbalCoefficient aytTestVerbalCoefficient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AytTestForeignLanguageCoefficient aytTestForeignLanguageCoefficient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AytTest aytTest() {
		return this;
	}

	@Override
	public int subjectQuestionQuantityOne() {
		return getQuestionQuantity();
	}

	@Override
	public int subjectQuestionQuantityTwo() {
		return 0;
	}

}
