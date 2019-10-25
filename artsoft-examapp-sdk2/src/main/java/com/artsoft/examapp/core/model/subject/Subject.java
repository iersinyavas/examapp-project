package com.artsoft.examapp.core.model.subject;

import com.artsoft.examapp.core.model.util.Result;

public class Subject {
	
	protected String subjectName;
	protected int unanswered;
	protected int trueQuantity;
	protected int falseQuantity;
	protected int unanswered2;
	protected int trueQuantity2;
	protected int falseQuantity2;
	protected int questionQuantity;
	protected int questionQuantity2;
	protected String subjectAnswerKey;
	protected String subjectQuestionKey;

	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getUnanswered() {
		return unanswered;
	}
	public void setUnanswered(int unanswered) {
		System.out.println(getSubjectName() + " Boþ sayýsý : " + unanswered);
		this.unanswered = unanswered;
	}
	public int getTrueQuantity() {
		return trueQuantity;
	}
	public void setTrueQuantity(int trueQuantity) {
		System.out.println(getSubjectName() + " Doðru sayýsý : " + trueQuantity);
		this.trueQuantity = trueQuantity;
	}
	public int getFalseQuantity() {
		return falseQuantity;
	}
	public void setFalseQuantity(int falseQuantity) {
		System.out.println(getSubjectName() + " Yanlýþ sayýsý : " + falseQuantity);
		this.falseQuantity = falseQuantity;
	}
	public int getQuestionQuantity() {
		return questionQuantity;
	}
	public void setQuestionQuantity(int questionQuantity) {
		this.questionQuantity = questionQuantity;
	}
	public String getSubjectAnswerKey() {
		return subjectAnswerKey;
	}
	public void setSubjectAnswerKey(String subjectAnswerKey) {
		this.subjectAnswerKey = subjectAnswerKey;
	}
	public String getSubjectQuestionKey() {
		return subjectQuestionKey;
	}
	public void setSubjectQuestionKey(String subjectQuestionKey) {
		this.subjectQuestionKey = subjectQuestionKey;
	}
	public int getUnanswered2() {
		return unanswered2;
	}
	public void setUnanswered2(int unanswered2) {
		System.out.println(getSubjectName() + " Boþ sayýsý : " + unanswered);
		this.unanswered2 = unanswered2;
	}
	public int getTrueQuantity2() {
		return trueQuantity2;
	}
	public void setTrueQuantity2(int trueQuantity2) {
		System.out.println(getSubjectName() + " Doðru sayýsý : " + unanswered);
		this.trueQuantity2 = trueQuantity2;
	}
	public int getFalseQuantity2() {
		return falseQuantity2;
	}
	public void setFalseQuantity2(int falseQuantity2) {
		System.out.println(getSubjectName() + " Yanlýþ sayýsý : " + unanswered);
		this.falseQuantity2 = falseQuantity2;
	}
	public int getQuestionQuantity2() {
		return questionQuantity2;
	}
	public void setQuestionQuantity2(int questionQuantity2) {
		this.questionQuantity2 = questionQuantity2;
	}

}
