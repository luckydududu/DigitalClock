package com.yepstudio.widget.digitalclock;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * http://demo.tutorialzine.com/2013/06/digital-clock-adding-alarms/
 * @author wb-zhangzhiliang.z
 *
 */
public class MainActivity extends Activity {
	
	private RelativeLayout mLayoutClock;
	private LinearLayout mLayoutDisplay; 
	private ImageView mImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
