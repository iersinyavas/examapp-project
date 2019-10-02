package com.artsoft.examapp.core.interfaces.util.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.artsoft.examapp.core.interfaces.util.Exam;
import com.artsoft.examapp.core.interfaces.util.ExamType;
import com.artsoft.examapp.core.interfaces.util.Test;
import com.artsoft.examapp.core.interfaces.util.Testable;
import com.artsoft.examapp.core.model.Student;
import com.artsoft.examapp.core.model.subject.Subject;
import com.artsoft.examapp.core.model.util.ScoreResult;

public class ExamYGS implements Exam, ExamType {

	List<Testable> testables = new ArrayList<>();

	@Override
	public List<Test> testList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int studentQuantity() {
		return new Random().nextInt(100);
	}

	@Override
	public List<Student> examScore(Student student) {

		return null;
	}

	@Override
	public List<Testable> createExam(Subject... subjects) {
		List<Testable> testables = new ArrayList<Testable>();
		ScoreResult scoreResult = new ScoreResult();
		for (Subject subject : subjects) {
			scoreResult.randomSubjectResult(subject);
			testables.add((Testable) subject);
		}
		return testables;
	}

}
