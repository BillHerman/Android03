package com.example.lab0304;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/* 

This is number four of four example apps.  This app demonstrates the use 
of the onclick XML option to invoke the proper method.
 
 */

public class Lab0304 extends Activity {

	// define the button
	Button stopButton;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen001);

        // get definition from XML
        stopButton = (Button) findViewById(R.id.sign);
        
    }

    // this is the method that gets called from the XML file
    public void myClickEvent(View view)
    {
   		stopButton.setText(getResources().getText(R.string.stop));
		stopButton.setBackgroundColor(getResources().getColor(
						R.color.red));
    }


    
    
}
