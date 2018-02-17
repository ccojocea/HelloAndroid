package com.example.android.ccojocea.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class MainActivity extends AppCompatActivity {

    @SuppressWarnings("FieldCanBeLocal")
    private final int SCREEN_WIDTH_PIXELS = 520;

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
