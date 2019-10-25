package com.artsoft.examapp.core.model.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import com.artsoft.examapp.core.interfaces.util.Coefficient;
import com.artsoft.examapp.core.interfaces.util.SubjectNameKey;
import com.artsoft.examapp.core.interfaces.util.Testable;
import com.artsoft.examapp.core.interfaces.util.impl.DigitalScore;
import com.artsoft.examapp.core.interfaces.util.impl.EqualFocusScore;
import com.artsoft.examapp.core.interfaces.util.impl.TytScore;
import com.artsoft.examapp.core.interfaces.util.impl.TytScoreTwo;
import com.artsoft.examapp.core.interfaces.util.impl.VerbalScore;
import com.artsoft.examapp.core.model.subject.Biology;
import com.artsoft.examapp.core.model.subject.Chemistry;
import com.artsoft.examapp.core.model.subject.Geography;
import com.artsoft.examapp.core.model.subject.History;
import com.artsoft.examapp.core.model.subject.Literature;
import com.artsoft.examapp.core.model.subject.Math;
import com.artsoft.examapp.core.model.subject.Philosophy;
import com.artsoft.examapp.core.model.subject.Physics;
import com.artsoft.examapp.core.model.subject.ReligionCulture;
import com.artsoft.examapp.core.model.subject.Science;
import com.artsoft.examapp.core.model.subject.Social;
import com.artsoft.examapp.core.model.subject.Subject;
import com.artsoft.examapp.core.model.subject.Turkish;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScoreResult {

	private Map<String, Map<String, Float>> allSubjectScore;
	private Map<String, Float> allScore;

	public Map<String, Map<String, Float>> allSubjectScore(List<Result> results) {
		allSubjectScore = new HashMap<String, Map<String, Float>>();
		results.stream()
				.forEach(result -> allSubjectScore.put(result.getScore().scoreName(), result.scoreSubjectCalculate()));
		return allSubjectScore;
	}

	public Map<String, Float> allScore(List<Result> results) {
		allSubjectScore(results);
		allScore = new HashMap<String, Float>();
		results.stream().forEach(result -> {
			allScore.put(result.getScore().scoreName(),
					(float) result.getScoreSubjectMap().entrySet().stream().mapToDouble(key -> key.getValue()).sum()
							+ Coefficient.BASE_SCORE);
		});
		return allScore;
	}
	
	public Map<String, Float> placementScore(List<Result> results){
		allScore(results);
		float tyt2 = allScore.get(SubjectNameKey.TYT_SCORE_NAME_2);
		Map<String, Float> placementScore = new HashMap<String, Float>();
		placementScore.put(SubjectNameKey.TYT_SCORE_NAME+"-Y", allScore.get(SubjectNameKey.TYT_SCORE_NAME));
		allScore.remove(SubjectNameKey.TYT_SCORE_NAME);
		allScore.remove(SubjectNameKey.TYT_SCORE_NAME_2);
		allScore.entrySet().stream().map(key -> key.getKey()).forEach(key -> placementScore.put(key+"-Y", allScore.get(key) + tyt2));
		return placementScore;
	}

	public static void main(String[] args) {
		ScoreResult scoreResult = new ScoreResult();
		Result result = new Result();
		List<Testable> tyt = Arrays.asList(
				result.randomSubjectResult(new Turkish()),
				result.randomSubjectResult(new Math()),
				result.randomSubjectResult(new Social()),
				result.randomSubjectResult(new Math()));
				
		List<Testable> digital = Arrays.asList(
				result.randomSubjectResult(new Math()),
				result.randomSubjectResult(new Physics()), 
				result.randomSubjectResult(new Biology()),
				result.randomSubjectResult(new Chemistry()));
		
		List<Testable> equalFocus = Arrays.asList(
				result.randomSubjectResult(new Math()),
				result.randomSubjectResult(new Literature()),
				result.randomSubjectResult(new History()),
				result.randomSubjectResult(new Geography()));
		
		List<Testable> verbal = Arrays.asList(
				result.randomSubjectResult(new Literature()),
				result.randomSubjectResult(new History()),
				result.randomSubjectResult(new Geography()),
				result.randomSubjectResult(new Philosophy()),
				result.randomSubjectResult(new ReligionCulture()));
		
		
		List<Result> resultList = Arrays.asList(
				new Result(tyt, new TytScoreTwo()),
				new Result(tyt, new TytScore()), 
				new Result(digital, new DigitalScore()), 
				new Result(equalFocus, new EqualFocusScore()),
				new Result(verbal, new VerbalScore())); 

//		System.out.println(scoreResult.allSubjectScore(resultList));
//		System.out.println(scoreResult.allScore(resultList));
		System.out.println(scoreResult.placementScore(resultList));
	}

}
