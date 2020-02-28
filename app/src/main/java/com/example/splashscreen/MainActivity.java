package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView cs,is;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cs= (CardView) findViewById(R.id.cs);
        is= (CardView) findViewById(R.id.is);

        cs.setOnClickListener(this);
        is.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
        case R.id.cs : i=new Intent(this,cs.class); startActivity(i);break;
            case R.id.is :i= new Intent(this,Main2Activity.class);startActivity(i);break;
            default:break;

    }
}}
