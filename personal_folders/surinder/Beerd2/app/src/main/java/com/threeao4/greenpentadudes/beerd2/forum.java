package com.threeao4.greenpentadudes.beerd2;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class forum extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_forum);

    }

    public void homepageButtonClick(View b) {
        if(b.getId() == R.id.homepagebutton) {
            finish();
        }
    }


}