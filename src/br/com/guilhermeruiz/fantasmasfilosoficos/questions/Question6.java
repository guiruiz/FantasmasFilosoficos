package br.com.guilhermeruiz.fantasmasfilosoficos.questions;

import br.com.guilhermeruiz.fantasmasfilosoficos.FantasmasFilosoficos;

public class Question6 extends Question {

	public Question6(){
		question = "Qual dessas você julga ser a melhor forma de levar a vida?";
		answearA = "Ser bom.";
		answearB = "Fazer o seu dever.";
		answearC = "Ter controle sobre seus anseios e desejos.";
		answearD = "Desenvolvimento pessoal em primeiro lugar.";
		nextQuestion = new Question7();
		
	}
	
	@Override
	public void computePercentages(String answer) {
		switch (answer) {
		case "answerA":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 15;
			FantasmasFilosoficos.PERCENT_KANT += 10;
			FantasmasFilosoficos.PERCENT_PLATO += 50;
			FantasmasFilosoficos.PERCENT_SOCRATES += 25;
			break;
		case "answerB":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 10;
			FantasmasFilosoficos.PERCENT_KANT += 10;
			FantasmasFilosoficos.PERCENT_PLATO += 30;
			FantasmasFilosoficos.PERCENT_SOCRATES += 50;
			break;
		case "answerC":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 50;
			FantasmasFilosoficos.PERCENT_KANT += 10;
			FantasmasFilosoficos.PERCENT_PLATO += 20;
			FantasmasFilosoficos.PERCENT_SOCRATES += 20;
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
