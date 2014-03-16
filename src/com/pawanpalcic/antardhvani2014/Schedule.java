package com.pawanpalcic.antardhvani2014;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Schedule extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.schedule);
		ImageButton day1 = (ImageButton) findViewById(R.id.day1);
		day1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent d1 = new Intent ("com.pawanpalcic.antardhvani2014.Dayone");
				startActivity(d1);
				finish();
			}
		});
		ImageButton day2 = (ImageButton) findViewById(R.id.day2);
		day2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent d2 = new Intent ("com.pawanpalcic.antardhvani2014.Daytwo");
				startActivity(d2);
				finish();
			}
		});
		ImageButton day3 = (ImageButton) findViewById(R.id.day3);
		day3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent d3 = new Intent ("com.pawanpalcic.antardhvani2014.Daythree");
				startActivity(d3);
				finish();
			}
		});
	}

	
}
