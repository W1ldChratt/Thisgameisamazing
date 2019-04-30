package com.example.thisgameisamazing;

import android.graphics.Color;
import android.graphics.ColorSpace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;

public class MainActivity extends AppCompatActivity{
    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.background);
    }
        public void Canton(View v) {
        view.setBackgroundResource(R.color.red);
        getApplication().setTheme(R.style.Canton);
    }
        public void Plymouth(View v) {

        view.setBackgroundResource(R.color.green);
        getApplication().setTheme(R.style.Plymouth);
        }
         public void Salem(View v) {

        view.setBackgroundResource(R.color.blue);
        getApplication().setTheme(R.style.Salem);
        }

    }



