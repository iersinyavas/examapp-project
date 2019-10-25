package com.artsoft.examapp.core.model.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.artsoft.examapp.core.interfaces.util.UnTestable;
import com.artsoft.examapp.core.model.subject.Biology;
import com.artsoft.examapp.core.model.subject.Chemistry;
import com.artsoft.examapp.core.model.subject.Geography;
import com.artsoft.examapp.core.model.subject.Geometry;
import com.artsoft.examapp.core.model.subject.Grammar;
import com.artsoft.examapp.core.model.subject.History;
import com.artsoft.examapp.core.model.subject.Literature;
import com.artsoft.examapp.core.model.subject.Physics;
import com.artsoft.examapp.core.model.subject.ReligionCulture;
import com.artsoft.examapp.core.model.subject.Turkish;
import com.artsoft.examapp.core.model.subject.TurkishOne;
import com.artsoft.examapp.core.model.subject.Math;
import com.artsoft.examapp.core.model.subject.MathOne;
import com.artsoft.examapp.core.model.subject.Philosophy;

public class TestCreater {

	public Map<String, Map<String, String>> createTest(UnTestable... unTestables) {
		Map<String, Map<String, String>> test = new HashMap<String, Map<String, String>>();
		StringBuilder stringBuilder = new StringBuilder();
		Question question = new Question();
		for (UnTestable unTestable : unTestables) {
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

//	public Map<String, Map<String, String>> createTest(List<UnTestable> unTestableList, Question question) {
//		Map<String, Map<String, String>> test = new HashMap<String, Map<String, String>>();
//		ExecutorService executorService = Executors.newFixedThreadPool(4);
//		
//		for (UnTestable unTestable : unTestableList) {
//			executorService.execute(new Runnable() {
//				public void run() {
//					createTestMapper(unTestable, test, question);
//				}
//			});
//		}
//		
////		unTestableList.parallelStream().forEach(unTestable -> createTestMapper(unTestable, test, question));
//		return test;
//	}

//	private void createTestMapper(UnTestable unTestable, Map<String, Map<String, String>> test, Question question) {
//		StringBuilder stringBuilder = new StringBuilder();
//		for (int i = 1; i <= unTestable.questionQuantity(); i++) {
//			stringBuilder.append(unTestable.getSubjectNameKey(question));
//			stringBuilder.append(i);
//			test.put(stringBuilder.toString(), Option.getOptions());
//			stringBuilder.delete(0, stringBuilder.length());
//		}
//	}
	
	public Map<String, Map<String, String>> createTest(List<UnTestable> unTestableList, Question question) {
		Map<String, Map<String, String>> test = new HashMap<String, Map<String, String>>();
		StringBuilder stringBuilder = new StringBuilder();
		for (UnTestable unTestable : unTestableList) {
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
		
		List<UnTestable> unTestableListT = Arrays.asList(new TurkishOne(), new Grammar());			
		List<UnTestable> unTestableListM = Arrays.asList(new MathOne(), new Geometry());
		List<UnTestable> unTestableListSc = Arrays.asList(new Physics(), new Chemistry(), new Biology());
		List<UnTestable> unTestableListSo = Arrays.asList(new History(), new Geography(), new Philosophy(), new ReligionCulture());
		
		List<List<UnTestable>> untestableLists = new ArrayList<List<UnTestable>>();
		untestableLists.add(unTestableListT);
		untestableLists.add(unTestableListM);
		untestableLists.add(unTestableListSo);
		untestableLists.add(unTestableListSc);
		

//		ExecutorService executorService = Executors.newFixedThreadPool(4);
//		
//		for (UnTestable unTestable : unTestableList) {
//			executorService.execute(new Runnable() {
//				public void run() {
//				}
//			});
//		}
		
		
		Question question = new Question();
		long start = System.nanoTime();
		untestableLists.stream().parallel().forEach(untestableList -> testCreater.createTest(untestableList, question));
		System.out.println(System.nanoTime() - start);
//		System.out.println(testT);
//		System.out.println(testM);
//		System.out.println(testSc);
//		System.out.println(testSo);
//		testCreater.createTest(new MathYgs(), new Geometry());
	}

}
