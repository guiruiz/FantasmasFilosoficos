package br.com.guilhermeruiz.fantasmasfilosoficos.questions;

import br.com.guilhermeruiz.fantasmasfilosoficos.FantasmasFilosoficos;

public class Question4 extends Question {

	public Question4(){
		question = "Você acredita que deve viver para ser qual tipo de pessoa?";
		answearA = "Uma pessoa que entende e aceita os absurdos da vida.";
		answearB = "Alguém que é sobretudo, virtuoso.";
		answearC = "Uma pessoa ética, que age sempre de boa vontade.";
		answearD = "Alguém que vive de acordo com as suas intenções.";
		nextQuestion = new Question5();
		
	}
	
	@Override
	public void computePercentages(String answer) {
		switch (answer) {
		case "answerA":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 30;
			FantasmasFilosoficos.PERCENT_KANT += 20;
			FantasmasFilosoficos.PERCENT_PLATO += 25;
			FantasmasFilosoficos.PERCENT_SOCRATES += 25;
			break;
		case "answerB":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 10;
			FantasmasFilosoficos.PERCENT_KANT += 10;
			FantasmasFilosoficos.PERCENT_PLATO += 30;
			FantasmasFilosoficos.PERCENT_SOCRATES += 50;
			break;
		case "answerC":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 20;
			FantasmasFilosoficos.PERCENT_KANT += 20;
			FantasmasFilosoficos.PERCENT_PLATO += 50;
			FantasmasFilosoficos.PERCENT_SOCRATES += 10;
			break;
		case "answerD":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 30;
			FantasmasFilosoficos.PERCENT_KANT += 50;
			FantasmasFilosoficos.PERCENT_PLATO += 10;
			FantasmasFilosoficos.PERCENT_SOCRATES += 10;
			break;
		}
	}

}
