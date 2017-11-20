package com.example.android.ccojocea.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int SCREEN_WIDTH_PIXELS = 520;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        if (displayMetrics.widthPixels > SCREEN_WIDTH_PIXELS) {
            setContentView(R.layout.activity_main);
        } else {
            setContentView(R.layout.activity_main_small);
        }
    }
}
