package com.example.lab0307;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Lab0307 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen001);
        Button startButton = (Button)findViewById(R.id.startbutton);
        startButton.setOnClickListener(new OnClickListener() {
        	
        	public void onClick(View v) {
        		// Note: 
        		// "Lab0308" is the app name
        		// "intent.action" defines it as an intent action
        		// "Billybob" is the custom piece
        		Intent intent = new Intent("Lab0308.intent.action.Billybob"); 
        		startActivity(intent); 
        	}
        });

    }


}
