package com.example.solution0301;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Solution0301 extends Activity {

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

        
        // set listener - notice definition is in line 
        updateButton.setOnClickListener(new OnClickListener() {
        	@Override
    		public void onClick(View v) {
        		// pull name from EditText and transfer to Button
        		String name = questionEditText.getText().toString();
        		updateButton.setText(name);
    		}
        });
		
		
	}

}
