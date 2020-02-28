package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class Page6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);
    }
    public void unit1(View view){
        Intent unit1Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1xUxZW03hO-huX7IBXuRoxUnMqznlUG3h"));
        startActivity(unit1Intent);
    }
    public void unit5(View view){
        Intent unit5Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1Q7A7K-ErNNGuF8A7c6v9sZZwJMgNHl4V"));
        startActivity(unit5Intent);
    }
    public void unit6(View view){
        Intent unit6Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1AoKLvSrCGqcxAWb5lgcPhwbM5TTjK97N"));
        startActivity(unit6Intent);
    }

}
