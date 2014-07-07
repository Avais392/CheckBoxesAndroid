package com.allmycode.lists;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MySendActivity extends Activity{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        // Set the text view as the activity layout
        setContentView(R.layout.my_send_layout);

        // Get the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MyOptionsActivity.EXTRA_MESSAGE);

        // Create a text view
        TextView textView = (TextView) findViewById(R.id.sent_text_view); 
        textView.setText(message);
       
	}
}
