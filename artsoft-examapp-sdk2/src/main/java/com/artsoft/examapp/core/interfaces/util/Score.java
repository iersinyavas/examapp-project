package com.artsoft.examapp.core.interfaces.util;

import com.artsoft.examapp.core.model.subject.Subject;

public interface Score{
	
	float scoreCalculate(Testable testable);
	Testable getTestable();
	String scoreName();
	
}
