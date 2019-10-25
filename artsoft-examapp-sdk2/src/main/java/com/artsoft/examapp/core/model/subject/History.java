package com.artsoft.examapp.core.model.subject;

import java.util.List;

import com.artsoft.examapp.core.interfaces.util.AytTest;
import com.artsoft.examapp.core.interfaces.util.AytTestDigitalCoefficient;
import com.artsoft.examapp.core.interfaces.util.AytTestEqualFocusCoefficient;
import com.artsoft.examapp.core.interfaces.util.AytTestForeignLanguageCoefficient;
import com.artsoft.examapp.core.interfaces.util.AytTestVerbalCoefficient;
import com.artsoft.examapp.core.interfaces.util.Coefficient;
import com.artsoft.examapp.core.interfaces.util.QuestionQuantity;
import com.artsoft.examapp.core.interfaces.util.SubjectAnswerKey;
import com.artsoft.examapp.core.interfaces.util.SubjectNameKey;
import com.artsoft.examapp.core.interfaces.util.SubjectQuestionKey;
import com.artsoft.examapp.core.interfaces.util.Testable;
import com.artsoft.examapp.core.interfaces.util.TytTestCoefficient;
import com.artsoft.examapp.core.model.util.ExamRequirement;

public class History extends VerbalSubject implements Testable, AytTestEqualFocusCoefficient, AytTestVerbalCoefficient{

	@Override
	public int questionQuantity() {
		return getQuestionQuantity();
	}
	
	@Override
	public float subjectEqualFocusCoefficient() {
		return Coefficient.HISTORY_EQUAL_FOCUS_COEFFICIENT_2_1;
	}

	@Override
	public float subjectVerbalCoefficientOne() {
		return Coefficient.HISTORY_VERBAL_COEFFICIENT_2_1;
	}

	@Override
	public float subjectVerbalCoefficientTwo() {
		return Coefficient.HISTORY_VERBAL_COEFFICIENT_2_2;
	}
	
	@Override
	public int getQuestionQuantity2() {
		return QuestionQuantity.HISTORY_QUESTION_QUANTITY_2_2;
	}
	
	@Override
	public int getQuestionQuantity() {
		return QuestionQuantity.HISTORY_QUESTION_QUANTITY_2_1;
	}
	
	@Override
	public String getSubjectName() {
		return SubjectNameKey.HISTORY;
	}
	
	@Override
	public String getSubjectAnswerKey() {
		return SubjectAnswerKey.KEY_A_HISTORY;
	}

	@Override
	public String getSubjectQuestionKey() {
		return SubjectQuestionKey.KEY_Q_HISTORY;
	}

	@Override
	public String getSubjectNameKey(ExamRequirement examRequirement) {
		return examRequirement.getSubjectNameKey(this);
	}



	@Override
	public TytTestCoefficient tytTestCoefficient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AytTestDigitalCoefficient aytTestDigitalCoefficient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AytTestEqualFocusCoefficient aytTestEqualFocusCoefficient() {
		return this;
	}

	@Override
	public AytTestVerbalCoefficient aytTestVerbalCoefficient() {
		return this;
	}

	@Override
	public AytTestForeignLanguageCoefficient aytTestForeignLanguageCoefficient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int subjectQuestionQuantityOne() {
		return getQuestionQuantity();
	}

	@Override
	public int subjectQuestionQuantityTwo() {
		return getQuestionQuantity2();
	}

	@Override
	public int secondaryTrueQuantity() {
		return getTrueQuantity2();
	}

	@Override
	public int secondaryFalseQuantity() {
		return getFalseQuantity2();
	}

	@Override
	public int secondaryUnanswered() {
		return getUnanswered2();
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
	public AytTest aytTest() {
		return this;
	}

}
