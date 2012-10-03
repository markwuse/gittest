package com.mark.git.test;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MarkGitTestActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Log.v("Mark wang","for test");
    }
}