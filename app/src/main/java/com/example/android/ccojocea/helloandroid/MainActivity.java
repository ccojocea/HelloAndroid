package com.example.android.ccojocea.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
    * This should make web address clickable but fails miserably at this point.
    */
    public void openWebAddress(View view) {
        TextView webAddress = findViewById(R.id.web_address);
        webAddress.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
