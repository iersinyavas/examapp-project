package com.artsoft.examapp.core.model.subject;

import java.util.List;
import com.artsoft.examapp.core.interfaces.util.QuestionQuantity;
import com.artsoft.examapp.core.interfaces.util.Scoring;
import com.artsoft.examapp.core.interfaces.util.SubjectNameKey;
import com.artsoft.examapp.core.interfaces.util.Testable;
import com.artsoft.examapp.core.interfaces.util.UnTestable;

public class Science extends DigitalSubject implements Testable{

	public static final int SCIENCE_VERBAL_SCORE = Scoring.SCIENCE_VERBAL_SCORE;
	public static final int SCIENCE_DIGITAL_SCORE = Scoring.SCIENCE_DIGITAL_SCORE;
	public static final int SCIENCE_EQUAL_FOCUS_SCORE = Scoring.SCIENCE_EQUAL_FOCUS_SCORE;
	
	@Override
	public List<String> answerKey() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int questionQuantity() {
		return QuestionQuantity.SCIENCE_QUESTION_QUANTITY;
	}
	
	@Override
	public int getQuestionQuantity() {
		return QuestionQuantity.SCIENCE_QUESTION_QUANTITY;
	}

	@Override
	public void add(UnTestable unTestable) {
		
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
	public String getSubjectName() {
		return SubjectNameKey.SCIENCE;
	}
	
	@Override
	public int verbalScore() {
		return SCIENCE_VERBAL_SCORE;
	}

	@Override
	public int digitalScore() {
		return SCIENCE_DIGITAL_SCORE;
	}

	@Override
	public int equalFocusScore() {
		return SCIENCE_EQUAL_FOCUS_SCORE;
	}
	
}
