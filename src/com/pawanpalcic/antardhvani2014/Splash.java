package com.pawanpalcic.antardhvani2014;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(1300);
				}catch (InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent z = new Intent("com.pawanpalcic.antardhvani2014.Home");
					startActivity(z);
					finish();
				}
			}
	};
	timer.start();
	
}
}
