package com.example.project0301;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/*  
 This app uses the XML onClick parameter to invoke myClickEvent.

 Take this basic logic and transfer it to a new project using
 one of the other three listener configurations:

 Anonymous : The listener is defined in line to the event listener.
 
 Explicit: The listener is defined as a separate object.
 
 Interface : The listener is defined as part of the activity as an 
 interface.

 */

public class Project0301 extends Activity {

	// define the button
	Button updateButton;
	EditText questionEditText;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.screen001);

		// get definition from XML
		updateButton = (Button) findViewById(R.id.name);
		questionEditText = (EditText) findViewById(R.id.question);

	}

	// referenced in the XML file
	public void myClickEvent(View view) {
		// pull name from EditText and transfer to Button
		String name = questionEditText.getText().toString();
		updateButton.setText(name);
	}
}
