package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss);
    }
    public void Unit1(View view){
        Intent unit1Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1pPCjJjf5Ez7LA3NnU99xKh--HoH8eEdO"));
        startActivity(unit1Intent);
    }
    public void Unit2(View view){
        Intent unit2Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1LF_1OZPgsS6lGUrq7404ySBucE9FOgLb"));
        startActivity(unit2Intent);
    }
    public void Unit3(View view){
        Intent unit3Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=12cAPWuwOBMREbRouLgn_gpHvihN4R0Gy"));
        startActivity(unit3Intent);
    }
}
