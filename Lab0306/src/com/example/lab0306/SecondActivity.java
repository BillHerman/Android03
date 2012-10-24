package com.example.lab0306;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen002);
    
        // pull the greeting from the passed bundle
		Bundle bundle = this.getIntent().getExtras(); 
		String greeting = bundle.getString("greeting");
	
		 // pull in textview definition 
        TextView message = (TextView)findViewById(R.id.message);
        
        // set text to passed value and message
        message.setText(greeting + " - this is the second activity.");
    
    
    }	
	
	
}
