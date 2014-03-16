package com.pawanpalcic.antardhvani2014;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Other extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.other);
		Button tendor2 = (Button) findViewById(R.id.tendor);
		tendor2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent tendor3 = new Intent(android.content.Intent.ACTION_VIEW);
                tendor3.setData(Uri.parse("http://www.du.ac.in/fileadmin/DU/Administration/pdf/23102013_GB_II_Antardhvani_Tender.pdf"));
                    startActivity(tendor3);
			}
		});
		Button corri1 = (Button) findViewById(R.id.cor1);
		corri1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent corri2 = new Intent(android.content.Intent.ACTION_VIEW);
                corri2.setData(Uri.parse("http://www.du.ac.in/fileadmin/DU/Events/081113_Corrigendum_Antradhvani.PDF"));
                    startActivity(corri2);
			}
		});
		Button cor1 = (Button) findViewById(R.id.cor2);
		cor1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent cor2 = new Intent(android.content.Intent.ACTION_VIEW);
                cor2.setData(Uri.parse("http://www.du.ac.in/fileadmin/DU/Administration/pdf/12112013_GB_II_CorriAntardhvani_Tender.pdf"));
                    startActivity(cor2);
			}
		});
		Button noti = (Button) findViewById(R.id.notifi);
		noti.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent notification = new Intent(android.content.Intent.ACTION_VIEW);
                notification.setData(Uri.parse("http://www.du.ac.in/fileadmin/DU/about_du/PDF/19913_Notification_Committee_Antardhvani_2014.pdf"));
                    startActivity(notification);
			}
		});
		Button in = (Button) findViewById(R.id.innovation);
		in.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent inpr = new Intent(android.content.Intent.ACTION_VIEW);
                inpr.setData(Uri.parse("http://www.du.ac.in/fileadmin/DU/about_du/PDF/19913_Notification_Committee_Antardhvani_2014.pdf"));
                    startActivity(inpr);
			}
		});
		
	}

	
}
