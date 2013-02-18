package net.learn2develop.BasicViews4;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;
import android.app.Dialog;
import android.app.TimePickerDialog;

public class MainActivity extends Activity {
	TimePicker timePicker;
	
	int hour, minute;
	static final int TIME_DIALOG_ID = 0;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        showDialog(TIME_DIALOG_ID);
        
        timePicker = (TimePicker) findViewById(R.id.timePicker);
        timePicker.setIs24HourView(false);
        
        //---Button View---
        Button btnOpen = (Button) findViewById(R.id.btnSet);
        btnOpen.setOnClickListener(new View.OnClickListener() {
			
			
			public void onClick(View v) {
				Toast.makeText(getBaseContext(), "Time selected:" + timePicker.getCurrentHour() + ":" + timePicker.getCurrentMinute(),
						Toast.LENGTH_SHORT).show();
				
			}
		});
        
    }
    
    @Override
    protected Dialog onCreateDialog(int id) {
    	switch (id) {
    		case TIME_DIALOG_ID:
    			return new TimePickerDialog(
    					this, mTimeSetListener, hour, minute, false);
    	}
    	return null;
    }
    
    private TimePickerDialog.OnTimeSetListener mTimeSetListener =
    		new TimePickerDialog.OnTimeSetListener() {
    			public void onTimeSet(
    			TimePicker view, int hourOfDay, int minuteOfHour){
    				hour = hourOfDay;
    				minute = minuteOfHour;
    				Toast.makeText(getBaseContext(),
    						"You have selected : " + hour + ":" + minute,
    						Toast.LENGTH_SHORT).show();
    			}
    };
    
}