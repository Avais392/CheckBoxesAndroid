package com.allmycode.lists;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MyOptionsActivity extends Activity{
	public final static String EXTRA_MESSAGE = "com.allmycode.lists.MESSAGE";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.my_options_layout);
	}

	public void onSettingClick(View view){
		Intent intent = new Intent(this, MySettingsActivity.class);
		startActivity(intent);
	}

	public void onSendClick(View view){
		Intent intent = new Intent(this, MySendActivity.class);
		EditText editText = (EditText) findViewById(R.id.send_edit_text);
		String message = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(intent);
	}
}
