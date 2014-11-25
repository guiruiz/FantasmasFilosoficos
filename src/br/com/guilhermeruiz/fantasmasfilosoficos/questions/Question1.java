package br.com.guilhermeruiz.fantasmasfilosoficos.questions;

import br.com.guilhermeruiz.fantasmasfilosoficos.FantasmasFilosoficos;

public class Question1 extends Question {

	public Question1(){
		question = "Voc� cursa �tica na mesma turma que seus amigos. Na metade do semestre voc� percebe que com a nota que tem n�o vai conseguir passar, mas a nota do trabalho final faz toda diferen�a para seus amigos. O que voc� faz?";
		answearA = "N�o ajudo ningu�m. Afinal eu n�o vou passar mesmo.";
		answearB = "Ajudo eles com tudo. N�o posso deixar meus amigos na m�o.";
		answearC = "Ajudo eles da forma que posso. Afinal o tempo livre que tenho posso usar com outras mat�rias.";
		answearD = "Ajudo eles se me prometerem me ajudar em outras mat�rias.";
		nextQuestion = new Question2();
		
	}
	
	@Override
	public void computePercentages(String answer) {
		switch (answer) {
		case "answerA":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 25;
			FantasmasFilosoficos.PERCENT_KANT += 25;
			FantasmasFilosoficos.PERCENT_PLATO += 25;
			FantasmasFilosoficos.PERCENT_SOCRATES += 25;
			break;
		case "answerB":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 20;
			FantasmasFilosoficos.PERCENT_KANT += 20;
			FantasmasFilosoficos.PERCENT_PLATO += 50;
			FantasmasFilosoficos.PERCENT_SOCRATES += 10;
			break;
		case "answerC":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 15;
			FantasmasFilosoficos.PERCENT_KANT += 40;
			FantasmasFilosoficos.PERCENT_PLATO += 15;
			FantasmasFilosoficos.PERCENT_SOCRATES += 30;
			break;
		case "answerD":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 50;
			FantasmasFilosoficos.PERCENT_KANT += 20;
			FantasmasFilosoficos.PERCENT_PLATO += 10;
			FantasmasFilosoficos.PERCENT_SOCRATES += 20;
			break;
		}
	}

}
