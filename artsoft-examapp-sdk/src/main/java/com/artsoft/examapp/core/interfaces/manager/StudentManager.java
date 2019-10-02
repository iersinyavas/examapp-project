package com.artsoft.examapp.core.interfaces.manager;

import java.util.List;

import com.artsoft.examapp.core.model.school.University;

public interface StudentManager {
	
	List<University> studentUniversityPreferences();
	List<String> answerList();
	
}
