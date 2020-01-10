package com.example.jaison.ddecoder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity implements View.OnClickListener{
    private Button button4d;
    private Button button4e;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        button4d = (Button) findViewById(R.id.button4d);
        button4e = (Button) findViewById(R.id.button4e);
        button4d.setOnClickListener(this);
        button4e.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button4d) {
            openDecoder();
        }
        if (view.getId() == R.id.button4e) {
            openEncoder();
        }
    }


    public void openDecoder() {
        Intent intent = new Intent(this, MainDecoderActivity.class);
        startActivity(intent);


    }

    public void openEncoder() {
        Intent intent = new Intent(this, encode.class);
        startActivity(intent);


    }

}