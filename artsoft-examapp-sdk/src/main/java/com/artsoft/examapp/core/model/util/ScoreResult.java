package com.artsoft.examapp.core.model.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.artsoft.examapp.core.interfaces.util.Scoring;
import com.artsoft.examapp.core.model.subject.Subject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScoreResult {

	private Map<String, Map<String, Float>> allSubjectScore;
	private Map<String, Float> allScore;

	public Map<String, Map<String, Float>> allSubjectScore(List<Result> results) {
		allSubjectScore = new HashMap<String, Map<String, Float>>();
		results.parallelStream()
				.forEach(result -> allSubjectScore.put(result.getScore().scoreName(), result.scoreSubjectCalculate()));
		return allSubjectScore;
	}

	public Map<String, Float> allScore(List<Result> results) {
		allSubjectScore(results);
		Map<String, Float> scoreMap = new HashMap<String, Float>();
		results.stream().forEach(result -> {
			scoreMap.put(result.getScore().scoreName(), (float) result.getScoreSubjectMap().entrySet().stream().mapToDouble(key -> key.getValue()).sum() + Scoring.BASE_SCORE);
		});
		
		return scoreMap;
	}
	
	public <T extends Subject> T randomSubjectResult(T t) {
		Random random = new Random();
		t.setTrueQuantity(random.nextInt(t.getQuestionQuantity() + 1));
		t.setFalseQuantity(random.nextInt(t.getQuestionQuantity() - t.getTrueQuantity() + 1));
		t.setUnanswered(t.getQuestionQuantity() - t.getTrueQuantity() - t.getFalseQuantity());
		return t;
	}

}
