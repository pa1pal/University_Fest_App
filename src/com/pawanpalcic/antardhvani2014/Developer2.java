package com.pawanpalcic.antardhvani2014;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Developer2 extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.developer2);
		ImageButton fbp = (ImageButton) findViewById(R.id.fb);
		fbp.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent facebook = new Intent(android.content.Intent.ACTION_VIEW);
                facebook.setData(Uri.parse("https://www.facebook.com/pa1.pal"));
                    startActivity(facebook);
			}
		});
	}

	
}
