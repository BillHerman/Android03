package com.example.lab0303;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/* 
 This is number three of four example apps.  This app demonstrates the use 
 of an onClick listener as an interface (see "implements OnClickListener").
 */

public class Lab0303 extends Activity implements OnClickListener {

	// define the button - notice no onClickListener definition
	Button stopButton;

	// define control buttons
	Button setGoButton;
	Button setStopButton;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.screen001);

		// link the buttons to the XML definition
		stopButton = (Button) findViewById(R.id.sign);
		setGoButton = (Button) findViewById(R.id.setGo);
		setStopButton = (Button) findViewById(R.id.setStop);

		// set listener to both control buttons
		setGoButton.setOnClickListener(this);
		setStopButton.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		
		// toggle to "Go" button pressed
		case R.id.setGo:
			stopButton.setText(getResources().getText(R.string.go));
			stopButton.setBackgroundColor(getResources()
					.getColor(R.color.green));
			break;
		// toggle to "Stop" button pressed	
		case R.id.setStop:
			stopButton.setText(getResources().getText(R.string.stop));
			stopButton.setBackgroundColor(getResources().getColor(R.color.red));
			break;
		}

	}

}
