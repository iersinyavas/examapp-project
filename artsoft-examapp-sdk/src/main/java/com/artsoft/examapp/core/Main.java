package com.artsoft.examapp.core;

import java.util.ArrayList;
import java.util.List;
import com.artsoft.examapp.core.interfaces.util.Exam;
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

public class Main {

//	public static void main(String[] args) {
//		Random random = new Random();
//		
//		Turkish turkish = new Turkish();
//		turkish.setTrueQuantity(random.nextInt(QuestionQuantity.TURKISH_QUESTION_QUANTITY + 1));
//		turkish.setFalseQuantity(random.nextInt(QuestionQuantity.TURKISH_QUESTION_QUANTITY - turkish.getTrueQuantity()));
//		turkish.setUnanswered(QuestionQuantity.TURKISH_QUESTION_QUANTITY - turkish.getTrueQuantity() - turkish.getFalseQuantity());
//
//		Math math = new Math();
//		math.setTrueQuantity(random.nextInt(QuestionQuantity.MATH_QUESTION_QUANTITY + 1));
//		math.setFalseQuantity(random.nextInt(QuestionQuantity.MATH_QUESTION_QUANTITY - math.getTrueQuantity()));
//		math.setUnanswered(QuestionQuantity.MATH_QUESTION_QUANTITY - math.getTrueQuantity() - math.getFalseQuantity());
//
//		Social social = new Social();
//		social.setTrueQuantity(random.nextInt(QuestionQuantity.SOCIAL_QUESTION_QUANTITY + 1));
//		social.setFalseQuantity(random.nextInt(QuestionQuantity.SOCIAL_QUESTION_QUANTITY - social.getTrueQuantity()));
//		social.setUnanswered(QuestionQuantity.SOCIAL_QUESTION_QUANTITY - social.getTrueQuantity() - social.getFalseQuantity());
//
//		Science science = new Science();
//		science.setTrueQuantity(random.nextInt(QuestionQuantity.SCIENCE_QUESTION_QUANTITY + 1));
//		science.setFalseQuantity(random.nextInt(QuestionQuantity.SCIENCE_QUESTION_QUANTITY - science.getTrueQuantity()));
//		science.setUnanswered(QuestionQuantity.SCIENCE_QUESTION_QUANTITY - science.getTrueQuantity() - science.getFalseQuantity());
//		
//		List<Testable> testables = new ArrayList<>();
//		testables.add(turkish);
//		testables.add(math);
//		testables.add(social);
//		testables.add(science);
//	
//
//		Result resultD = new Result(testables, new DigitalScore());
//		Result resultE = new Result(testables, new EqualFocusScore());
//		Result resultV = new Result(testables, new VerbalScore());
//
//		System.out.println(resultD.scoreSubjectCalculate());
//		System.out.println(resultE.scoreSubjectCalculate());
//		System.out.println(resultV.scoreSubjectCalculate());
//		
//		ScoreResult scoreResult = new ScoreResult();
//		List<Result> resultList = new ArrayList<Result>();
//		resultList.add(resultD);
//		resultList.add(resultE);
//		resultList.add(resultV);
//		
//		System.out.println(scoreResult.allSubjectScore(resultList));
//		System.out.println(scoreResult.allScore(resultList));
//
//	}
	public static void main(String[] args) {
		Exam exam = new ExamYGS();
		ScoreResult scoreResult = new ScoreResult(); 
		List<Result> resultList = new ArrayList<Result>();
		List<Testable> testableList = exam.createExam(new Turkish(), new Math(), new Social(), new Science());
		Result resultD = new Result(testableList, new DigitalScore());
		Result resultE = new Result(testableList, new EqualFocusScore());
		Result resultV = new Result(testableList, new VerbalScore());
		resultList.add(resultD);
		resultList.add(resultE);
		resultList.add(resultV);
//		scoreResult.allSubjectScore(resultList);
		scoreResult.allScore(resultList);
	}

}
