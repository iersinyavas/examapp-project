package com.artsoft.examapp.core.model.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import com.artsoft.examapp.core.interfaces.util.Score;
import com.artsoft.examapp.core.interfaces.util.Testable;
import com.artsoft.examapp.core.interfaces.util.impl.TytScore;
import com.artsoft.examapp.core.model.subject.Math;
import com.artsoft.examapp.core.model.subject.Science;
import com.artsoft.examapp.core.model.subject.Social;
import com.artsoft.examapp.core.model.subject.Subject;
import com.artsoft.examapp.core.model.subject.Turkish;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result {

	private Testable testable;
	private Score score;
	private float net;
	List<Testable> testableList;

	Map<String, Float> scoreSubjectMap;
	Map<String, Map<String, Float>> allScore;

	public Result() {
	}

	public Result(Testable testable, Score score) {
		this.testable = testable;
		this.score = score;
	}

	public Result(List<Testable> testableList, Score score) {
		this.testableList = testableList;
		this.score = score;
	}

	public Map<String, Float> scoreSubjectCalculate() {
		scoreSubjectMap = new HashMap<String, Float>();
		testableList.stream().forEach(testable -> scoreSubjectMap.put(testable.getSubjectName(),
				score.scoreCalculate(testable)));
		return scoreSubjectMap;
	}
	
	public <T extends Subject> T randomSubjectResult(T t) {
		Random random = new Random();
		t.setTrueQuantity(random.nextInt(t.getQuestionQuantity() + 1));
		t.setFalseQuantity(random.nextInt(t.getQuestionQuantity() - t.getTrueQuantity() + 1));
		t.setUnanswered(t.getQuestionQuantity() - t.getTrueQuantity() - t.getFalseQuantity());
		
		t.setTrueQuantity2(random.nextInt(t.getQuestionQuantity2() + 1));
		t.setFalseQuantity2(random.nextInt(t.getQuestionQuantity2() - t.getTrueQuantity2() + 1));
		t.setUnanswered2(t.getQuestionQuantity2() - t.getTrueQuantity2() - t.getFalseQuantity());
		return t;
	}

	public static void main(String[] args) {
		Result result = new Result();
		
		List<Testable> testableList = Arrays.asList(
				result.randomSubjectResult(new Math()), 
				result.randomSubjectResult(new Turkish()),
				result.randomSubjectResult(new Social()),
				result.randomSubjectResult(new Science()));
		
		Result result2 = new Result(testableList, new TytScore());
		System.out.println(result2.scoreSubjectCalculate());
		
	}

}
