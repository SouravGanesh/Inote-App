package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class os extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os);
    }
    public void uni1(View view){
        Intent unit1Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1r3YnxeuJFYSu1TNoiLZLwVbkqWnoqJd1"));
        startActivity(unit1Intent);
    }
    public void uni2(View view){
        Intent unit2Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1YRcys6yzNDVL4JQXwkYOHCDgOYhFB4Th"));
        startActivity(unit2Intent);
    }
    public void uni3(View view){
        Intent unit3Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1r3MHXI2peddrO1IlxrhRgsS3NF0SUfDD"));
        startActivity(unit3Intent);
    }
    public void uni4(View view){
        Intent unit4Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1fvmDJBd-G4He0AVBgEx_nqFp-IskUq9l"));
        startActivity(unit4Intent);
    }
    public void uni5(View view){
        Intent unit5Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=110hYEUHWmbmmLqo-ouHHj2bT2NO-Jxmx"));
        startActivity(unit5Intent);
    }
    public void uni6(View view){
        Intent unit6Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1hiXj1svzuW2Uzdr6K4_rvz8vGM6_9jYs"));
        startActivity(unit6Intent);
    }

}
