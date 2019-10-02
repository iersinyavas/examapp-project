package com.artsoft.examapp.core.interfaces.util;

import java.util.List;
import com.artsoft.examapp.core.model.Student;
import com.artsoft.examapp.core.model.subject.Subject;

public interface Exam {
	
	List<Test> testList();
	int studentQuantity();
	List<Student> examScore(Student student);
	List<Testable> createExam(Subject... subjects);

}
