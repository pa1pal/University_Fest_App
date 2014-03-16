package com.pawanpalcic.antardhvani2014;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Home extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		Button imageButton1 = (Button) findViewById(R.id.button1);
		imageButton1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent abouti = new Intent ("com.pawanpalcic.antardhvani2014.About");
				startActivity(abouti);
			}
		});
		Button competitive2 = (Button) findViewById(R.id.button2);
		competitive2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent compete = new Intent ("com.pawanpalcic.antardhvani2014.Competitive");
				startActivity(compete);
			}
		});
		
		Button imageButton3 = (Button) findViewById(R.id.button3);
		imageButton3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent noncomp = new Intent ("com.pawanpalcic.antardhvani2014.Noncompetitive");
				startActivity(noncomp);
			}
		});
		Button special = (Button) findViewById(R.id.button4);
		special.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent spe = new Intent ("com.pawanpalcic.antardhvani2014.Special");
				startActivity(spe);
			}
		});
		Button flowershowdu = (Button) findViewById(R.id.button5);
		flowershowdu.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent flower = new Intent ("com.pawanpalcic.antardhvani2014.Flowershow");
				startActivity(flower);
			}
		});
		Button goodpractice2 = (Button) findViewById(R.id.button6);
		goodpractice2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent good = new Intent ("com.pawanpalcic.antardhvani2014.Goodpractice");
				startActivity(good);
			}
		});
		Button imageButton7 = (Button) findViewById(R.id.button7);
		imageButton7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent day = new Intent ("com.pawanpalcic.antardhvani2014.Schedule");
				startActivity(day);
			}
		});
		Button other = (Button) findViewById(R.id.button8);
		other.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent other2 = new Intent ("com.pawanpalcic.antardhvani2014.Other");
				startActivity(other2);
			}
		});
		Button contactus = (Button) findViewById(R.id.button9);
		contactus.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent contact = new Intent ("com.pawanpalcic.antardhvani2014.Contactus");
				startActivity(contact);
			}
		});
		Button map = (Button) findViewById(R.id.button10);
		map.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent map = new Intent(android.content.Intent.ACTION_VIEW);
                map.setData(Uri.parse("http://goo.gl/maps/v07dV"));
                    startActivity(map);
			}
		});
		Button highlights = (Button) findViewById(R.id.button11);
		highlights.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent high = new Intent("com.pawanpalcic.antardhvani2014.Highlights");
		        startActivity(high);
			}
		});
		Button registration = (Button) findViewById(R.id.button12);
		registration.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent registration2 = new Intent(android.content.Intent.ACTION_VIEW);
				registration2.setData(Uri.parse("http://antardhvani2014.du.ac.in/registration.html"));
                    startActivity(registration2);
			}
		});
		Button Rulas = (Button) findViewById(R.id.button13);
		Rulas.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent rulas2 = new Intent(android.content.Intent.ACTION_VIEW);
				rulas2.setData(Uri.parse("http://antardhvani2014.du.ac.in/pdf/rules.pdf"));
                    startActivity(rulas2);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		super.onCreateOptionsMenu(menu);
		MenuInflater blowUp = getMenuInflater();
		blowUp.inflate(R.menu.developer , menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
		case R.id.dev:
			Intent fbpal = new Intent("com.pawanpalcic.antardhvani2014.Developer2");
			startActivity(fbpal);		
			break;
		case R.id.exit:
			finish();
			
			break;
		}
		return false;
	}
}
