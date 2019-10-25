package com.artsoft.examapp.core.model.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.artsoft.examapp.core.interfaces.util.Testable;
import com.artsoft.examapp.core.model.subject.Biology;
import com.artsoft.examapp.core.model.subject.Chemistry;
import com.artsoft.examapp.core.model.subject.Geography;
import com.artsoft.examapp.core.model.subject.History;
import com.artsoft.examapp.core.model.subject.Physics;
import com.artsoft.examapp.core.model.subject.ReligionCulture;
import com.artsoft.examapp.core.model.subject.Turkish;
import com.artsoft.examapp.core.model.subject.Math;
import com.artsoft.examapp.core.model.subject.Philosophy;

public class TestCreater {

	public Map<String, Map<String, String>> createTest(Testable... testables) {
		Map<String, Map<String, String>> test = new HashMap<String, Map<String, String>>();
		StringBuilder stringBuilder = new StringBuilder();
		Question question = new Question();
		for (Testable unTestable : testables) {
			for (int i = 1; i <= unTestable.questionQuantity(); i++) {
				stringBuilder.append(unTestable.getSubjectNameKey(question));
				stringBuilder.append(i);
				test.put(stringBuilder.toString(), Option.getOptions());
				stringBuilder.delete(0, stringBuilder.length());
			}
		}
		return test;
	}

//	public Map<String, Map<String, String>> createTest(List<UnTestable> unTestableList, Question question) {
//		Map<String, Map<String, String>> test = new HashMap<String, Map<String, String>>();
//		StringBuilder stringBuilder = new StringBuilder();
//		unTestableList.stream().forEach(unTestable -> IntStream.range(1, unTestable.questionQuantity()).forEach(
//					i -> {
//						stringBuilder.append(unTestable.getSubjectNameKey(question));
//						stringBuilder.append(i);
//						test.put(stringBuilder.toString(), Option.getOptions());
//						stringBuilder.delete(0, stringBuilder.length());
//					}
//				));
//		return test;
//	}
	
	public Map<String, Map<String, String>> createTest(List<Testable> testableList, Question question) {
		Map<String, Map<String, String>> test = new HashMap<String, Map<String, String>>();
		StringBuilder stringBuilder = new StringBuilder();
		for (Testable unTestable : testableList) {
			for (int i = 1; i <= unTestable.questionQuantity(); i++) {
				stringBuilder.append(unTestable.getSubjectNameKey(question));
				stringBuilder.append(i);
				test.put(stringBuilder.toString(), Option.getOptions());
				stringBuilder.delete(0, stringBuilder.length());
			}
		}
		return test;
	}

	public static void main(String[] args) {
		TestCreater testCreater = new TestCreater();
		
		List<Testable> testableListT = Arrays.asList(new Turkish());			
		List<Testable> testableListM = Arrays.asList(new Math());
		List<Testable> testableListSc = Arrays.asList(new Physics(), new Chemistry(), new Biology());
		List<Testable> testableListSo = Arrays.asList(new History(), new Geography(), new Philosophy(), new ReligionCulture());
		
		List<List<Testable>> testableLists = new ArrayList<List<Testable>>();
		testableLists.add(testableListT);
		testableLists.add(testableListM);
		testableLists.add(testableListSo);
		testableLists.add(testableListSc);
		
		
		Question question = new Question();
		long start = System.nanoTime();
		testableLists.stream().parallel().forEach(testableList -> testCreater.createTest(testableList, question));
		System.out.println(System.nanoTime() - start);

	}

}
