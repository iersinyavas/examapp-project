package com.artsoft.examapp.core.model.subject;

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

public class Chemistry extends DigitalSubject implements Testable, AytTestDigitalCoefficient {

	@Override
	public int questionQuantity() {
		return getQuestionQuantity();
	}
	
	@Override
	public int getQuestionQuantity() {
		return QuestionQuantity.CHEMISTRY_QUESTION_QUANTITY_2;
	}
	
	@Override
	public float subjectDigitalCoefficient() {
		return Coefficient.CHEMISTRY_DIGITAL_COEFFICIENT_2;
	}

	@Override
	public String getSubjectName() {
		return SubjectNameKey.CHEMISTRY;
	}
	
	@Override
	public String getSubjectAnswerKey() {
		return SubjectAnswerKey.KEY_A_CHEMISTRY;
	}

	@Override
	public String getSubjectQuestionKey() {
		return SubjectQuestionKey.KEY_Q_CHEMISTRY;
	}

	@Override
	public String getSubjectNameKey(ExamRequirement examRequirement) {
		return examRequirement.getSubjectNameKey(this);
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
		return this;
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
	public int subjectQuestionQuantityOne() {
		return getQuestionQuantity();
	}

	@Override
	public int subjectQuestionQuantityTwo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AytTest aytTest() {
		return this;
	}
	
}
