package com.example.lab0310;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Lab0310 extends Activity {

	ListView list;

	String[] data = { "item1", "item2", "item3" };
	ArrayAdapter<String> adapter;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen001);

		// link up list view
		list = (ListView) findViewById(R.id.list);
		
		// you can use android textview layout or create your own textview layout
		//adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
		adapter = new ArrayAdapter<String>(this, R.layout.row, data);
		
		// set the adapter
		list.setAdapter(adapter);

    
    }
}
