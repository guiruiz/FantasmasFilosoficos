package br.com.guilhermeruiz.fantasmasfilosoficos.questions;

import br.com.guilhermeruiz.fantasmasfilosoficos.FantasmasFilosoficos;

public class Question3 extends Question {

	public Question3(){
		question = "O veterin�rio diz que seu cachorrinho tem uma doen�a rara e que tem 5% de chances de sobreviver ou morer� em menos de um ano. O que voc� faz?";
		answearA = "Aplico nele uma inje��o letal. Acabo com o sofrimento dele e com o meu.";
		answearB = "Tento cuidar dele da melhor forma poss�vel at� seus �ltimos dias. Afinal estamos falando de uma vida.";
		answearC = "Cuido dele normalmente, talvez sobreviva.";
		answearD = "N�o suporto ver sofrimento, mas tamb�m n�o posso tomar a decis�o de enterromper uma vida. Entrego ele em uma institui��o.";
		nextQuestion = new Question4();
		
	}
	
	@Override
	public void computePercentages(String answer) {
		switch (answer) {
		case "answerA":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 30;
			FantasmasFilosoficos.PERCENT_KANT += 50;
			FantasmasFilosoficos.PERCENT_PLATO += 10;
			FantasmasFilosoficos.PERCENT_SOCRATES += 10;
			break;
		case "answerB":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 20;
			FantasmasFilosoficos.PERCENT_KANT += 20;
			FantasmasFilosoficos.PERCENT_PLATO += 50;
			FantasmasFilosoficos.PERCENT_SOCRATES += 10;
			break;
		case "answerC":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 20;
			FantasmasFilosoficos.PERCENT_KANT += 50;
			FantasmasFilosoficos.PERCENT_PLATO += 20;
			FantasmasFilosoficos.PERCENT_SOCRATES += 20;
			break;
		case "answerD":
			FantasmasFilosoficos.PERCENT_ARISTOTLE += 30;
			FantasmasFilosoficos.PERCENT_KANT += 10;
			FantasmasFilosoficos.PERCENT_PLATO += 10;
			FantasmasFilosoficos.PERCENT_SOCRATES += 50;
			break;
		}
	}

}
