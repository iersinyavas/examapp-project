package com.artsoft.examapp.core.model.subject;

import java.util.List;
import com.artsoft.examapp.core.interfaces.util.QuestionQuantity;
import com.artsoft.examapp.core.interfaces.util.Scoring;
import com.artsoft.examapp.core.interfaces.util.SubjectNameKey;
import com.artsoft.examapp.core.interfaces.util.Testable;
import com.artsoft.examapp.core.interfaces.util.UnTestable;

public class Turkish extends VerbalSubject implements Testable{
	
	public static final int TURKISH_VERBAL_SCORE = Scoring.TURKISH_VERBAL_SCORE;
	public static final int TURKISH_DIGITAL_SCORE = Scoring.TURKISH_DIGITAL_SCORE;
	public static final int TURKISH_EQUAL_FOCUS_SCORE = Scoring.TURKISH_EQUAL_FOCUS_SCORE;
	
	@Override
	public List<String> answerKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int questionQuantity() {
		return QuestionQuantity.TURKISH_QUESTION_QUANTITY;
	}
	
	@Override
	public int getQuestionQuantity() {
		return QuestionQuantity.TURKISH_QUESTION_QUANTITY;
	}

	@Override
	public void add(UnTestable unTestable) {
		// TODO Auto-generated method stub
		
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
		return SubjectNameKey.TURKISH;
	}
	
	@Override
	public int verbalScore() {
		return TURKISH_VERBAL_SCORE;
	}

	@Override
	public int digitalScore() {
		return TURKISH_DIGITAL_SCORE;
	}

	@Override
	public int equalFocusScore() {
		return TURKISH_EQUAL_FOCUS_SCORE;
	}

}
