package com.artsoft.examapp.core.model.subject;

import java.util.List;
import com.artsoft.examapp.core.interfaces.util.QuestionQuantity;
import com.artsoft.examapp.core.interfaces.util.Scoring;
import com.artsoft.examapp.core.interfaces.util.SubjectNameKey;
import com.artsoft.examapp.core.interfaces.util.Testable;
import com.artsoft.examapp.core.interfaces.util.UnTestable;

public class Math extends DigitalSubject implements Testable {
	
	public static final int MATH_VERBAL_SCORE = Scoring.MATH_VERBAL_SCORE;
	public static final int MATH_DIGITAL_SCORE = Scoring.MATH_DIGITAL_SCORE;
	public static final int MATH_EQUAL_FOCUS_SCORE = Scoring.MATH_EQUAL_FOCUS_SCORE;

//	public Map<String, Map<String, String>> createTest(UnTestable... unTestables) {
//		Map<String, Map<String, String>> mathTest = new HashMap<String, Map<String, String>>();
//		for (UnTestable unTestable : unTestables) {
//			for (int i = 1; i <= unTestable.questionQuantity(); i++) {
//				mathTest.put(unTestable.getSubjectName()+Integer.toString(i), Option.getOptions());
//			}
//		}
//		return mathTest;
//	}
	
	@Override
	public List<String> answerKey() {
		return null;
	}

	@Override
	public int questionQuantity() {
		return QuestionQuantity.MATH_QUESTION_QUANTITY;
	}
	
	@Override
	public int getQuestionQuantity() {
		return QuestionQuantity.MATH_QUESTION_QUANTITY;
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
		return SubjectNameKey.MATH;
	}

	@Override
	public int verbalScore() {
		return MATH_VERBAL_SCORE;
	}

	@Override
	public int digitalScore() {
		return MATH_DIGITAL_SCORE;
	}

	@Override
	public int equalFocusScore() {
		return MATH_EQUAL_FOCUS_SCORE;
	}

}
