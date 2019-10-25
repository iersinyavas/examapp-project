package com.artsoft.examapp.core.interfaces.util.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.artsoft.examapp.core.interfaces.util.Builder;
import com.artsoft.examapp.core.interfaces.util.Testable;
import com.artsoft.examapp.core.model.util.Option;

public class TestBuilder implements Builder{

	@SuppressWarnings("unchecked")
	public <T extends Testable> Map<String, Map<String, String>> createTest(T... testables) {
		Map<String, Map<String, String>> exam = new HashMap<String, Map<String, String>>();
		for (T testable : testables) {
			for (int i = 1; i <= testable.questionQuantity(); i++) {
				exam.put(testable.getSubjectName()+Integer.toString(i), Option.getOptions());
			}
		}
		return exam;
	}
	
	@SuppressWarnings("unchecked")
	public <T extends Testable> List<String> createTest2(T... testables) {
		List<String> exam = new ArrayList<String>();
		for (T testable : testables) {
			for (int i = 1; i <= testable.questionQuantity(); i++) {
				exam.add(testable.getSubjectName()+Integer.toString(i) + "------" + Option.getOptions());
			}
		}
		return exam;
	}
}
