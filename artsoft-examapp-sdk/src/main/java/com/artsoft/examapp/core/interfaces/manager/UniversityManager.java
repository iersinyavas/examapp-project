package com.artsoft.examapp.core.interfaces.manager;

import java.util.Map;

import com.artsoft.examapp.core.model.school.Department;
import com.artsoft.examapp.core.model.school.Faculty;
import com.artsoft.examapp.core.model.school.University;

public interface UniversityManager {
	
	void universityEnrollment(StudentManager studentManager);
	
	void createLowestScore(Map<String, University> universityMap, Map<String, Faculty> facultyMap, Map<String, Department> departmentMap);

}
