package com.example.lab0302;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/* 

This is number two of four example apps.  This app demonstrates the use 
of an anonymous onClick listener defined as part of the stopButton object.
 
It is called "anonymous" because the listener defintion never gets set to
an explicit listener object. 
 */

public class Lab0302 extends Activity {

	// define the button - notice no onClickListener defintion
	Button stopButton;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen001);

        // link the button to the XML definition
        stopButton = (Button) findViewById(R.id.sign);
        
        // set listener - notice definition is in line 
        stopButton.setOnClickListener(new OnClickListener() {
        	@Override
    		public void onClick(View v) {
        		stopButton.setText(getResources().getText(R.string.stop));
        		stopButton.setBackgroundColor(getResources().getColor(
    							R.color.red));
    		}
        });
        
    }


}
