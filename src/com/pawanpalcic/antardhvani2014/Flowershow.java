package com.pawanpalcic.antardhvani2014;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Flowershow extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flowershow);
		Button entry2 = (Button) findViewById(R.id.entry);
		entry2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent entry3 = new Intent(android.content.Intent.ACTION_VIEW);
                entry3.setData(Uri.parse("http://www.du.ac.in/fileadmin/DU/Events/antardhvani-14/09012014_Flower-Show-Entry-form-for-Schools.pdf"));
                    startActivity(entry3);
			}
		});
		Button entry4 = (Button) findViewById(R.id.entry2);
		entry4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent entry5 = new Intent(android.content.Intent.ACTION_VIEW);
                entry5.setData(Uri.parse("http://www.du.ac.in/fileadmin/DU/Events/antardhvani-14/09012014-Flower-Show-Entry-form-for-Colleges.pdf"));
                    startActivity(entry5);
			}
		});Button entry6 = (Button) findViewById(R.id.details);
		entry6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent entry7 = new Intent(android.content.Intent.ACTION_VIEW);
                entry7.setData(Uri.parse("http://www.du.ac.in/fileadmin/DU/Events/antardhvani-14/09012014-Award-of-Special-merit-Best-mali.pdf"));
                    startActivity(entry7);
			}
		});
	}

	
}
