package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class Main5Activity extends AppCompatActivity {
    public Button btn;

    public void init(){
        btn = (Button)findViewById(R.id.MP);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(Main5Activity.this,Page6.class);

                startActivity(toy);
            }
        });
    }
    public void SS(){
        btn = (Button)findViewById(R.id.SS);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Sys = new Intent(Main5Activity.this,ss.class);

                startActivity(Sys);
            }
        });
    }
    public void OS(){
        btn = (Button)findViewById(R.id.os);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Osys = new Intent(Main5Activity.this,os.class);

                startActivity(Osys);
            }
        });
    }
    public void DC(){
        btn = (Button)findViewById(R.id.dc);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Dcm = new Intent(Main5Activity.this,dc.class);

                startActivity(Dcm);
            }
        });
    }
    public void DA(){
        btn = (Button)findViewById(R.id.da);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Dan = new Intent(Main5Activity.this,da.class);

                startActivity(Dan);
            }
        });
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        init();
        SS();
        OS();
        DC();
        DA();
    }
}
