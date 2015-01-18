package com.tuochgame;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
 
public class MainActivity extends Activity implements OnClickListener{
    
    private Button button1;
    private Button button2;
    private int setid;
    private int sukoa;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item);
        sukoa = 0;
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
         
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		TextView textview1=(TextView)findViewById(R.id.text1);
		v.getId();
		textview1.setText(sukoa);
	}
	
	public void checkFlag(int id){
		if(id == setid){
			sukoa++;
		}
	}
 
}
