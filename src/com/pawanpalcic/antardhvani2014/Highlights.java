package com.pawanpalcic.antardhvani2014;


import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Highlights extends Activity{

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.highlights);
		WebView du = (WebView) findViewById(R.id.webView1);
		CustomWebViewClient myCustomWebViewClient = new CustomWebViewClient();
		du.setWebViewClient(myCustomWebViewClient);
		du.getSettings().setJavaScriptEnabled(true);
	    du.loadUrl("http://cician.tk/");
	     
	}
	private class CustomWebViewClient extends WebViewClient{

		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			// TODO Auto-generated method stub
			
			view.loadUrl(url);
			return false;
		
		}
		
}
}
