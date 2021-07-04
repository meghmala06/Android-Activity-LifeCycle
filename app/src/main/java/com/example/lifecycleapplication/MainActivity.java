package com.example.lifecycleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String tag="Lifecycle Stages";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag,"In the onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag,"In the onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag,"In the onRestart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag,"In the onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag,"In the onStop()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"In the onResume()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag,"In the onDestroy()");
    }
}