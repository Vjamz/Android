package net.learn2develop.BasicViews1;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //---Button view---
        Button btnOpen = (Button) findViewById(R.id.btnOpen);
        btnOpen.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View v) {
        		DisplayToast("Today, You have clicked the Open Button");
        	}
        });
        //---Button view---
        Button btnSave = (Button) findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				DisplayToast("Today, You have clicked the Save Button");
				}
		});
        //---CheckBox---
        CheckBox checkBox = (CheckBox) findViewById(R.id.chkAutosave);
        checkBox.setOnClickListener(new View.OnClickListener() {
        	
			public void onClick(View v) {
				if (((CheckBox)v).isChecked())
					DisplayToast("Today, CheckBox is checked");
				else
					DisplayToast("Today, CheckBox is unchecked");
				
			}
		});
        //---RadioButton---
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rdbGp1);
        radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
        	public void onCheckedChanged(RadioGroup group, int checkedId) {
        		RadioButton rb1 = (RadioButton) findViewById(R.id.rdb1);
        		if (rb1.isChecked()) {
        			DisplayToast("Today, Option 1 checked!");
        		} else {
        			DisplayToast("Today, Option 2 checked!");
        		}
        	}
    });
        //---ToggleButton---
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggle1);
        toggleButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				if (((ToggleButton)v).isChecked())
					DisplayToast("Today, Toggle button is on");
				else
					DisplayToast("Today, Toggle button is off");
				
			}
		});
		
	}
    private void DisplayToast(String msg) {
    	Toast.makeText(getBaseContext(), msg, Toast.LENGTH_SHORT).show();
    }
}