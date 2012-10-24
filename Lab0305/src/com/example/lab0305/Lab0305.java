package com.example.lab0305;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Lab0305 extends Activity {

	// define the button
	Button stopButton;
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.screen001);
		Log.v("log", "onCreate");
		
	     // link the button to the XML definition
        stopButton = (Button) findViewById(R.id.stop);
        
        // set listener - notice definition is in line 
        stopButton.setOnClickListener(new OnClickListener() {
        	@Override
    		public void onClick(View v) {
        		finish();
      	}
        });
		
	}

	@Override
	public void onStart() {
		super.onStart();
		Log.v("log", "onStart");
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.v("log", "onResume");
	}

	@Override
	public void onPause() {
		super.onPause();
		Log.v("log", "onPause");
	}

	@Override
	public void onStop() {
		super.onStop();
		Log.v("log", "onStop");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.v("log", "onDestroy");
	}

}
