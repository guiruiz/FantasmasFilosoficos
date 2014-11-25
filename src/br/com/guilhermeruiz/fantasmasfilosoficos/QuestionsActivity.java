package br.com.guilhermeruiz.fantasmasfilosoficos;

import br.com.guilhermeruiz.fantasmasfilosoficos.R;
import br.com.guilhermeruiz.fantasmasfilosoficos.R.layout;
import br.com.guilhermeruiz.fantasmasfilosoficos.questions.Question;
import br.com.guilhermeruiz.fantasmasfilosoficos.questions.Question1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionsActivity extends Activity {

	TextView questionTextView;
	RadioGroup radioGroup;
	RadioButton answerA;
	RadioButton answerB;
	RadioButton answerC;
	RadioButton answerD;
	Button okButton;
	Question currentQuestion;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_questions);
		questionTextView = (TextView) findViewById(R.id.questionTextView);
		radioGroup = (RadioGroup) findViewById(R.id.radioAnswers);
		answerA = (RadioButton) findViewById(R.id.answerA);
		answerB = (RadioButton) findViewById(R.id.answerB);
		answerC = (RadioButton) findViewById(R.id.answerC);
		answerD = (RadioButton) findViewById(R.id.answerD);
		okButton = (Button) findViewById(R.id.okButton);
		currentQuestion = new Question1();
		setQuestion();

		okButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				int selectedId = radioGroup.getCheckedRadioButtonId();
				String resouceName = getResources().getResourceEntryName(selectedId);
				currentQuestion.computePercentages(resouceName);
				
				if(currentQuestion.getNextQuestion() == null){
					Intent intent =  new Intent(QuestionsActivity.this, ResultActivity.class);
					startActivity(intent);
					finish();
				}else{
					currentQuestion = currentQuestion.getNextQuestion();
					setQuestion();
					answerA.setChecked(true);
				}
			}

		});

	}

	@Override
	public void onBackPressed() {
	}

	public void setQuestion() {
		questionTextView.setText(currentQuestion.getQuestion());
		answerA.setText(currentQuestion.getAnswearA());
		answerB.setText(currentQuestion.getAnswearB());
		answerC.setText(currentQuestion.getAnswearC());
		answerD.setText(currentQuestion.getAnswearD());
	}

}
