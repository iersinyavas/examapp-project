package com.artsoft.examapp.core.model.util;

import java.util.HashMap;
import java.util.Map;
import com.artsoft.examapp.core.interfaces.manager.StudentManager;
import com.artsoft.examapp.core.model.subject.Subject;


public class Answer implements ExamRequirement{
	
	StudentManager studentManager;
	
	public static Map<String, String> options = new HashMap<String, String>();
	
	public static Map<String, String> getOptions() {
		options = Option.getOptions();
		return options;
	}

	@Override
	public String getSubjectNameKey(Subject subject) {
		return subject.getSubjectAnswerKey();
	}

}
