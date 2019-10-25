package com.artsoft.examapp.core.interfaces.manager.impl;

import java.util.Map;

import com.artsoft.examapp.core.interfaces.manager.StudentManager;
import com.artsoft.examapp.core.interfaces.manager.UniversityManager;
import com.artsoft.examapp.core.model.school.Department;
import com.artsoft.examapp.core.model.school.Faculty;
import com.artsoft.examapp.core.model.school.University;

public class UniversityManagerImpl implements UniversityManager {
	
	public static Map<String, Map<String, Map<String, Map<String, Float>>>> universities;

	@Override
	public void universityEnrollment(StudentManager studentManager) {
		
		studentManager.studentUniversityPreferences();

	}

	@Override
	public void createLowestScore(Map<String, University> universityMap, Map<String, Faculty> facultyMap,
			Map<String, Department> departmentMap) {
		
	}

}
