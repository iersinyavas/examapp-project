package com.artsoft.examapp.core.model.util;

import java.util.Random;

import com.artsoft.examapp.core.model.subject.Subject;

public class Calculate {
	
	public <T extends Subject> T randomSubjectResult(T t) {
		Random random = new Random();
		t.setTrueQuantity(random.nextInt(t.getQuestionQuantity() + 1));
		t.setFalseQuantity(random.nextInt(t.getQuestionQuantity() - t.getTrueQuantity() + 1));
		t.setUnanswered(t.getQuestionQuantity() - t.getTrueQuantity() - t.getFalseQuantity());
		return t;
	}

}
