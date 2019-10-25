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

public class ReligionCulture extends VerbalSubject implements Testable, AytTestVerbalCoefficient{

	@Override
	public int questionQuantity() {
		return getQuestionQuantity();
	}
	
	@Override
	public int getQuestionQuantity() {
		return QuestionQuantity.RELIGION_CULTURE_QUESTION_QUANTITY_2;
	}

	@Override
	public String getSubjectName() {
		return SubjectNameKey.RELIGION_CULTURE;
	}
	
	@Override
	public String getSubjectAnswerKey() {
		return SubjectAnswerKey.KEY_A_RELIGION_CULTURE;
	}

	@Override
	public String getSubjectQuestionKey() {
		return SubjectQuestionKey.KEY_Q_RELIGION_CULTURE;
	}

	@Override
	public String getSubjectNameKey(ExamRequirement examRequirement) {
		return examRequirement.getSubjectNameKey(this);
	}

	@Override
	public float subjectVerbalCoefficientOne() {
		return Coefficient.RELIGION_CULTURE_VERBAL_COEFFICIENT_2;
	}
	
	@Override
	public float subjectVerbalCoefficientTwo() {
		// TODO Auto-generated method stub
		return 0;
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
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int subjectQuestionQuantityTwo() {
		return QuestionQuantity.RELIGION_CULTURE_QUESTION_QUANTITY_2;
	}

	@Override
	public int secondaryTrueQuantity() {
		return getTrueQuantity2();
	}

	@Override
	public int secondaryFalseQuantity() {
		return getTrueQuantity2();
	}

	@Override
	public int secondaryUnanswered() {
		return getTrueQuantity2();
	}

	@Override
	public AytTest aytTest() {
		return this;
	}
	
}
