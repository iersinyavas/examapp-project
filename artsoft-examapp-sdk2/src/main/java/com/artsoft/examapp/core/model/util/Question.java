package com.artsoft.examapp.core.model.util;

import com.artsoft.examapp.core.model.subject.Subject;

public class Question implements ExamRequirement{

	@Override
	public String getSubjectNameKey(Subject subject) {
		return subject.getSubjectQuestionKey();
	}
}
