package br.com.guilhermeruiz.fantasmasfilosoficos.questions;

import br.com.guilhermeruiz.fantasmasfilosoficos.FantasmasFilosoficos;

public class Question7 extends Question {

	public Question7(){
		question = "Qual dessas formas melhor te define?";
		answearA = "Apenas um cidad�o fazendo a sua parte.";
		answearB = "Uma esp�cie de m�rtir que busca sempre o bem.";
		answearC = "Algu�m que acredita que tudo em modera��o � a melhor forma de viver.";
		answearD = "Uma pessoa que busca acima de tudo, aprimorar-se sempre.";
		nextQuestion = null; 
		
	}
	
	@Override
	public void computePercentages(String answer) {
		switch (answer) {
		case "answerA":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 15;
			FantasmasFilosoficos.PERCENT_KANT += 10;
			FantasmasFilosoficos.PERCENT_PLATO += 25;
			FantasmasFilosoficos.PERCENT_SOCRATES += 50;
			break;
		case "answerB":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 15;
			FantasmasFilosoficos.PERCENT_KANT += 10;
			FantasmasFilosoficos.PERCENT_PLATO += 50;
			FantasmasFilosoficos.PERCENT_SOCRATES += 25;
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
