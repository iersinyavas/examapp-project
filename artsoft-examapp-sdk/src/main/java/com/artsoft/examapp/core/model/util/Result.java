package com.artsoft.examapp.core.model.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.artsoft.examapp.core.interfaces.util.NetRule;
import com.artsoft.examapp.core.interfaces.util.Score;
import com.artsoft.examapp.core.interfaces.util.Testable;
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

	private float netCalculate(Testable testable) {
		int answered = testable.questionQuantity() - testable.unanswered();
		int falses = testable.falseQuantity();
		float accurateLoss = (float) falses / NetRule.NET_RULE;
		return answered - accurateLoss - falses;
	}

	public Map<String, Float> scoreSubjectCalculate() {
		scoreSubjectMap = new HashMap<String, Float>();
		testableList.parallelStream()
			.forEach(testable -> scoreSubjectMap.put(testable.getSubjectName(), score.scoreCalculate(netCalculate(testable), testable)));
		return scoreSubjectMap;
	}

}
