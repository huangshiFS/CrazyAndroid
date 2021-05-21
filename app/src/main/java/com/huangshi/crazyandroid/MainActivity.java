package com.huangshi.crazyandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ClassLoader classLoader = MainActivity.class.getClassLoader();
        while (classLoader != null){
            Log.d("classloader ->  ",classLoader.toString());
            classLoader = classLoader.getParent();
        }
    }
}