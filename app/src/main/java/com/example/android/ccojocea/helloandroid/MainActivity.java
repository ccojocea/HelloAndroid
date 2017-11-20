package com.example.android.ccojocea.helloandroid;

import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int SCREEN_WIDTH_PIXELS = 520;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
        *   Set gradient to system bars
         */
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            w.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }

        super.onCreate(savedInstanceState);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        if (displayMetrics.widthPixels > SCREEN_WIDTH_PIXELS) {
            setContentView(R.layout.activity_main);
        } else {
            setContentView(R.layout.activity_main_small);
        }

        /*
        * Programmatically check API to change navigationBarColor
        * Used values-v21 folder with styles.xml to do this just with xml
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.DONUT) {
            getWindow().setNavigationBarColor(@ColorInt int color)
        }
        */
    }
}
