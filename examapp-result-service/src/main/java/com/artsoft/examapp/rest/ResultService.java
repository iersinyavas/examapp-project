package com.artsoft.examapp.rest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.artsoft.Car;
import com.artsoft.examapp.core.interfaces.util.Testable;
import com.artsoft.examapp.core.interfaces.util.impl.DigitalScore;
import com.artsoft.examapp.core.interfaces.util.impl.EqualFocusScore;
import com.artsoft.examapp.core.interfaces.util.impl.VerbalScore;
import com.artsoft.examapp.core.interfaces.util.impl.ExamYGS;
import com.artsoft.examapp.core.model.subject.Science;
import com.artsoft.examapp.core.model.subject.Social;
import com.artsoft.examapp.core.model.subject.Turkish;
import com.artsoft.examapp.core.model.subject.Math;
import com.artsoft.examapp.core.model.util.Result;
import com.artsoft.examapp.core.model.util.ScoreResult;

@RestController
public class ResultService {

	@Autowired
	Environment environment;

	Map<Integer, Car> carMap = new HashMap<Integer, Car>();

	@PostConstruct
	public void init() {
		carMap.put(1, new Car(1, "Ferrari"));
		carMap.put(2, new Car(2, "Bugatti"));
		carMap.put(3, new Car(3, "Mercedes"));
	}

	@GetMapping("/getAll")
	public Collection<Car> getAll() {
		return carMap.values();
	}

	@GetMapping("/{id}")
	public Car getCar(@PathVariable("id") Integer id) {
		return carMap.get(id);
	}

	@LoadBalanced
	@GetMapping("/score")
	public Map<String, Float> score() {
		ScoreResult scoreResult = new ScoreResult();
		List<Result> resultList = new ArrayList<Result>();
		List<Testable> testableList = new ExamYGS().createExam(new Turkish(), new Math(), new Social(), new Science());
		Result resultD = new Result(testableList, new DigitalScore());
		Result resultE = new Result(testableList, new EqualFocusScore());
		Result resultV = new Result(testableList, new VerbalScore());
		resultList.add(resultD);
		resultList.add(resultE);
		resultList.add(resultV);

		Map<String, Float> deneme = new HashMap<String, Float>();
		deneme = scoreResult.allScore(resultList);
		deneme.put("environment", Float.valueOf(environment.getProperty("local.server.port")));
		return deneme;
	}



}
