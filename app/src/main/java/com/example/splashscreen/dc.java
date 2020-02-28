package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class dc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dc);
    }
    public void Uni1(View view){
        Intent unit1Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1vulOw3pgq5GaI5hAXbJeI2tile31LLEq"));
        startActivity(unit1Intent);
    }
    public void Uni2(View view){
        Intent unit2Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1Hs93D3i3-ISxdylEhb2lMuFe1N0ltnJx"));
        startActivity(unit2Intent);
    }
    public void Uni3(View view){
        Intent unit3Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1dJNP3VWhx0wwGQzr6dqYG0_Lsbli-bJ1"));
        startActivity(unit3Intent);
    }
    public void Uni4(View view){
        Intent unit4Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1YfmWCg7RzXIYdP6KBw6VzqjT69aZgsUP"));
        startActivity(unit4Intent);
    }
    public void Uni5(View view){
        Intent unit5Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1gcR2JbYA4ZfN8ryewY3o4j4o2pFib8UW"));
        startActivity(unit5Intent);
    }
    public void Uni6(View view){
        Intent unit6Intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1ZljCW961WoX8mwTQ9x8lME4NMc0Omw0S"));
        startActivity(unit6Intent);
    }
}
