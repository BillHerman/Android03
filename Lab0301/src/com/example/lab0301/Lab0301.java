package com.example.lab0301;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/* 

This is number one of four example apps.  This app demonstrates the use 
of an explicit onClick listener defined as a separate private object.
 
 */

public class Lab0301 extends Activity {

	// define the button so it is available to all methods
	Button stopButton;
	
	// define the private onClickListener member
	private OnClickListener stopButtonListener = new OnClickListener() {
    	
		// if clicked, set text to "stop" and color to "red"
		@Override
    	public void onClick(View v) {
    		stopButton.setText(getResources().getText(R.string.stop));
    		stopButton.setBackgroundColor(getResources().getColor(
							R.color.red));
		}
    };
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen001);

        // get definition from XML and assign the explicit listener
        stopButton = (Button) findViewById(R.id.sign);
        stopButton.setOnClickListener(stopButtonListener);
        
    }


}
