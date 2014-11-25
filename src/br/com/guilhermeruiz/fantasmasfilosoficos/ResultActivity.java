package br.com.guilhermeruiz.fantasmasfilosoficos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		
		Button menuButton = (Button) findViewById(R.id.menuButton);
		menuButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		TextView aristoteles = (TextView) findViewById(R.id.aristotleTitleTextView);
		float a = new Float(FantasmasFilosoficos.PERCENT_ARISTOTLE/7.0);
		aristoteles.setText(getString(R.string.aristotle, String.format("%.2f", a)+"%"));

		TextView kant = (TextView) findViewById(R.id.kantTitleTextView);
		float k = FantasmasFilosoficos.PERCENT_KANT/7;
		kant.setText(getString(R.string.kant, String.format("%.2f", k)+"%"));

		TextView plato = (TextView) findViewById(R.id.platoTitleTextView);
		float p = FantasmasFilosoficos.PERCENT_PLATO/7;
		plato.setText(getString(R.string.plato, String.format("%.2f", p)+"%"));

		TextView socrates = (TextView) findViewById(R.id.socratesTitleTextView);
		float s = FantasmasFilosoficos.PERCENT_SOCRATES/7;
		socrates.setText(getString(R.string.socrates, String.format("%.2f", s)+"%"));
		
		FantasmasFilosoficos.resetValues();
	}

}
