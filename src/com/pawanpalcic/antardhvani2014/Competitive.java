package com.pawanpalcic.antardhvani2014;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

public class Competitive extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.competitive);
		RelativeLayout rl = (RelativeLayout)findViewById(R.id.rl);
		rl.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent Brochure = new Intent(android.content.Intent.ACTION_VIEW);
                Brochure.setData(Uri.parse("http://antardhvani2014.du.ac.in/pdf/brochure.pdf"));
                startActivity(Brochure);
				finish();
			}
		});
 
	}

	
}
