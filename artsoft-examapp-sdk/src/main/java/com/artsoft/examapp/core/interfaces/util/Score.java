package com.artsoft.examapp.core.interfaces.util;

public interface Score{
	
	float scoreCalculate(float net, Testable testable);
	Testable getTestable();
	String scoreName();
}
