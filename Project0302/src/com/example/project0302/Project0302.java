package com.example.project0302;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


/*

Instructions:  I've created a basic spinner.  Review the three types of
intents we discussed:

Explicit - same package (app)
Explicit - different package (app)
Implicit 

Add one of each type to the "onClickListener" method.  You can use a switch
statement against the spinner position to determine the selected item.  Name
the selection by updating the "data" array.

For each intent, start a new activity.  The activities called by explicit
intents should indicate what intent was called.

Don't forget to update the manifest file with the new activity entry!

*/
public class Project0302 extends Activity {

	Spinner spinner;
	Button processButton;
	
	String[] data = { "one", "two", "three" };
	ArrayAdapter<String> adapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.screen001);

		// link up spinner and process button
		spinner = (Spinner) findViewById(R.id.spinner);
		processButton = (Button) findViewById(R.id.process);
		
		// set adapter to spinner
		adapter = new ArrayAdapter<String>(this, R.layout.row, R.id.entry, data);
		spinner.setAdapter(adapter);

        // set listener  
        processButton.setOnClickListener(new OnClickListener() {
        	@Override
    		public void onClick(View v) {
        		
        		int selectedItem = spinner.getLastVisiblePosition();
        		
     		}
        });

	}

}
