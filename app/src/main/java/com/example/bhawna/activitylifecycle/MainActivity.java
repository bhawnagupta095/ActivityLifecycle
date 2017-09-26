package com.example.bhawna.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("aa","on create");
        Toast.makeText(getApplicationContext(),"Activity created",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("aa","on start");
        Toast.makeText(getApplicationContext(),"Activity started",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("aa","on resume");
        Toast.makeText(getApplicationContext(),"Activity Resumed",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("aa","on pause");
        Toast.makeText(getApplicationContext(),"Activity Paused",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("aa","on stop");
        Toast.makeText(getApplicationContext(),"Activity Stopped",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("aa","on destroy");
        Toast.makeText(getApplicationContext(),"Activity Destroyed",Toast.LENGTH_SHORT).show();
    }
}
