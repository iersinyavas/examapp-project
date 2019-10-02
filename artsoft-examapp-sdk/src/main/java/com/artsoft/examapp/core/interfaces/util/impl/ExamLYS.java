package com.artsoft.examapp.core.interfaces.util.impl;

import java.util.List;

import com.artsoft.examapp.core.interfaces.util.Exam;
import com.artsoft.examapp.core.interfaces.util.ExamType;
import com.artsoft.examapp.core.interfaces.util.Test;
import com.artsoft.examapp.core.interfaces.util.Testable;
import com.artsoft.examapp.core.model.Student;
import com.artsoft.examapp.core.model.subject.Subject;

public class ExamLYS implements Exam, ExamType{

	@Override
	public List<Test> testList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int studentQuantity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> examScore(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Testable> createExam(Subject... subjects) {
		// TODO Auto-generated method stub
		return null;
	}

}
