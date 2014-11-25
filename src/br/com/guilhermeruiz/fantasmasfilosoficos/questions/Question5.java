package br.com.guilhermeruiz.fantasmasfilosoficos.questions;

import br.com.guilhermeruiz.fantasmasfilosoficos.FantasmasFilosoficos;

public class Question5 extends Question {

	public Question5(){
		question = "Tendo em vista que a ética diz respeito aos bons costumes e a moral, qual dessas alternativas remete ao seu pensamento?";
		answearA = "Uma boa conduta ética tem como fonte Deus.";
		answearB = "Deve-se viver uma vida eticamente dentro dos parâmetros legais.";
		answearC = "O que define uma boa ética é sem dúvida a intenção do ser.";
		answearD = "Ser ético faz-nos ser felizes.";
		nextQuestion = new Question6();
		
	}
	
	@Override
	public void computePercentages(String answer) {
		switch (answer) {
		case "answerA":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 30;
			FantasmasFilosoficos.PERCENT_KANT += 30;
			FantasmasFilosoficos.PERCENT_PLATO += 20;
			FantasmasFilosoficos.PERCENT_SOCRATES += 20;
			break;
		case "answerB":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 10;
			FantasmasFilosoficos.PERCENT_KANT += 10;
			FantasmasFilosoficos.PERCENT_PLATO += 30;
			FantasmasFilosoficos.PERCENT_SOCRATES += 50;
			break;
		case "answerC":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 20;
			FantasmasFilosoficos.PERCENT_KANT += 50;
			FantasmasFilosoficos.PERCENT_PLATO += 20;
			FantasmasFilosoficos.PERCENT_SOCRATES += 10;
			break;
		case "answerD":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 50;
			FantasmasFilosoficos.PERCENT_KANT += 20;
			FantasmasFilosoficos.PERCENT_PLATO += 15;
			FantasmasFilosoficos.PERCENT_SOCRATES += 15;
			break;
		}
	}

}
