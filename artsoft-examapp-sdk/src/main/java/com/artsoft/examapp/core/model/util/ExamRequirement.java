package com.artsoft.examapp.core.model.util;

import com.artsoft.examapp.core.model.subject.Subject;

@FunctionalInterface
public interface ExamRequirement {

	String getSubjectNameKey(Subject subject);
	
}
