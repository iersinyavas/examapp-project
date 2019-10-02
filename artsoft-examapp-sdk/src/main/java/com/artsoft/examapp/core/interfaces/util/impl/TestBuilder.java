package com.artsoft.examapp.core.interfaces.util.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.artsoft.examapp.core.interfaces.util.Builder;
import com.artsoft.examapp.core.interfaces.util.UnTestable;
import com.artsoft.examapp.core.model.util.Option;

public class TestBuilder implements Builder{

	@SuppressWarnings("unchecked")
	public <T extends UnTestable> Map<String, Map<String, String>> createTest(T... unTestables) {
		Map<String, Map<String, String>> exam = new HashMap<String, Map<String, String>>();
		for (T unTestable : unTestables) {
			for (int i = 1; i <= unTestable.questionQuantity(); i++) {
				exam.put(unTestable.getSubjectName()+Integer.toString(i), Option.getOptions());
			}
		}
		return exam;
	}
	
	@SuppressWarnings("unchecked")
	public <T extends UnTestable> List<String> createTest2(T... unTestables) {
		List<String> exam = new ArrayList<String>();
		for (T unTestable : unTestables) {
			for (int i = 1; i <= unTestable.questionQuantity(); i++) {
				exam.add(unTestable.getSubjectName()+Integer.toString(i) + "------" + Option.getOptions());
			}
		}
		return exam;
	}
}
