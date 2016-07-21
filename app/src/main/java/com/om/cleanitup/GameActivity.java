package com.om.cleanitup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;


public class GameActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new SingleTouchEventView(this, null));


    }


}
