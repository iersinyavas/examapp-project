package com.artsoft.examapp.core.model.subject;

import java.util.List;

import com.artsoft.examapp.core.interfaces.util.QuestionQuantity;
import com.artsoft.examapp.core.interfaces.util.SubjectAnswerKey;
import com.artsoft.examapp.core.interfaces.util.SubjectNameKey;
import com.artsoft.examapp.core.interfaces.util.SubjectQuestionKey;
import com.artsoft.examapp.core.interfaces.util.UnTestable;
import com.artsoft.examapp.core.model.util.ExamRequirement;

public class Literature extends VerbalSubject implements UnTestable {

	@Override
	public List<String> answerKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int questionQuantity() {
		return QuestionQuantity.LITERATURE_QUESTION_QUANTITY_2;
	}
	
	@Override
	public int getQuestionQuantity() {
		return QuestionQuantity.LITERATURE_QUESTION_QUANTITY_2;
	}

	@Override
	public String getSubjectName() {
		return SubjectNameKey.LITERATURE;
	}
	
	@Override
	public String getSubjectAnswerKey() {
		return SubjectAnswerKey.KEY_A_LITERATURE;
	}

	@Override
	public String getSubjectQuestionKey() {
		return SubjectQuestionKey.KEY_Q_LITERATURE;
	}

	@Override
	public String getSubjectNameKey(ExamRequirement examRequirement) {
		return examRequirement.getSubjectNameKey(this);
	}

}
