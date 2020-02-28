package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class da extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_da);
    }
    public void mod2(View view){
        Intent unit2Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1BR4DqJJyPAnHOR1b-NeKXLXS6jd_k4oC"));
        startActivity(unit2Intent);
    }
}
