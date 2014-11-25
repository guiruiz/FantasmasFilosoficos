package br.com.guilhermeruiz.fantasmasfilosoficos.questions;

import br.com.guilhermeruiz.fantasmasfilosoficos.FantasmasFilosoficos;

public class Question2 extends Question {

	public Question2(){
		question = "Você está chegando em casa e vê seu vizinho deixar uma nota de R$ 100,00 cair no chão. O que você faz?";
		answearA = "Pego o dinheiro para mim. Esse valor não vai fazer falta para ele, afinal ele é um advogado e ganha bem mais do que eu.";
		answearB = "Não tenho tempo a perder. Entro em casa e minha vida segue normalmente.";
		answearC = "Pego o dinheiro e devolvo a ele.";
		answearD = "Pego o dinheiro emprestado e devolvo uma semana depois.";
		nextQuestion = new Question3();
		
	}
	
	@Override
	public void computePercentages(String answer) {
		switch (answer) {
		case "answerA":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 45;
			FantasmasFilosoficos.PERCENT_KANT += 35;
			FantasmasFilosoficos.PERCENT_PLATO += 10;
			FantasmasFilosoficos.PERCENT_SOCRATES += 10;
			break;
		case "answerB":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 50;
			FantasmasFilosoficos.PERCENT_KANT += 10;
			FantasmasFilosoficos.PERCENT_PLATO += 10;
			FantasmasFilosoficos.PERCENT_SOCRATES += 30;
			break;
		case "answerC":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 10;
			FantasmasFilosoficos.PERCENT_KANT += 10;
			FantasmasFilosoficos.PERCENT_PLATO += 50;
			FantasmasFilosoficos.PERCENT_SOCRATES += 30;
			break;
		case "answerD":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 20;
			FantasmasFilosoficos.PERCENT_KANT += 50;
			FantasmasFilosoficos.PERCENT_PLATO += 10;
			FantasmasFilosoficos.PERCENT_SOCRATES += 20;
			break;
		}
	}

}
