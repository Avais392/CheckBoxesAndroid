package com.allmycode.lists;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends ActionBarActivity {
	static CheckBox[] checkBoxes = new CheckBox[5];
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		LinearLayout layout = (LinearLayout) findViewById(R.id.linear_layout);
		
		for(int i = 0; i < 5; i++){
			checkBoxes[i] = new CheckBox(this);
			layout.addView(checkBoxes[i]);
		}
		
	}
	
	public void onShowListClick(View view){
		Intent intent = new Intent(this, MyListActivity.class);
		startActivity(intent);
	}

	public void onShowOtherOptionsClick(View view){
		Intent intent = new Intent(this, MyOptionsActivity.class);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
