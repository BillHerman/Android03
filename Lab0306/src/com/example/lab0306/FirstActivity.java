package com.example.lab0306;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/*    
This app demonstrates calling one activity from another using an 
explicit intent and passing a value through a bundle.

*/

public class FirstActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen001);

        // define the button and an anonomous listener 
        Button startButton = (Button)findViewById(R.id.startbutton);
        startButton.setOnClickListener(new OnClickListener() {
        	
        	public void onClick(View v) {
        		
        		// define the explicit intent
        		Intent explicitIntent = new Intent(FirstActivity.this,SecondActivity.class);
        		
        		// bundle contains a single string "Bob"
				Bundle bundle = new Bundle();
				bundle.putString("greeting", "Bob");
				explicitIntent.putExtras(bundle);
        		
				// start the second activity
        		startActivity(explicitIntent);
        	}
        });
    
    
    
    
    }

}
