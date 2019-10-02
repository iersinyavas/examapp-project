package com.artsoft.examapp.core.model.subject;

public class Subject {
	
	protected String subjectName;
	protected int unanswered;
	protected int trueQuantity;
	protected int falseQuantity;
	protected int questionQuantity;
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
		System.out.println("Boþ sayýsý : " + unanswered);
		this.unanswered = unanswered;
	}
	public int getTrueQuantity() {
		return trueQuantity;
	}
	public void setTrueQuantity(int trueQuantity) {
		System.out.println("Doðru sayýsý : " + trueQuantity);
		this.trueQuantity = trueQuantity;
	}
	public int getFalseQuantity() {
		return falseQuantity;
	}
	public void setFalseQuantity(int falseQuantity) {
		System.out.println("Yanlýþ sayýsý : " + falseQuantity);
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

}
