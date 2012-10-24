package com.example.lab0309;

import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Lab0309 extends Activity implements OnClickListener {

	// define a range of buttons
	Button button0;
	Button button1;
	Button button2;


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.screen001);

		// link the buttons to the XML definitions
		button0 = (Button) findViewById(R.id.button0);
		button1 = (Button) findViewById(R.id.button1); 
		button2 = (Button) findViewById(R.id.button2);

		// set listener to all buttons
		button0.setOnClickListener(this);
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		
		// view web site 
		// note: using Intent.ACTION_VIEW
		case R.id.button0:
			Intent intent0 = new Intent(Intent.ACTION_VIEW);
			intent0.setData(Uri.parse("http://www.google.com"));
			startActivity(intent0);
			break;
			
		// start dialer
		// note: no data is passed	
		case R.id.button1:
			Intent intent1 = new Intent(Intent.ACTION_DIAL);
			startActivity(intent1);
			break;
			
		// view contact
		// note: we are using Intent.ACTION_VIEW as in intent0
		case R.id.button2:
    		Intent intent2 = new Intent(Intent.ACTION_VIEW);
			intent2.setData(ContactsContract.Contacts.CONTENT_URI);
    		startActivity(intent2);
    		break;
			
		}

	}
}
