package br.com.guilhermeruiz.fantasmasfilosoficos.questions;

public abstract class Question {
	String question;	
	String answearA;
	String answearB;
	String answearC;
	String answearD;
	Question nextQuestion;
	
	
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswearA() {
		return answearA;
	}

	public void setAnswearA(String answearA) {
		this.answearA = answearA;
	}

	public String getAnswearB() {
		return answearB;
	}

	public void setAnswearB(String answearB) {
		this.answearB = answearB;
	}

	public String getAnswearC() {
		return answearC;
	}

	public void setAnswearC(String answearC) {
		this.answearC = answearC;
	}

	public String getAnswearD() {
		return answearD;
	}

	public void setAnswearD(String answearD) {
		this.answearD = answearD;
	}


	public abstract void computePercentages(String answer);

	public Question getNextQuestion() {
		return nextQuestion;
	}

	public void setNextQuestion(Question nextQuestion) {
		this.nextQuestion = nextQuestion;
	}
}
