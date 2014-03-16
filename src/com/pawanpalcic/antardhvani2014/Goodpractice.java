package com.pawanpalcic.antardhvani2014;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Goodpractice extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.goodpractice);
		Button theme = (Button) findViewById(R.id.theme);
		theme.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent theme2 = new Intent(android.content.Intent.ACTION_VIEW);
                theme2.setData(Uri.parse("http://www.du.ac.in/fileadmin/DU/Events/antardhvani-13/051113_GUIDELINES_Antardhvani2014.pdf"));
                    startActivity(theme2);
			}
		});
		Button rules = (Button) findViewById(R.id.rules);
		rules.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent rules2 = new Intent(android.content.Intent.ACTION_VIEW);
                rules2.setData(Uri.parse("http://www.du.ac.in/fileadmin/DU/Events/06112013letterAntardhvani%20_AwardsofGoodPractice_Guidelines.pdf"));
                    startActivity(rules2);
			}
		});
		Button judge = (Button) findViewById(R.id.judging);
		judge.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent judge2 = new Intent(android.content.Intent.ACTION_VIEW);
                judge2.setData(Uri.parse("http://www.du.ac.in/fileadmin/DU/Events/antardhvani-14/09012014_Guidelines_Judging.pdf"));
                    startActivity(judge2);
			}
		});
		Button rulesand = (Button) findViewById(R.id.rulesand);
		rulesand.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent rulesand2 = new Intent(android.content.Intent.ACTION_VIEW);
                rulesand2.setData(Uri.parse("http://www.du.ac.in/fileadmin/DU/Events/12122013_awards-for-good-practice_pg-guidelines.pdf"));
                    startActivity(rulesand2);
			}
		});
	}

	
}
