package com.artsoft.examapp.core.interfaces.util;

public interface Testable extends Test {
	
//	Map<String, Map<String, String>> createTest(UnTestable... unTestables);
	void add(UnTestable unTestable);
	int unanswered();
	int trueQuantity();
	int falseQuantity();
	
	int verbalScore();
	int digitalScore();
	int equalFocusScore();
	
	
}
