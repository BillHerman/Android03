package com.example.solution0302;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

public class Solution0302 extends Activity {

	Spinner spinner;
	Button processButton;
	String[] data = { "explicit-same", "explicit-other", "implicit" };
	ArrayAdapter<String> adapter;
	boolean notFirstTime = false;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.screen001);

		// link up spinner and process button
		spinner = (Spinner) findViewById(R.id.spinner);
		processButton = (Button) findViewById(R.id.process);
	
		adapter = new ArrayAdapter<String>(this, R.layout.row, R.id.entry, data);
		spinner.setAdapter(adapter);

        // set listener  
        processButton.setOnClickListener(new OnClickListener() {
        	@Override
    		public void onClick(View v) {

        		int selectedItem = spinner.getLastVisiblePosition();
        		switch (selectedItem) {

				// first item on spinner - explicit-same
				case 0:

					// define the explicit intent
					Intent explicitIntent = new Intent(Solution0302.this,
							SecondActivity.class);

					// bundle contains a single string "Bob"
					Bundle bundle = new Bundle();
					bundle.putString("greeting", "Bob");
					explicitIntent.putExtras(bundle);

					// start the second activity
					startActivity(explicitIntent);

					break;
				// second item on spinner - explicit-other
				case 1:
					
	        		Intent intent = new Intent("Lab0308.intent.action.Billybob"); 
	        		startActivity(intent); 
	        		
					break;
				// third item on spinner - explicit-other
				case 2:
					
					Intent myIntent = new Intent(Intent.ACTION_VIEW);
					myIntent.setData(Uri.parse("http://www.google.com"));
					startActivity(myIntent);
					
					break;

				}
        	
        	
        	
        	
        	}
        });

		
	}
}
